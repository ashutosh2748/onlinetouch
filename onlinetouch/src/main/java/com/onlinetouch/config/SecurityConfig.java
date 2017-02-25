package com.onlinetouch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.onlinetouch.security.MyAuthenticationSuccessHandler;
import com.onlinetouch.users.service.impl.WebUserServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	//@Autowired private DataSource dataSource;
	//@Autowired private WebUserRepository webUserRepository;
	
	@Autowired
	@Qualifier("userServiceImpl")// by name
	UserDetailsService userDetailsService;
	
	@Autowired
	MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
	
	@Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
        auth.authenticationProvider(authenticationProvider());
    }
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setUserDetailsService(userDetailsService);
        authenticationProvider.setPasswordEncoder(passwordEncoder());
        return authenticationProvider;
    }
	
	@Bean
	public MyAuthenticationSuccessHandler myAuthenticationSuccessHandler(){
		return new MyAuthenticationSuccessHandler();
	}
	
	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return new WebUserServiceImpl();//UserDetailsServiceImpl();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/", "/home", "/welcome").permitAll()
//			.anyRequest().authenticated()
			//.antMatchers("/login", "/admin", "/inventory", "/customer").anonymous()
			.antMatchers("/admin", "/admin/**").access("hasRole('ROLE_ADMIN')")
			.antMatchers("/inventory", "/inventory/**").access("hasRole('ROLE_INVENTORY_MANAGER')")
			.antMatchers("/customer", "/customer/**").access("hasRole('ROLE_CUSTOMER')")
		.and()
			.formLogin()
			.loginPage("/login")
			.successHandler(myAuthenticationSuccessHandler)
			.failureUrl("/login?error")
		.and()
			.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/login?logout")
		.and()
			.exceptionHandling().accessDeniedPage("/Access_Denied")
		.and()
			.csrf().disable();
	}
	
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication().dataSource(dataSource)
//			.usersByUsernameQuery("select user_name, password, enabled from web_user where user_name=?")
//			.authoritiesByUsernameQuery("select user_name, role from user_roles where web_user_id=?");
//	}
}
