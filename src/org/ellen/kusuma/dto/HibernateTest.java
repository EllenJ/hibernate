package org.ellen.kusuma.dto;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheelar bike=new TwoWheelar();
		bike.setVehicleName("bike");
		bike.setSteeringHandle("bike steering");
		
		FourWheeler car=new FourWheeler();
		car.setVehicleName("car");
		car.setSteeringwheels("car steering wheels");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
//		session.persist(user);
		session.save(vehicle);
		session.save(bike);
		session.save(car);

		session.getTransaction().commit();
		session.close();
		


	    }
	}


