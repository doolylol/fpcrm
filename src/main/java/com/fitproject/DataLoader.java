package com.fitproject;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fitproject.domain.Lead;
import com.fitproject.repository.LeadRepository;

@Component
public class DataLoader {
	
	private LeadRepository leadRepo;
	
	@Autowired
	public DataLoader(LeadRepository leadRepo) {
		this.leadRepo = leadRepo;
	}
	
	@PostConstruct
	public void load() {
		leadRepo.deleteAll();
		createLeads();
	}
	
	public void createLeads() {
		Lead lead1 = new Lead();
		lead1.setDate(new Date());
		lead1.setDescription("Lose weight and fast!");
		lead1.setLeadId(1122);
		lead1.setName("Peter Malkovich");
		leadRepo.save(lead1);
		
		Lead lead2 = new Lead();
		lead2.setDate(new Date());
		lead2.setDescription("Gain tons of muscle");
		lead2.setLeadId(1123);
		lead2.setName("Johayn Mahayn");
		leadRepo.save(lead2);
		
		Lead lead3 = new Lead();
		lead3.setDate(new Date());
		lead3.setDescription("Lose weight and feel good.");
		lead3.setLeadId(1122);
		lead3.setName("Connie Connerson");
		leadRepo.save(lead3);
	}

}
