package com.example.gitstudy2.java.Programer;

public class Main {
    public static void main(String[] args) {
        // 프로그래머의 타입에 따라 다른 행동 구현하기
        JavaProgrammer java = new JavaProgrammer();
        CProgrammer c = new CProgrammer();
        JavaScriptProgrammer javaScript = new JavaScriptProgrammer();
        writeCode(javaScript);
    }

    public static void writeCode(Programmer programmer) {
        programmer.writeCode();
    }
}
