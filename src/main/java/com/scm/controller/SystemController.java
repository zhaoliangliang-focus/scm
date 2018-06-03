package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SystemController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String init(Model model){
		System.out.println("comming index!");
		return "index";
	}
}
