package br.ifce.edu.models;



import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "tbl_user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (nullable = false)
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Address> address = new ArrayList<Address>();

	@OneToMany(cascade=CascadeType.ALL)
	private Collection<Phone> phones = new ArrayList<Phone>();

	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="doc_id" , unique = true)
	private Document document;
	
	public Collection<Phone> getPhones() {
		return phones;
	}
	public void setPhones(Collection<Phone> phones) {
		this.phones = phones;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	
}
