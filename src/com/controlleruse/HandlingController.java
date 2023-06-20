package com.controlleruse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandlingController 
{
	@RequestMapping("/viewform")
	public String viewLoginForm()
	{
		return "LoginForm";
	}

}
