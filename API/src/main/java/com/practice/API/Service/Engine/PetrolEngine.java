package com.practice.API.Service.Engine;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine{

    @Override
    public int start() {
        System.out.println("Petrol Engine");
        return 2;
    }
}
