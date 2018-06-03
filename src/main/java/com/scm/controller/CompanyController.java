package com.scm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.common.CommonPage;
import com.scm.model.ScmCompanyInfo;
import com.scm.model.ScmProductInfo;
import com.scm.service.ScmCompanyInfoService;

@Controller	
@RequestMapping(value="/company")
public class CompanyController extends BaseController{
	
	@Autowired
	private ScmCompanyInfoService scmCompanyInfoService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listCompany(@RequestParam(name="pageNum",required=false) Integer pageNum,@RequestParam(name="pageSize",required=false) Integer pageSize,Model model){
		System.out.println("CompanyController.listCompany() pageNum:"+pageNum+"pageSize:"+pageSize);
		CommonPage page = wrapePage(pageNum, pageSize);
		List<ScmCompanyInfo> list = scmCompanyInfoService.getAllCompanysByPage(page.getPageNum(), page.getPageSize());
		for(ScmCompanyInfo company:list){
			System.out.println(company.getComName());
		}
		model.addAttribute("list", list);
		return "company/list";
	}
	
}
