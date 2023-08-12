package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadrepo;

	@Override
	public void saveLead(Lead le) {
		leadrepo.save(le);
	}

	@Override
	public Lead getOneLeadData(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteOneLead(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listLeads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
