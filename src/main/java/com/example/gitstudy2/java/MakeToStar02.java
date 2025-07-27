package com.example.gitstudy2.java;

public class MakeToStar02 {
    public static void main(String[] args){
         int floor = 1;
         int size = 5;
         for(int i = floor; i <= size; i++){
             // spce, 회색박스
             for(int j = 0; j < size-i; j++){
                 System.out.print(" ");
             }

             // star, 빨간박스
            for (int j = 0; j < 2*i-1; j++){
                System.out.print("*");

            }
            System.out.println();
         }
    }
}
