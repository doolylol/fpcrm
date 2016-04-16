package com.fitproject.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Lead {
	
	@Id @GeneratedValue
	private Long id;
	
	private int leadId;
	private String name;
	private String description;
	
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date date;
	
	public Lead() {
		
	}
	
	public Lead(Long id, int leadId, String name, String description, Date date) {
		super();
		this.id = id;
		this.leadId = leadId;
		this.name = name;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getLeadId() {
		return leadId;
	}
	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
