package com.scm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.common.CommonPage;
import com.scm.model.ScmProductInfo;
import com.scm.service.ScmProductInfoService;

@Controller
@RequestMapping(value="/product")
public class ProductController extends BaseController{
	
	@Autowired
	private ScmProductInfoService scmProductInfoService;

	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listProduct(@RequestParam(name="pageNum",required=false) Integer pageNum,@RequestParam(name="pageSize",required=false) Integer pageSize,Model model){
		CommonPage page = wrapePage(pageNum, pageSize);
		List<ScmProductInfo> list = scmProductInfoService.getAllProductsByPage(page.getPageNum(), page.getPageSize());
		for(ScmProductInfo prod:list){
			System.out.println(prod.getProdName());
		}
		return "product/list";
	}
}
