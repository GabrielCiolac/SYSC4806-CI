package com.cgabe.AddressBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookApplication {

    /**
     * I have a presentation I need to prepare for immediately after this lab, so did not complete
     * Will finish over weekend
     *
     * Currently not generating a ThymeLeaf demo,
     *
     * Also I need to figure out how to post to the Repo a BuddyInfo object,
     * I suspect I need to pass a BuddyInfo JSON, after that it would be some simple templating to print
     * the toString of the AddressBook
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(AddressBookApplication.class,args);
    }
}
