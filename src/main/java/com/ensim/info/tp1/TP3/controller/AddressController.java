package com.ensim.info.tp1.TP3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ensim.info.tp1.TP3.model.AddressRepository;

@Controller
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/addresses")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresses";
    }
}
