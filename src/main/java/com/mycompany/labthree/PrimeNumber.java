/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labthree;

import static com.mycompany.labthree.PaintJob.gallonsOfPaintRequired;
import static com.mycompany.labthree.PaintJob.laborRequired;
import java.util.Scanner;

/**
 *
 * @author Chandana
 */
public class PrimeNumber {
    public static boolean isPrime(int number){
            
        int i,m=0;
        boolean isPrime = true;
        int n= number;   
        m=n/2;      
        if(n==0||n==1){
            isPrime = false;     
        }else{  
            for(i=2;i<=m;i++){      
                if(n%i==0){      
                    isPrime = false;          
                    break;      
                }      
            }      
        } 
        return isPrime;
    }
    
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number :");
     
        try {
            int number = keyboard.nextInt();
           boolean isPrime = isPrime(number);
           if(isPrime){
               System.out.println(number+" is prime number");
           }
           else{
               System.out.println(number+" is not prime number");
           }
          
        } catch (Exception e) {
             System.out.println( "Please enter integer value.");
        }  
        
    }
}
