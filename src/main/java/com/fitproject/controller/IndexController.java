package com.fitproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitproject.service.LeadService;

@Controller
public class IndexController {
	
	private LeadService leadService;
	
	@Autowired
	public IndexController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("leads", leadService.findAll());
		return "index";
	}

}
