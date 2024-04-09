package edu.iu.pupatil.historyservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class PrimesRecord {
    @Id
    @GeneratedValue
    private int id;
    private String customer;
    private String n;
    private boolean isPrime;

    public int getId(){ return id;}

    public void setCustomer(String customer){ this.customer=customer;}
    public void setN(String n){ this.n=n;}
    public void setIsPrime(boolean isPrime){ this.isPrime=isPrime;}


}