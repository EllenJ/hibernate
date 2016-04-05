package org.ellen.kusuma.dto;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
		UserDetails user=new UserDetails();
		user.setUserName("user" +i);
		}
//		Vehicle vehicle=new Vehicle();
//		vehicle.setVehicleName("Car");
//		
//		TwoWheelar bike=new TwoWheelar();
//		bike.setVehicleName("bike");
//		bike.setSteeringHandle("bike steering");
//		
//		FourWheeler car=new FourWheeler();
//		car.setVehicleName("car");
//		car.setSteeringwheels("car steering wheels");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		for(int i=0;i<10;i++){
//			UserDetails user=new UserDetails();
//			user.setUserName("user" +i);
//			session.persist(user);
//
//			}
//		session.save(vehicle);
//		session.save(bike);
//		session.save(car);
		
		UserDetails user = (UserDetails) session.get(UserDetails.class,5);
		user.setUserName("update user");
		session.update(user);
//		session.delete(user);
	

		session.getTransaction().commit();
		session.close();
		System.out.println("user name pulled upnis :" +user.getUserName());
		


	    }
	}


