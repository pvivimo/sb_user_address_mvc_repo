package pv.sb_user_addresses_mvc.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import pv.sb_user_addresses_mvc.model.User;

@Repository
public class Database {
	
	private SessionFactory sessionFactory;
	
	public Database() {
		
		Configuration config = new Configuration();
		config.configure();
		
		sessionFactory = config.buildSessionFactory();
	}
	
	public User getUserById(int userId) {
		
		User user = null; //létrehozzuk a Userünket
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		user = session.get(User.class, userId);
		
		tx.commit();
		session.close();
		
		System.out.println(user);
		
		return user;
		
	}

}
