package com.fitproject.repository;

import org.springframework.data.repository.CrudRepository;

import com.fitproject.domain.Lead;

public interface LeadRepository extends CrudRepository<Lead, Long> {

}
