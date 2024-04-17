package com.practice.API.Controller;

import com.practice.API.Service.Engine.DieselEngine;
import com.practice.API.Service.Engine.PetrolEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/vivek")
public class EngineController {


    @Autowired
    PetrolEngine pe;

    @Autowired
    DieselEngine de;
    @GetMapping("/yadav")
    public void Testcase(){
        pe.start();
       int returnValue= pe.start();
        System.out.println(returnValue);;

    }

    @GetMapping("/pati")
    public void Testcase2(){
        //de.start();
        int returnValue=de.start();
        System.out.println(returnValue);

    }

    @GetMapping("/time")
    public String time(){
       LocalDateTime curr= LocalDateTime.now();
        return ""+curr;
    }
}
