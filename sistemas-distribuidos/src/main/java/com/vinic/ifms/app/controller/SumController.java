package com.vinic.ifms.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/sum")
public class SumController {

    @GetMapping("/{x1}/{x2}")
    public ResponseEntity<Double> add(@PathVariable("x1") String n1, @PathVariable("x2") String n2) {

        double num1 = 0;
        double num2 = 0;

         try{

            num1 = Double.parseDouble(n1);   
            num2 = Double.parseDouble(n2);

         }catch(NumberFormatException e){

            throw new ArithmeticException("Não é permitidos Letras, Tente Novamente");
         }

         return ResponseEntity.ok(num1 + num2);
        
    }

}
