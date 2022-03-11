package com.pack.course;

import com.pack.jpa.Course;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MainCourse {
    private static final EntityManagerFactory emfo;
    private static final String PERSISTENCE_UNIT_NAME = "Course";

    static {
        emfo = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
    public static EntityManager getEntityManager() {
        return emfo.createEntityManager();
    }

    public static void main(String[] args) {
        EntityManager entityMgr = getEntityManager();
        entityMgr.getTransaction().begin();
        Course cou = new Course();
        cou.setCid(100);
        cou.setCname("Rohith");
        cou.setPrice(250.00);
        entityMgr.persist(cou);

        entityMgr.getTransaction().commit();

        entityMgr.clear();

        System.out.println("Record inserted successfully");
    }
}