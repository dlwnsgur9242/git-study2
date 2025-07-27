package com.example.gitstudy2.java.inheritance;

public class Main {
    public static void main(String[] args) {
        Student danny = new Student();
        // Human danny = new Student();
        // danny.setName 호출은 가능하지만
        // danny.studyPhysice는 접근이 안된다.
        // 이유는? 클래스명이 Human로 정의되어 있어서 이다.
        // 정상적으로 호출하고 싶다면 Student danny로 하면 된다.

        // Student danny = new Human()은 작성할 수가 없다.
        // 자식 개체인 Student 클래스의 Overriding을 하면
        // Student danny = new Student()를 작성할 수 있다.
        danny.setName("danny.kim");


        System.out.println(danny.name);
        danny.studyPhysics();
        danny.studyPhysics();
    }
}
