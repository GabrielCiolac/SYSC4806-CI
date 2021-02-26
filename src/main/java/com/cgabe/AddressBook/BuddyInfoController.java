package com.cgabe.AddressBook;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuddyInfoController {
    private final AddressBookService service;

    public BuddyInfoController(AddressBookService service){
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/addBuddy")
    public BuddyInfo info(@RequestParam(name="name") String name, @RequestParam(name="phoneNumber") String phone){
        AddressBook book = service.findById(1L);

        if(book == null)
            book = new AddressBook();

        book.add(name, phone);
        service.save(book);

        return new BuddyInfo(name,phone);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getBuddy")
    public BuddyInfo info(){
        AddressBook book = service.findById(1L);

        if(book == null)
            return new BuddyInfo("None","None");
        return new BuddyInfo(book.get(0));
    }




}
