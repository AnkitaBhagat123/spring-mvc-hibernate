package com.employeeManagement.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.employeeManagement.spring.model.Registration;
import com.employeeManagement.spring.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired RegistrationService registrationService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Locale locale, Model model) {
		return "register";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String user(@Validated Registration registration, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("regObj", registration);
		
		
		registrationService.addRegister(registration);
		return "result";
	}
}
