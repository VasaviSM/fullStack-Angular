package com.pack.coll;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int stid;
    private String stname;

    @ElementCollection
    //private List<StockDetails> stockdetail=new ArrayList<StockDetails>();
    private Set<StockDetails> stockdetail = new HashSet<>();

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    /*public List<StockDetails> getStockdetail() {
        return stockdetail;
    }

    public void setStockdetail(List<StockDetails> stockdetail) {
        this.stockdetail = stockdetail;
    }*/

    public Set<StockDetails> getStockdetail() {
        return stockdetail;
    }

    public void setStockdetail(Set<StockDetails> stockdetail) {
        this.stockdetail = stockdetail;
    }
}