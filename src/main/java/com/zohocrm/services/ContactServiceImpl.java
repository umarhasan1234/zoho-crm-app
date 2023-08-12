package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Contact;
import com.zohocrm.repositories.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contrepo;
	
	@Override
	public void saveOneContact(Contact contact) {
		contrepo.save(contact);

	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contrepo.findAll();
		return contacts;
	}

	@Override
	public Contact getOneContactData(long id) {
		Optional<Contact> findById = contrepo.findById(id);
		Contact contact=findById.get();
		return contact;
	}

	@Override
	public Contact getCotactBill() {
		
		return null;
	}

}
