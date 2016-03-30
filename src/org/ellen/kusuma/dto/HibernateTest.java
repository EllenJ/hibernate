package org.ellen.kusuma.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
//		user.setUserId(1);
		user.setUserName("First User");
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		
		Vehicle vehicle2=new Vehicle();
		vehicle2.setVehicleName("Jeep");
		
		user.getVehicle().add(vehicle);
		user.getVehicle().add(vehicle2);
//		vehicle.getUserList().add(user);
//		
//		vehicle2.getUserList().add(user);

//		user.setAddress("first user's address");
//		user.setJoinedDate(new Date());
//		user.setDescription("description of first user ");	
		
//		UserDetails user2=new UserDetails();
		
		Address addr = new Address();
		addr.setStreet("first street");
		addr.setCity("first city");
		addr.setState("first state");
		addr.setPincode("first pincode");
		
		Address addr1=new Address();

		addr1.setStreet("first street");
		addr1.setCity("first city");
		addr1.setState("first state");
		addr1.setPincode("first pincode");
//		
		
//		user.getListAddress().add(addr);
//		user.getListAddress().add(addr1);
		
//		addr.setStreet("street name");
//		addr.setCity("city name");
//		user.setHomeAddress(addr);
//		user.setOffAddr(addr1);
//		user2.setUserName("second user");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(user);
//		session.save(vehicle);
//		session.save(vehicle2);

//		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
//		user = null;
//		session = sessionFactory.openSession();
////		session.beginTransaction();
//		user = (UserDetails)session.get(UserDetails.class, 1);
//		session.close();
//		System.out.println(user.getListAddress().size());
		
//		System.out.println("user Name retrived is " + user.getListAddress());
//		System.out.println("user name retrieved is" +user.getUserName());

	    }
	}


