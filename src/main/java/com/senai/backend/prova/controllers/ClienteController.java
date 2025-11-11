package com.senai.backend.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.prova.models.Cliente;
import com.senai.backend.prova.services.ClienteService;

@RestController
@RequestMapping("/cliente")

   
public class ClienteController {
   @Autowired
    private ClienteService cliService;
   

 @GetMapping("/teste")
    public String teste (){
      return "Roberto!";
   }

   @PostMapping("/salvar")
    public  Cliente salvar (@RequestBody Cliente cliente) {
      return cliService.salvar(cliente);
    }
   }

