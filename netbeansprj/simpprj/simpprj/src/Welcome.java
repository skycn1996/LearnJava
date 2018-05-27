/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

import  java.util.Scanner;
public class Welcome {
    public static void main(String[] args){
        System.out.println("Welcome to Java!");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number  for radius:"); 
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159;
        
        System.out.println("The area for the circle  of radius "+ radius + " is " + area);
    }
}
