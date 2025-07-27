package com.example.gitstudy2.java.inheritance;

public class Student extends Human {

    @Override
    void setName(String param) {
        this.name = param;
        System.out.println("setName = " + param);
    }

    void studyPhysics(){
        System.out.println(this.name + "studies Physics.");
    }

    void studyPhysics(String title) {
        System.out.println(this.name + " studies Physics."+ title);
    }
}
