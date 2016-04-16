package com.fitproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitproject.domain.Lead;
import com.fitproject.repository.LeadRepository;

@Service
public class LeadService {

	private LeadRepository leadRepository;
	
	@Autowired
	public LeadService(LeadRepository leadRepository) {
		this.leadRepository = leadRepository;
	}
	
	public Iterable<Lead> findAll() {
		return leadRepository.findAll();
	}
	
	public Iterable<Lead> findAllByDate() {
		return leadRepository.findAllByOrderByDateDesc();
	}
	
	public Lead findOne(Long id) {
		return leadRepository.findOne(id);
	}
	
	public Lead save(Lead lead) {
		return leadRepository.save(lead);
	}
	
	public void delete(Long id) {
		leadRepository.delete(id);
	}
}
