package com.onlinetouch.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = {"","/","/home","/welcome"}, method = RequestMethod.GET)
    public String home(){
		return "../index";
    }
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model, Principal principal) {
		if(principal != null)
			model.addAttribute("user", principal.getName());
		else
			model.addAttribute("user", "Guest");
        return "accessDenied";
    }
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminDashboard(Principal principal){
		if(principal != null)
			return "admin/index";
		else
			return "login";
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public String customerDashboard(Principal principal){
		if(principal != null){
			//if(principal.getName() != null)
			return "customer/index";
		}else
			return "login";
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public String inventoryDashboard(Principal principal){
		if(principal != null){
			//if(principal.getName() != null)
			return "inventory/index";
		}else
			return "login";
	}
	
//	private String getPrincipal(){
//        String userName = null;
//        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
// 
//        if (principal instanceof UserDetails) {
//            userName = ((UserDetails)principal).getUsername();
//        } else {
//            userName = principal.toString();
//        }
//        System.out.println("USER: "+userName);
//        return userName;
//    }
	
	/* NOTE......
	 * Spring Boot which uses Spring Security internally provides a SecurityContextHolder class which allows the lookup of the currently authenticated user via:

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		The authentication instance now provides the following methods:
		
		Get the username of the logged in user: getPrincipal()
		Get the password of the authenticated user: getCredentials()
		Get the assigned roles of the authenticated user: getAuthorities()
		Get further details of the authenticated user: getDetails()
		*/
}
