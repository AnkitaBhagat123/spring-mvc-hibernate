package com.employeeManagement.spring.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employeeManagement.spring.model.Login;
import com.employeeManagement.spring.model.Registration;
import com.employeeManagement.spring.service.LoginService;
import com.employeeManagement.spring.service.RegistrationService;

@Controller
public class RegistrationController {
	private static final CharSequence string = null;
	@Autowired RegistrationService registrationService;
	@Autowired LoginService loginService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Locale locale, Model model) {
		
		return "register";
	}
	
	
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String registration(@Validated Registration registration, Model model) {
		/*
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy",
		 * Locale.ENGLISH); LocalDate date = LocalDate.parse(string, formatter);
		 */
	
		/*
		 * DateFormat dateformat1=new SimpleDateFormat("yyyy/MM/dd"); String
		 * formattedDate = dateformat1.parse(formattedDate));
		 */
		System.out.println("Registration Page Requested");
		model.addAttribute("regObj", registration);
		
		
		registrationService.addRegister(registration);
		return "result";
	}

		
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Locale locale, Model model)
	{
		return "login";
	}
	@RequestMapping(value="/verifylogin" ,method=RequestMethod.POST)
	public ModelAndView login(@Validated Registration login,Model model)
	{
		
		
		
		System.out.println("Login Page Requested");
		model.addAttribute("logObj", login);
		String userName = loginService.addLogin(login);
		//String password=loginService.addLogin(login);
		if(null != userName) {
			model.addAttribute("userName",login.getUserName());
			model.addAttribute("password", login.getPassword());
//			loginService.addLogin(login);
			
			return new ModelAndView( "sucess");
		}else {
			
			
			return new ModelAndView( "error");
		}
			
		
		@RequestMapping(value="/registrationreport", method=RequestMethod.GET)
		public String getAllReg(Locale locale, Model model)
	}
	@RequestMapping(value = "/editregistration", method = RequestMethod.GET)
	public String editregistration(Locale locale, Model model) {
		
		return "register";
	}
	
	
	

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editregistration(@Validated Registration registration, Model model) {
		System.out.println("Registration Page Requested");
		model.addAttribute("regObj", registration);
		
		
		registrationService.addRegister(registration);
		return "result";
		
	}
	
}
