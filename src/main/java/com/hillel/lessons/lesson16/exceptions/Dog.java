package com.hillel.lessons.lesson16.exceptions;

import java.util.Objects;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    public void setName(String name) {

        if (Objects.nonNull(name)){
        this.name = name;
        }else {
            System.out.println("name can not be null");
        }
    }
}
