package com.onlinetouch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"","/"})
public class Home {
	@RequestMapping("")
    public String home(){
        return "Hello :: This is onlinetouch home";
    }
}
