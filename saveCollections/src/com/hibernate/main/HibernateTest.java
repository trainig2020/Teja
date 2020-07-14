package com.hibernate.main;




import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Address;
import com.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserName("firs user");
		
		Address addr1=new Address();
		addr1.setCity("tirupati");
		addr1.setPincode("517643");
		addr1.setState("ap");
		addr1.setStreet("gandhi");
		

		Address addr2=new Address();
		addr2.setCity("hyd");
		addr2.setPincode("517566");
		addr2.setState("ts");
		addr2.setStreet("nehru");
		
		user.getListofAddr().add(addr1);
		user.getListofAddr().add(addr2);
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.getTransaction().commit();
		

	session.close();
	
	user=null;
	session=sf.openSession();
user=(UserDetails)	session.get(UserDetails.class, 1);
session.close();
user.getListofAddr().size();

	

}
}