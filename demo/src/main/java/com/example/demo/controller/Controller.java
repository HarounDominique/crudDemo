package com.example.demo.controller;

import com.example.demo.interfaceService.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {

    @Autowired
    private IPersonaService service;
    public String listar(Model model){
        service.listar();
        return "index";
    }
}
