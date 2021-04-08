package br.ifce.edu.code;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("TTT");
	public static EntityManager getEntityManager() {
		System.out.println("CREATE");
		return factory.createEntityManager();
	}
	
	public static void closeEntityManager() {
		System.out.println("Close");
		factory.close();
	}
}
