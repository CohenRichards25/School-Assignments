/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.richardsassign3;

import java.util.Scanner;

/**
 *
 * @author Cohen Richards CSCI 1010 assignment 3.
 * This is a program to calculate tuition costs based on the students residency,level of study, and amount of credits taken.
 */
public class RichardsAssign3 {

    public static void main(String[] args) {
        System.out.println("Hello welcome to Cohen's tuition calculator!");
        double credTake=0;
        boolean shouldContinue = true;
       do{ 
        System.out.println("Is the student an undergrad or grad");
        Scanner keyboard=new Scanner(System.in);
        String levelStudy=keyboard.next();
        System.out.println("Is the student an in-state or out-state student");
        String resStat=keyboard.next();
        
        
        System.out.println("please enter your amount of credits taken");
        if (levelStudy.equalsIgnoreCase("undergrad") ){
        do{
                    System.out.println("How many credits the student is registering for?(A number between 1-18)");
                   
                           credTake=keyboard.nextDouble();
                           
                           if(credTake<1||credTake>18)
                               System.out.println("Error: Entered Credit Hours is out of range");
                }while (credTake< 1 || credTake > 18);
        
        }
        
        if (levelStudy.equalsIgnoreCase("grad")){
        do{
                    System.out.println("How many credits the student is registering for?(A number between 1-15)");
                   
                           credTake=keyboard.nextDouble();
                           
                           if(credTake<1||credTake>15)
                               System.out.println("Error: Entered Credit Hours is out of range");
                }while (credTake< 1 || credTake > 15);
        
        }
        
        double tuitCost=credTake;
        if(levelStudy.equalsIgnoreCase("grad")){
            if (resStat.equalsIgnoreCase("in-state")){
                if(credTake<=10){
                tuitCost=credTake*457;
            }
                if (credTake>10){
                    tuitCost=(credTake-10)*88+4570;
                }
        }}
            
                
        if(levelStudy.equalsIgnoreCase("grad")){
            if (resStat.equalsIgnoreCase("out-state")){
                if(credTake<=10){
                tuitCost=credTake*515;
            }
                if (credTake>10){
                    tuitCost=(credTake-10)*88+7340;
                }
        }}
        
         if(levelStudy.equalsIgnoreCase("undergrad")){
            if (resStat.equalsIgnoreCase("in-state")){
                if(credTake<=12){
                tuitCost=credTake*284;
            }
                if (credTake>12){
                    tuitCost=(credTake-12)*55+3408;
                }
        }}
        if(levelStudy.equalsIgnoreCase("undergrad")){
            if (resStat.equalsIgnoreCase("out-state")){
                if(credTake<=12){
                tuitCost=credTake*515;
            }
                if (credTake>12){
                    tuitCost=(credTake-12)*55+5150;
                }
        }}
        
        
            System.out.print("$");
            System.out.printf("%.2f%n",tuitCost);
        
        System.out.println("calculate another tuition?(yes or no)");
        String yesOrNo= keyboard.next();
        
        if (yesOrNo.equalsIgnoreCase("no")){
            shouldContinue=false;
       }
        
        
       }while (shouldContinue); 
       System.exit(0);
       System.out.println("Thank you for using Cohen's tuition cost calculator.");
}}



//In-State Undergraduate tuition is $284 per credit hour for hours 1-12, per semester.
//A discounted rate of $55 per credit hour is offered for hours 13 and above, per
//semester.
// Undergraduate Out-of-State tuition is $515 per credit hour for hours 1-12, per
//semester. There are no additional Out-of-State charges for hours above 12 but you
//will pay the $55 per credit hour for Undergraduate tuition for hours 13 and above,
//per semester.
//Graduate Tuition:
//Graduate tuition is $457 per credit hour for hours 1-10, per semester. A discounted
//rate of $88 per credit hour is offered for hours 11 and above, per semester.
//Graduate Out-of-State tuition is $734 per credit hour for hours 1-10, per semester.
//There are no additional Out-of-State charges for hours above 10 but you will pay the
//$88 per credit hour for Graduate tuition for hours 11 and above, per semester
