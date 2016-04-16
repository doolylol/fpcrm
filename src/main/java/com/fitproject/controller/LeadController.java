package com.fitproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fitproject.domain.Lead;
import com.fitproject.service.LeadService;

@Controller
public class LeadController {
	
	private LeadService leadService;
	
	@Autowired
	public LeadController(LeadService leadService) {
		this.leadService = leadService;
	}
	
	@RequestMapping("/lead/new")
	public String create(Model model) {
		model.addAttribute("lead", new Lead());
		return "/lead/new";
	}
	
	@RequestMapping(value="/lead/save", method=RequestMethod.POST)
	public String save(Model model, Lead lead, RedirectAttributes redirectAttrs) {
		Lead savedLead = leadService.save(lead);
		redirectAttrs.addFlashAttribute("message", "Lead succesfully saved.");
		return "redirect:/lead/" + savedLead.getId();
	}
	
	@RequestMapping("/lead/{id}")
	public String view(Model model, @PathVariable Long id) {
		model.addAttribute("lead", leadService.findOne(id));
		return "/lead/view";
	}
	
	@RequestMapping(value="/lead/edit", method=RequestMethod.POST)
	public String edit(Lead lead, RedirectAttributes redirectAttrs) {
		Lead savedLead = leadService.save(lead);
		redirectAttrs.addFlashAttribute("message", "Lead succesfully edited.");
		return "redirect:/lead/" + savedLead.getId();
	}
	
	@RequestMapping("/lead/delete/{id}")
	public String delete(@PathVariable Long id, RedirectAttributes redirectAttrs) {
		leadService.delete(id);
		redirectAttrs.addFlashAttribute("message", "Lead succesfully deleted.");
		return "redirect:/";
	}

}
