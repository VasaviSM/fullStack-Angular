package com.pack.mainapp;

import com.pack.jpa.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;


public class mainApp {

    private static final EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNIT_NAME = "employee";

    static {
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    // This Method Is Used To Retrieve The 'EntityManager' Object
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }

    public static void main(String[] args) {


        EntityManager entityMgr = getEntityManager();
        entityMgr.getTransaction().begin();

        Employee emp = new Employee();
        emp.setEid(1014);
        emp.setEname("Satya");
        emp.setEmail("sa@gmail.com");
        emp.setDept("r&d");
        entityMgr.persist(emp);

        entityMgr.getTransaction().commit();

        entityMgr.clear();
        System.out.println("Record Successfully Inserted In The Database");

        Query q = entityMgr.createNativeQuery("SELECT e.eid, e.ename,e.email,e.dept FROM employee e",Employee.class);
        @SuppressWarnings("unchecked")
        List<Employee> employees =(List<Employee>) q.getResultList();

        for(Employee e: employees) {
            System.out.println(e.getEid()+ " " +e.getEname()+ " " +e.getEmail()+ " " +e.getDept());
        }

    }
}