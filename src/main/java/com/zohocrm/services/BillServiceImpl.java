package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Billing;
import com.zohocrm.repositories.BillingRepository;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillingRepository billrepo;
	
	@Override
	public void saveCustomerBill(Billing bill) {
		billrepo.save(bill);
		
	}

}
