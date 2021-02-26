package com.cgabe.AddressBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class AddressBookController{

    private final AddressBookService service;

    public AddressBookController(AddressBookService service){
        this.service = service;
    }

    @GetMapping(path="/submit")
    public String addBuddy(@RequestParam(name="name") String name, @RequestParam(name="phoneNumber") String phone){
        AddressBook book = service.findById(1L);

        if(book != null){
            book.add(name,phone);
            service.save(book);
            return "add";
        }

        AddressBook newBook = new AddressBook();
        newBook.add(name,phone);
        service.save(newBook);
        return "add";
    }

    @GetMapping(path = "/add")
    public String getBuddies(Model model){
        AddressBook book = service.findById(1L);
        if(book != null)
            model.addAttribute("addressbook",book.toString());
        else
            model.addAttribute("addressbook","no friends here :(");
        return "buddies";

    }



}
