/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labthree;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Chandana
 */
public class EvenOddNumber {
    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }   
    }
    public static void main(String[] args) {
        
        Random objRandom = new Random();
        int countEven = 0;
        int countOdd = 0;
        String strEven = "Even Numbers :";
        String strOdd = "Odd Numbers :";
        boolean isEvenNumber = false;
        for(int i=0;i<100;i++){
            int number = objRandom.nextInt();
            isEvenNumber = isEven(number);
            if(isEvenNumber){
                countEven++;
                strEven = strEven.concat(String.valueOf(number));
                strEven = strEven.concat(",");
            }
            else{
                countOdd++;
                strOdd = strOdd.concat(String.valueOf(number));
                strOdd = strOdd.concat(",");
            }
        }
        System.out.println("Numbers of even numbers generated are :"+ countEven);
        System.out.println("Numbers of odd numbers generated are :"+ countOdd);
        System.out.println(strEven);
         System.out.println(strOdd);
           
    }
}
