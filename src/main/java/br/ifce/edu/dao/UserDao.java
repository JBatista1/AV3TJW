package br.ifce.edu.dao;

import br.ifce.edu.models.User;

public class UserDao extends GenericDao<User> {

	public UserDao() {
		super(User.class);
	}

}
