package com.nsnieto.qualitysimmit.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nsnieto.qualitysimmit.models.Guest;
import com.nsnieto.qualitysimmit.repositories.GuestRepository;

@RestController
public class GuestController {


	    @Autowired
	    private GuestRepository guestRepository;

	    @GetMapping("/guest-list")
	    public List<Guest> getGuests() {
	        return guestRepository.findAll();
	    }
	    
	 
	    @PostMapping("/guest")
	    public Guest createQuestion(@Valid @RequestBody Guest question) {
	    	System.out.println(question);
	        return guestRepository.save(question);
	    }
	
}

