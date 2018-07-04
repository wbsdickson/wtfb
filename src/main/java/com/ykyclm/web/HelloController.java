package com.ykyclm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@ResponseBody
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
    
	@ResponseBody
    @RequestMapping("/hello/yky")
    public String test() {
        return "This is created by yky!!";
    }
    
    
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");  //host <-- html variables
        return "index"; //route to html in ./templates
    }

}