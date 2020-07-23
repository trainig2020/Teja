package com.Controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	protected ModelAndView helloWorld(){
		ModelAndView modelAndView =new ModelAndView("HelloPage");
		 modelAndView.addObject("msg","hello World");
		return modelAndView;
	}
	@RequestMapping("/hi")
	protected ModelAndView hiWorld(){
		ModelAndView modelAndView =new ModelAndView("HelloPage");
		 modelAndView.addObject("msg","hi World");
		return modelAndView;
	}

}
