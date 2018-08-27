package com.ykyclm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	

	@RequestMapping("/")  //for redirect to page
	public String index() {
	  return "index.html";
	}
	
	@RequestMapping("/cards")
    public String cards(ModelMap map) {
        map.addAttribute("home", "This is the example from YKY!!! ^^");  //host <-- html variables
        return "cards"; //route to html in ./templates
    }
	
	@RequestMapping("/charts")  //for redirect to page
	public String charts() {
	  return "charts.html";
	}
	
	@RequestMapping("/login")  //for redirect to page
	public String login() {
	  return "login.html";
	}
	
	@RequestMapping("/register")  //for redirect to page
	public String register() {
	  return "register.html";
	}
	
	@RequestMapping("/tables")  //for redirect to page
	public String tables() {
	  return "tables.html";
	}


    
    

}