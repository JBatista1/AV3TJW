package br.ifce.edu.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_address")
public class Address {
	@Id
	@GeneratedValue
	private Long id;

	@Column (name = "street", nullable = false)
	private String rua;
	
	@Column (name = "district", nullable = false)
	private String bairro;
	
	@Column (name = "city", nullable = false)
	private String cidade;
	
	@Column (name = "state", nullable = false)
	private String estado;
	
	@Column (name = "zipCode", nullable = false)
	private String cep;
	
	@Column (name = "country", nullable = false)
	private String pais;
	
	@Column (name = "number", nullable = false)
	private String numero;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
