/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.richardslab6;

import java.util.Scanner;

/**
 *
 * @author Cohen Richards CSCI 1011 Lab 6.
 * This is  a program that outputs a math test or an addition/multiplication table.
 */
public class RichardsLab6 {
    public static final int ARITHMETIC_CODE = 12;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int userChoice,userCode;
        int rightAnswers=0;
        int correctAnswer,userAnswer;
        boolean shouldContinue = true;
        
        
        Scanner keyboard=new Scanner(System.in);
        
        
        do{ 
        System.out.println("Please choose from the following options:");
        System.out.println("1.Addition Quiz");
        System.out.println("2.Multiplication Quiz");
        System.out.println("3. Addition Table");
        System.out.println("4.Multiplication Table");
        System.out.println("5. Exit the program");
            userChoice=keyboard.nextInt();
           
            switch (userChoice){
            
            
            case 1: do{
                    System.out.println("Please choose a number between 1 and 12");
                    userCode=keyboard.nextInt();
                }while (userCode < 1 || userCode > 12);
            
            for (int i=1; i<13;i++){
                
                
                System.out.println(userCode +"+"+i+"=");
                userAnswer=keyboard.nextInt();
                
                correctAnswer=userCode+i;
                
            if (userAnswer==correctAnswer)
                rightAnswers++;
            
            } 
            System.out.println("You got "+rightAnswers+" right out of 12");;
            rightAnswers=0;
            break;
            
        
            case 2:{
                do{
                    System.out.println("Please choose a number between 1 and 12");
                    userCode=keyboard.nextInt();
                }while (userCode < 1 || userCode > 12);
                 
            for (int i=1; i<13;i++){
                
                
            
                System.out.println(userCode +"*"+i+"=");
                userAnswer=keyboard.nextInt();
                
                correctAnswer=userCode*i;
                
            if (userAnswer==correctAnswer)
                rightAnswers++;
            }
            System.out.println("You got "+rightAnswers+" right out of 12");;
            rightAnswers=0;
            }break;
                
                
            case 3:System.out.println("Table code goes here");
            
             System.out.print("    | ");
        for (int i = 1; i <= ARITHMETIC_CODE; i++) {
            System.out.printf("%4d", i);  
        }
        System.out.println();  
        
        System.out.print("----+");
        for(int i=1; i<=ARITHMETIC_CODE;i++){
        
        System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= 12; row++) {
            
            System.out.printf("%2d |", row);
            
            
            for (int col = 1; col <= ARITHMETIC_CODE; col++) {
                System.out.printf("%4d", row + col);  
            }
            System.out.println(); 
        }
                break;
                
            
            case 4:
            
             System.out.print("    | ");
        for (int i = 1; i <= ARITHMETIC_CODE; i++) {
            System.out.printf("%4d", i);  
        }
        System.out.println();  
        
            System.out.print("----+");
        for(int i=1; i<=ARITHMETIC_CODE;i++){
        
        System.out.print("----");
        }
        System.out.println();  
        for (int row = 1; row <= 12; row++) {
            
            System.out.printf("%2d |", row);
            
            
            for (int col = 1; col <= ARITHMETIC_CODE; col++) {
                System.out.printf("%4d", row * col);  
            }
            System.out.println(); 
        }
            
                break;
            case 5:shouldContinue=false;
                    break;
            default: System.out.println("Invalid Choice");
                break;
        
            }
        
        
        } while(shouldContinue);
            
        
        
        
    }
}
