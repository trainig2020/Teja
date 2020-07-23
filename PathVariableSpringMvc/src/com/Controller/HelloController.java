package com.Controller;



import java.util.Map;

import javax.activation.MailcapCommandMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	protected ModelAndView helloWorld(@PathVariable Map<String,String> pathVars){
		String name=pathVars.get("userName");
		String countryName=pathVars.get("countryName");
		ModelAndView modelAndView =new ModelAndView("HelloPage");
		 modelAndView.addObject("msg","hello " +name+","+countryName);
		return modelAndView;
	}
	
}
