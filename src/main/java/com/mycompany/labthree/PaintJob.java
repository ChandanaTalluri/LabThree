/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labthree;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chandana
 */
public class PaintJob {
    public static ArrayList getNoOfRoomsAndPaintCost(){
        String strnoOFRooms = JOptionPane.showInputDialog("Please enter the numbers of rooms to be painted :");
      String strPaintPrice = JOptionPane.showInputDialog("Please enter the price per gallon of paint :");
      ArrayList arrlist = new ArrayList();
        try {
            float noOfRooms = Float.parseFloat(strnoOFRooms);
            float paintPrice = Float.parseFloat(strPaintPrice);
            arrlist.add(noOfRooms);
            arrlist.add(paintPrice);
        } catch(Exception e){
                System.out.println( "Alphabets and special charecters are not allowed.");
            }   
        return arrlist;
    }
    public static float totalWallSpace(float noOfRooms){
        float totalspace = 0.0F;
        int count = 1;
        for(int roomCount = 0; roomCount<noOfRooms ; roomCount++){
            String strCheckscount = JOptionPane.showInputDialog("Please enter the square foot is each wall space in room " +count + " : ");
            count++;
            try {
                float wallspace = Float.parseFloat(strCheckscount);
                totalspace = totalspace+ wallspace;
            }
            catch(Exception e){
                System.out.println( "Alphabets and special charecters are not allowed.");
            }   
        }
        return totalspace;
    }
    
    
    public static float gallonsOfPaintRequired(float totalWallspace){
        float noGallonPaint = (totalWallspace/115);
        return noGallonPaint;
    }
    public static float laborRequired(float totalWallspace){
        float hrsLaborReq = (totalWallspace/115)*8;
        return hrsLaborReq;
    }
    public static float costOfPaint(float gallonsPaintReq, float paintPrice){
        float paintCost = gallonsPaintReq*paintPrice;
        return paintCost;
    }
    public static float laborCharges(float hrslaborReq, float laborCostPerHr) {
      float labourcharges = hrslaborReq * laborCostPerHr;
      return labourcharges;
    }

    public static float paintJobCost(float total_labor_Charges, float paintCost) {
        float total_cost = total_labor_Charges+paintCost;
        return total_cost;
    }
    
    
    public static void main(String[] args) {
   
      ArrayList arrListRooms = getNoOfRoomsAndPaintCost();
        try {
            if(null!= arrListRooms && arrListRooms.size()>0){
                float noOfRooms = (float) arrListRooms.get(0);
                System.out.println(" no of rooms : "+ noOfRooms);
                float paintPrice = (float) arrListRooms.get(1);
                System.out.println(" paintPrice : "+ paintPrice);
                float totalWallspace = totalWallSpace(noOfRooms);
                System.out.println(" totalWallspace : "+ totalWallspace);
                float laborCostPerHr = 18;
                if(totalWallspace>0){
                    float gallonsPaintReq = gallonsOfPaintRequired(totalWallspace);
                    float hrslaborReq = laborRequired(totalWallspace);
                    float paintCost = costOfPaint(gallonsPaintReq ,paintPrice);
                    float total_labor_Charges = laborCharges(hrslaborReq,laborCostPerHr);
                    float total_cost = paintJobCost(total_labor_Charges,paintCost);
                    
                    String strOutput = String.format("Number of rooms : %.2f\n Total wall space: %.2f\n" +
                                  " Gallons of paint is required to paint : %.2f\n"+
                                  " Hours of labour require to paint rooms : %.2f\n" + 
                                  " Cost of total paint :$%,.2f\n" +" Total labour charges : $%,.2f\n"+
                                  " Total cost of the paint job :$%,.2f", noOfRooms,totalWallspace,
                                  gallonsPaintReq,hrslaborReq
                                   ,paintCost,total_labor_Charges,total_cost );
                    JOptionPane.showMessageDialog(null,strOutput );
                    System.out.println(strOutput);
                    }
            }
            
           
        } catch (Exception e) {
             System.out.println( "Alphabets and special charecters are not allowed.");
        }  
    } 
}
