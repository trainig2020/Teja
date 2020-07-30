package com.SpringSecurityJDBC;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeResource {
	
	@GetMapping("/")
  public String home() {
		return ("<h1>hello springboot</h1>");
	}
	
	@GetMapping("/user")
	  public String user() {
			return ("<h1>hello user</h1>");
		}
		
	
	@GetMapping("/admin")
	  public String admin() {
			return ("<h1>hello ADMIN</h1>");
		}
		
	

}
