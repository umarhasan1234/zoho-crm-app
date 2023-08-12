package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface LeadService {
	public void saveLead(Lead le);

	public Lead getOneLeadData(long id);

	public void deleteOneLead(long id);

	public List<Lead> listLeads();

}
