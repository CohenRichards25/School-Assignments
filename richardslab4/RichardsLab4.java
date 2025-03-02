/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.richardslab4;

import java.util.Scanner;

/**
 *
 * @author Cohen Richards CSCI 1011 Lab assignment 4.
 * This is a program for determining the availability of a professor based on office hours.
 */
public class RichardsLab4 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        String dayOfWeek,timeOfDay;
        int minuteTime,hourTime,totalMinute;
        System.out.println("enter the day of the week");
        Scanner keyboard= new Scanner(System.in);
        dayOfWeek=keyboard.nextLine();
       
      
        
        
       
       
        System.out.println("Enter a time (XX:XXam/pm");
        timeOfDay=keyboard.nextLine();
        //System.out.println(dayOfWeek);
        
        //extracting AMorPM
        String amOrPM= timeOfDay.substring(timeOfDay.length()-2,timeOfDay.length());
        
        int splitterColon= timeOfDay.indexOf(":");
        
        
       // System.out.println(timeOfDay);
        
        
        String timeHour=timeOfDay.substring(0, splitterColon);
        String timeMinute=timeOfDay.substring(timeOfDay.indexOf(":")+1,timeOfDay.length()-2);
        //System.out.println(timeHour);
        hourTime=Integer.parseInt(timeHour);
        minuteTime=Integer.parseInt(timeMinute);
        totalMinute=minuteTime+(hourTime*60);
      
        
        {System.out.println("Day of the week: "+dayOfWeek);}
        if (!(dayOfWeek.equalsIgnoreCase("tuesday") || dayOfWeek.equalsIgnoreCase("tue") ||
        dayOfWeek.equalsIgnoreCase("mon") || dayOfWeek.equalsIgnoreCase("monday") ||
        dayOfWeek.equalsIgnoreCase("wed") || dayOfWeek.equalsIgnoreCase("wednesday") ||
        dayOfWeek.equalsIgnoreCase("thu") || dayOfWeek.equalsIgnoreCase("thursday") ||
        dayOfWeek.equalsIgnoreCase("fri") || dayOfWeek.equalsIgnoreCase("friday")|| 
        dayOfWeek.equalsIgnoreCase("sat")||dayOfWeek.equalsIgnoreCase("saturday")||dayOfWeek.equalsIgnoreCase("sun")||
        dayOfWeek.equalsIgnoreCase("sunday")))
        {System.out.println("Not a valid day");}
        else if ((minuteTime < 0 || minuteTime > 60 || hourTime < 1 || hourTime > 12) )
        {System.out.println("Invalid time");}
    //check if AM or PM.
    else if (amOrPM.equalsIgnoreCase("am"))
    //checking if the time is valid based on the day.
        System.out.println("Not available");
             else if ((dayOfWeek.equalsIgnoreCase("MON")) || (dayOfWeek.equalsIgnoreCase("Monday") && (totalMinute <= 300) && (totalMinute >= 180)))
             {System.out.println("Available");}
             
             else if ((dayOfWeek.equalsIgnoreCase("Thu")) || (dayOfWeek.equalsIgnoreCase("Thursday") && (totalMinute <= 300) && (totalMinute >= 210)))
             {System.out.println("Available");}
             
             else if ((dayOfWeek.equalsIgnoreCase("Fri")) || (dayOfWeek.equalsIgnoreCase("Friday") && (totalMinute <= 270) && (totalMinute >= 180)))
             { System.out.println("Available");}
        else {System.out.println("Not Available");}
    }
}
