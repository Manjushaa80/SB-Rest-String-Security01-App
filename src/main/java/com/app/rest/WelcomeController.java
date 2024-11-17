package com.app.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping(value = "/welcome")
	public String welcomePage()
	{
		String msg= "Welcome page Called";
		return msg;
		
	}
	
	@RequestMapping(value = "/home")
	public String HomePage()
	{
		String msg= "Home page Called";
		return msg;
		
	}
	@RequestMapping(value = "/student")
	public String StudentPage()
	{
		String msg= "Student page Called";
		return msg;
		
	}
	@RequestMapping(value = "/Employee")
	public String Employee()
	{
		String msg= "Employee page Called";
		return msg;
		
	}
	@RequestMapping(value = "/admin")
	public String AdminPage()
	{
		String msg= "Admin page Called";
		return msg;
		
	}

}
