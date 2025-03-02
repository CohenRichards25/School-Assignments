/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csci1011.richardslab3;

import java.util.Scanner;

/**
 *Cohen Richards CSCI 1011 Lab Assignment 3. Creating a program to demonstrate string class methods.
 * @author Cohen Richards
 */
public class RichardsLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String courseCode,courseTitle;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the course code");
        courseCode=keyboard.nextLine();
        System.out.println ( "Enter the course title");
        courseTitle=keyboard.nextLine();
        
        System.out.println("Testing + operator");
        //Creates the string welcomeMessage by adding the courseCode and courseTitle variable to a string.
        String welcomeMessage=("Welcome to "+courseCode+":"+courseTitle+"!");
        
        System.out.println(welcomeMessage);
        //welcomeMessage2= welcomeMessage in Upper case
        String welcomeMessage2 = welcomeMessage.toUpperCase(); 
        
        
                
                
        System.out.println("Testing toLowerCase method:");
        //prints the welcomeMessage in lower case
        System.out.println(welcomeMessage.toLowerCase());
        
        
        System.out.println("Testing toUpperCase method:");
        //Prints the welcomeMessage string in upper case
        System.out.println(welcomeMessage.toUpperCase());
        
        
        System.out.println("Testing length method:");
        // Shows the length of the welome message
        System.out.println("The length of the string welcomeMessage is: "+welcomeMessage.length() );
        
        System.out.println("Testing equals method:");
        // tests if the strings are equal 
        System.out.println("Messages are equal "+welcomeMessage.equals(welcomeMessage2) );
        
        System.out.println("Testing equalsIgnoreCase method:");
        //tests if the strings are equal ignoring the case
        System.out.println("Messages are equal "+welcomeMessage.equalsIgnoreCase(welcomeMessage2) );
        
        
        System.out.println("Testing replace method");
         //replaces the inputted course code with CSCI 1010
        System.out.println( welcomeMessage.replace(courseCode, " CSCI 1010 "));
        
        
        System.out.println (("Testing indexOf, substring,and concat method"));
        //Identify the index of the first character of the substring introduction in welcomeMessage
        int indexOfIntroduction;
        indexOfIntroduction = welcomeMessage.indexOf("Introduction");
        
        //Creates a sub string of the welcome message
        String subStringMessage;
        subStringMessage = welcomeMessage.substring (0,indexOfIntroduction);
        
        
        //Adds introduction to programming to the substring.
        System.out.println(subStringMessage.concat(" Introduction to Programming"));
        
        
        
        
        
        
        
        
    }
    
}
