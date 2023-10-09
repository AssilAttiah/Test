package Opgaver;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;

public class Terningslag {
    public static void main(String[] args) {
        Random gen=new Random();
/*        int tal=gen.nextInt(2);
        System.out.println("Du landede på: "+tal);

        if (tal==0) {
            System.out.println("Plat");
            System.out.println("Tillykke du vandt!");
        }
        else {
            System.out.println("Krone");
            System.out.println("Du tabte adam");
        }
 */      System.out.println("Tak for i dag, kom igen");



      // udfald 1-6
      int dice;
      String activity="";
      int answer;
      boolean keepgoing=true;
      while(keepgoing) {
          dice=gen.nextInt(6)+1;

          if (dice==1) {
              activity = "Breakfast";
          }
          if (dice==2) {
              activity = "Study";
          }
          if (dice==3) {
              activity = "Swim";
          }
          if (dice==4) {
              activity = "Go Fish";
          }
          if (dice==5) {
              activity = "Call mom";
          }
          if (dice==6) {
              activity = "Go back to bed";
          }
          System.out.println(activity);
          if (dice==6)
              System.out.println("Lucky!");

 //         if (dice==6) keepgoing=false;
          answer=JOptionPane.showConfirmDialog(null,"You hit "+dice+"\n"+activity+"\nTry again?","Dice Throw", JOptionPane.YES_NO_OPTION);
          if (answer==JOptionPane.NO_OPTION) keepgoing=false;
          if (answer==JOptionPane.NO_OPTION==true);
          System.out.println("Goodbye!");
      }

  /*      System.out.println("Dice hit "+dice);
        if (dice==1) {
            activity = "Breakfast";
        }
        if (dice==2) {
            activity = "Study";
        }
        if (dice==3) {
            activity = "Swim";
        }
        if (dice==4) {
            activity = "Go Fish";
        }
        if (dice==5) {
            activity = "Call mom";
        }
        if (dice==6) {
            activity = "Go back to bed";
        }
            System.out.println(activity);

        if (dice==6)
            System.out.println("Lucky!");
        else
            System.out.println("Halla");



            int number = gen.nextInt(6) + 1;
            switch (number) {
                case 1:
                    System.out.println("breakfast");
                    break;
                case 2:
                    System.out.println("study");
                    break;
                case 3:
                    System.out.println("swim");
                    break;
                case 4:
                    System.out.println("go fish");
                    break;
                case 5:
                    System.out.println("Call Mom");
                    break;
                case 6:
                    System.out.println("Back to bed");
                    break;
            }

        {
            int alder;
            alder = 15;

            if (alder >= 18)
            System.out.println("du er myndig");
            else
            System.out.println("nono little baby");
            System.out.println("du er " + alder + "år gammel :)");

            if (alder >=18) System.out.println("Du er myndig");
            else if (alder>=15) System.out.println("du er for ung");
            else if (alder>=13) System.out.println("du er teenager");
            else if (alder>=8) System.out.println("du er et barn");
            else if (alder>=2) System.out.println("du er legit en baby");   
            }
 */




        }

    }
