package com.senai.backend.prova.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.backend.prova.models.Carro;
import com.senai.backend.prova.services.CarroService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/carro")

public class CarroControlle {
 @Autowired
    private CarroService carService;

    
  @GetMapping("/test")
  public String getMethodName(@RequestParam String param) {
      return "Ferrari!";
  }
  
  @PostMapping("/salvar")
   public Carro salvar(@RequestBody Carro carro){
    return carService.salvar(carro);

   }

   }
