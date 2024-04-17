package com.practice.API.Service.Engine;


import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{

    @Override
    public int start() {
        System.out.println("Disel Engine");
        return 4;
    }
}
