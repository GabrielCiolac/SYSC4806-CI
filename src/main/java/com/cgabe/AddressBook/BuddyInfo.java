package com.cgabe.AddressBook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class BuddyInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String phoneNumber;


    public BuddyInfo(){

    }
    public BuddyInfo(String name, String phoneNumber){
        this();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo(long id,String name){
        this();
        this.name = name;
        this.id = id;
    }
    public BuddyInfo(BuddyInfo old){
        this.name = old.getName();
        this.phoneNumber = old.getPhoneNumber();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BuddyInfo) {
            BuddyInfo tmp = (BuddyInfo) o;
            return tmp.getName().equals(this.getName()) && tmp.getPhoneNumber().equals(this.getPhoneNumber());
        }
        return false;
    }


    @Override
    public String toString(){
        return "Name: "+this.getName()+"\t Phone Number: "+this.getPhoneNumber();
    }
}
