package com.cgabe.AddressBook;

import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies = new ArrayList<BuddyInfo>();
    }


    public void add(String name,String phoneNumber){
        BuddyInfo tmp = new BuddyInfo(name,phoneNumber);
        this.buddies.add(tmp);
    }

    public Long getId(){
        return id;
    }
    public BuddyInfo get(int index){
        return new BuddyInfo(this.buddies.get(index));
    }

    public BuddyInfo peek(){
        return new BuddyInfo(this.get(0));
    }

    public BuddyInfo pop(){
        return this.buddies.remove(0);
    }
    public BuddyInfo remove(int index){
        return this.buddies.remove(index);
    }


    public List<BuddyInfo> getBuddies(){
        return buddies;
    }

    public void setBuddy(List<BuddyInfo> buddies){
        this.buddies = buddies;
    }

    public int size(){
        return this.buddies.size();
    }

    @Override
    public String toString(){
        String s = "";
        for(BuddyInfo i: this.buddies)
            s += i.toString() +"\n";
        return s;
    }


    public void setId(Long id) {
    }
}
