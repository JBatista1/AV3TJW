package br.ifce.edu.code;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.EntityManager;

import br.ifce.edu.dao.UserDao;
import br.ifce.edu.models.Address;
import br.ifce.edu.models.Document;
import br.ifce.edu.models.Phone;
import br.ifce.edu.models.User;

public class TesteSave {
	public static void main(String[] args) {
		   UserDao service = new UserDao();
		   Address address = new Address();
		   Phone phone = new Phone();
		   Document document = new Document();
		   User user = new User();
		   
		   address.setNumero("303");
		   address.setBairro("Itaperi");

		   address.setCidade("fortaleza");
		   address.setEstado("Ceará");
		   address.setPais("Brasil");
		   address.setRua("pupunha");
		   
		   document.setCpf("06201054375");
		   document.setRg("2566895656568");
		   
		   phone.setTelefone("85987627225");
		   
		   user.setName("Juca");
		  
		   
		   service.salvar(user);
		   
		   
		   
	}
}
