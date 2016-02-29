package com.fitproject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fitproject.domain.Lead;
import com.fitproject.repository.LeadRepository;

public class LeadService {

	private LeadRepository leadRepository;
	
	@Autowired
	public LeadService(LeadRepository leadRepository) {
		this.leadRepository = leadRepository;
	}
	
	public Iterable<Lead> findAll() {
		return leadRepository.findAll();
	}
	
	public Lead findOne(Long id) {
		return leadRepository.findOne(id);
	}
}
