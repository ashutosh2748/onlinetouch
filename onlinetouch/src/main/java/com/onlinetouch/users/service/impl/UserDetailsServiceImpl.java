package com.onlinetouch.users.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.onlinetouch.users.entity.UserRoles;
import com.onlinetouch.users.entity.WebUser;
import com.onlinetouch.users.repository.WebUserRepository;

//CustomUserDetailsService
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private WebUserRepository webUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try{
			WebUser user = webUserRepository.findByUserName(username);
			if(user == null){
				return null;
				
			}
			return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
		}catch (Exception e){
            throw new UsernameNotFoundException("User not found");
        }
	}
	
	private Set<GrantedAuthority> getAuthorities(WebUser user){
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for(UserRoles role : user.getRoles()) {
            //GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
        	GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole().toString());
            authorities.add(grantedAuthority);
        }
        
        return authorities;
    }
	
}
