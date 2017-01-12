package com.ram.releasetestwar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping(value = "/api")
public class AppController {

	@RequestMapping(value = "/helloWorld", method=RequestMethod.GET)
	public String helloWorld(HttpServletRequest request, HttpServletResponse response){
		
		return "Hello World";
	}
	
}
