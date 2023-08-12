package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contserv;
	
	
	
	@RequestMapping("/listContacts")
	public String listContacts(ModelMap model) {
		List<Contact> contacts=contserv.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
	}
	@RequestMapping("/getContact")
	public String getOneLead(@RequestParam("id")long id,ModelMap model) {
		Contact contact=contserv.getOneContactData(id);
		model.addAttribute("contact",contact);
		return "contact_info";
	}

}
