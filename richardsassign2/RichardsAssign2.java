/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.richardsassign2;

import java.util.Scanner;

/**
 *
 * @author Cohen Richards CSCI 1010 assignment 2
 * This is a program to calculate if a cat has ingested a lethal amount of dark chocolate or milk chocolate.
 */
public class RichardsAssign2 {
public static double THEO_IN_DARK_CHOC = 4.59;
public static double THEO_IN_MILK_CHOC = 2.05;
public static double CAFF_IN_MILK_CHOC =.21;
public static double CAFF_IN_DARK_CHOC =.7;



    public static void main(String[] args) {
        double catWeight,ingestedChoc,theoBrDark, caffDark,theoBrMilk,caffMilk;
        System.out.println("Hello Welcome to my feline chocolate toxicity calculator!");
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter your cats weight in pounds");
        catWeight=keyboard.nextDouble();
        catWeight=catWeight/2.205;
        
        System.out.println("enter the number of pieces of chocolate your cat ate");
        //1 piece=6g
        ingestedChoc=keyboard.nextDouble()*6;
        //converts the piece number to amount of grams.
        
       //calculates the ingested amount of Theobromine and caffiene in the chocolate
       theoBrDark=ingestedChoc*THEO_IN_DARK_CHOC;
       caffDark=ingestedChoc*CAFF_IN_DARK_CHOC;
       theoBrMilk=ingestedChoc*THEO_IN_MILK_CHOC;
       caffMilk=ingestedChoc*CAFF_IN_DARK_CHOC;
       
       double toxinIngestedDark=(theoBrDark+caffDark);
       double toxinIngestedMilk=(theoBrMilk+caffMilk);
       //displays the toxin level
       double toxinDoseDark=(theoBrDark+caffDark)/catWeight;
       double toxinDoseMilk=(theoBrMilk+caffMilk)/catWeight;
       System.out.println("The Toxin dose  for your cat, each chocolate type is:");
       System.out.println("Dark Chocolate:" +toxinDoseDark);
       System.out.println("Milk Chocolate:" +toxinDoseMilk);
      
       
       //checks the level of toxin and outputs the appropriate message.
       if ((toxinIngestedDark>55)||(toxinIngestedMilk>55))
       {System.out.println("CAUTION!!Your cat may have ingested a lethal amount!!");}
       else if (toxinIngestedMilk<15 || toxinIngestedDark<15)
       {System.out.println("Your cat will be okay");}
       else;
         
         System.out.println("enter the weight of the chocolate in grams.");
        int weightOfChoc=keyboard.nextInt();
        System.out.println("enter the weight of each piece in grams.");
        int weightOfPiece=keyboard.nextInt();
        int chocPieces=weightOfChoc/weightOfPiece;
        int unaccountedChocGrams=weightOfChoc%weightOfPiece;
        System.out.println("In a "+weightOfChoc+"g bar of chocolate there are "+chocPieces+" pieces, with "+unaccountedChocGrams+"g left over");
        System.out.println("Thank you for using Cohen Richards chocolate toxicity calculator");
         
         
         
         
         
         
         
    }
}
