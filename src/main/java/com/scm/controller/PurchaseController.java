package com.scm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scm.service.ScmProductInfoService;

@Controller
@RequestMapping(value="/purchase")
public class PurchaseController {
	
	@Autowired
	private ScmProductInfoService scmProductInfoService;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listPurchase(Model model){
		return "purchase/list";
	}
}
