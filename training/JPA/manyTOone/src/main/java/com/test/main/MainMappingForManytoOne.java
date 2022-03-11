package com.test.main;

import com.test.model.UserDetails;
import com.test.model.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainMappingForManytoOne {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        UserDetails user = new UserDetails(); //create an user entity
        Vehicle vehicle = new Vehicle(); //create a vehicle entity
        Vehicle vehicle2 = new Vehicle(); //create second vehicle entity
        vehicle.setVehicleName("Jaguar Car"); //set BMW car
        vehicle.setUser(user); //set user for that car
        vehicle2.setVehicleName("Benz Car"); //set second car Audi
        vehicle2.setUser(user);//set user for that car
        user.setUserName("Sura"); //set user property
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //create the session factory object
        Session session = sessionFactory.openSession(); //create the session object
        session.beginTransaction(); //create the transaction object
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user);
        session.getTransaction().commit();
        System.out.println("Inserting values into tables UserDetails,Vehicle details....");

        System.out.println("Done");
        session.close();
    }
}