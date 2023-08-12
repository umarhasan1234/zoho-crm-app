package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contserv;
	
		@RequestMapping("/createLeadPage")
		public String createLeadData() {
			return "create_lead";
		}
		
		@RequestMapping("/")
		public String defaultMethod() {
			return "create_lead";
		}
		@RequestMapping("/save")
		public String saveOneLeadData(@ModelAttribute("abcd") Lead le, ModelMap model) {
			leadService.saveLead(le);
			model.addAttribute("lead",le);
			return "lead_info";
		}
		@RequestMapping("/composeEmail")
		public String composeEmail(@RequestParam("email") String email, ModelMap model) {
			model.addAttribute("email",email);
			return "compose_email";
			
		}
		@RequestMapping("/convertLead")
		public String convertLead(@RequestParam("id") long id  ,ModelMap model) {
			Lead lead = leadService.getOneLeadData(id);
			
			Contact contact=new Contact();
			contact.setFirstName(lead.getFirstName());
			contact.setLastName(lead.getLastName());
			contact.setEmail(lead.getEmail());
			contact.setMobile(lead.getMobile());
			contact.setSource(lead.getSource());
			
			contserv.saveOneContact(contact);
			
			leadService.deleteOneLead(lead.getId());
			List<Contact> contacts=contserv.getAllContacts();
			model.addAttribute("contacts",contacts);
			return "list_contacts";
			
			
		}
		@RequestMapping("/listall")
		public String getAllLeads(ModelMap model) {
			List<Lead> leads=leadService.listLeads();
			model.addAttribute("leads",leads);
			return "list_leads";
		}
		@RequestMapping("/getLead")
		public String getOneLead(@RequestParam("id")long id,ModelMap model) {
			Lead lead=leadService.getOneLeadData(id);
			model.addAttribute("lead",lead);
			return "lead_info";
		}
}
