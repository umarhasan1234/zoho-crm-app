package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Billing;
import com.zohocrm.entity.Contact;
import com.zohocrm.services.BillService;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillService billService;
	
	@RequestMapping("/getBilling")
	public String getBill(@RequestParam("id") long id,ModelMap model) {
		Contact contact=contactService.getOneContactData(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
	}
	
	@RequestMapping("/billingPage")
	public String saveBill(@ModelAttribute("bill")Billing bill,ModelMap model) {
		billService.saveCustomerBill(bill);
		
		return "create_lead";
	}

}
