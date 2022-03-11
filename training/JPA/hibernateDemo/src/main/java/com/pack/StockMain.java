package com.pack;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pack.coll.Stock;
import com.pack.coll.StockDetails;

import java.util.List;

public class StockMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EntityManagerFactory emr = Persistence.createEntityManagerFactory("stockcollection");
        EntityManager em = emr.createEntityManager();
        em.getTransaction().begin();

        StockDetails sd1 = new StockDetails();

        sd1.setStockname("Foot Ball");
        sd1.setDescription("FootBall");
        sd1.setDate("3rdApril2021");

        StockDetails sd2 = new StockDetails();

        sd2.setStockname("Shirts");
        sd2.setDescription("Shirts");
        sd2.setDate("22ndJune2020");

        Stock s1 = new Stock();
        s1.setStid(1205);
        s1.setStname("Sports");
        s1.getStockdetail().add(sd1);

        Stock s2 = new Stock();
        s2.setStid(1206);
        s2.setStname("Clothes");
        s2.getStockdetail().add(sd2);

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();
        em.close();
        emr.close();

    }

}
