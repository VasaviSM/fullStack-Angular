package com.lms.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeDetails {

    private int id;
    private String name;
    private String address;
    private double salary;

    public EmployeeDetails() { }

    public EmployeeDetails(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +'\''+
                '}' +'\'';
    }

}
public class Employee {

    public static void main(String[] args) {
        List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();

        empList.add(new EmployeeDetails(101,"Aryan","Delhi",50000));
        empList.add(new EmployeeDetails(102,"Rakshith","Mumbai",100500));
        empList.add(new EmployeeDetails(103,"Bean","Delhi",155000));
        empList.add(new EmployeeDetails(104,"Karthik","Bangalore",45000));
        empList.add(new EmployeeDetails(105,"Shivam","Chennai",100000));

        System.out.println("\nSorted by salary and name :");
        Collections.sort(empList, (e1,e2) ->
                (e1.getSalary()!=e2.getSalary()) ? (int) (e1.getSalary() - e2.getSalary()) : e1.getName().compareTo(e2.getName()));
        empList.forEach(emp -> System.out.println(emp));


    }
}

