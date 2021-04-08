package br.ifce.edu.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import br.ifce.edu.dao.UserDao;
import br.ifce.edu.models.Address;
import br.ifce.edu.models.Document;
import br.ifce.edu.models.Phone;
import br.ifce.edu.models.User;

@ManagedBean
@ViewScoped
public class HomeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Collection<Phone> phones;
	private Collection<Address> address;
	private Address uniqueAddress;
	private User user;
	private Document document;
	private UserDao service;
	private Phone phone = new Phone();
	private String idDelete;
	private String idFind;
	
	
	@PostConstruct
	private void init() {
		user = new User();
		phones = user.getPhones();
		address = user.getAddress();
		document = new Document();
		service = new UserDao();
		uniqueAddress = new Address();
		idDelete = "";
		idFind = "";
	}

	public void salvar() {
		validAddressPhone();
		user.setPhones(phones);
		user.setDocument(document);
		user.setAddress(address);
		service.salvar(user);
		init();
	
	}
	
	public void consultaPorID() {
		Long id = Long.parseLong(idFind);
		user = service.getById(id);
		System.out.println(user.getName());
		Optional<Phone> safePhone = user.getPhones().stream().findFirst();
		if (safePhone.isPresent()) {
		    phone = safePhone.get();
		}
		
		Optional<Address> safeAddress = user.getAddress().stream().findFirst();
		if (safeAddress.isPresent()) {
			uniqueAddress = safeAddress.get();
		}
		document = user.getDocument();
	}
	
	public void excluir() {
		Long id = Long.parseLong(idDelete);
		service.excluir(id);
	}
	
	public void addPhone() {
		phones.add(phone);
		phone = new Phone();
		
	}
	public void addAddress() {
		address.add(uniqueAddress);
		uniqueAddress = new Address();
	}
	
	public Collection<Phone> getPhones() {
		return phones;
	}
	
	public void validAddressPhone() {
		if (phones.size() == 0) {
			addPhone();
		}
		if (address.size() == 0) {
			addAddress();
		}
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public UserDao getService() {
		return service;
	}

	public void setService(UserDao service) {
		this.service = service;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Address getUniqueAddress() {
		return uniqueAddress;
	}

	public void setUniqueAddress(Address uniqueAddress) {
		this.uniqueAddress = uniqueAddress;
	}

	public String getIdDelete() {
		return idDelete;
	}

	public void setIdDelete(String idDelete) {
		this.idDelete = idDelete;
	}

	public String getIdFind() {
		return idFind;
	}

	public void setIdFind(String idFind) {
		this.idFind = idFind;
	}
    
}
