package Opgaver;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double num1=0;
        double num2=0;
        char op;
        double result;

        while (true){
            System.out.println("Velkommen til Regnemaskinen");
            System.out.println("   + for addition");
            System.out.println("   - for subtraktion");
            System.out.println("   * for multiplikation");
            System.out.println("   / for division");
            System.out.println("     q for quit");
            System.out.println();
            System.out.print("Indtast operator");
            op=input.next().charAt(0);

            if (op=='q'){
                System.out.println();
                break;
            } // slut if

            num1=inputDouble("Indtast Første Tal");
            num2=inputDouble("Indsast Andet Tal");

     //       System.out.print("Indtast andet tal: ");
     //       num2= input.nextDouble();

            switch(op){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
                default:
                    System.out.println("Ugyldig operator");
                    System.out.println();
                    continue;

            }//slut switch

            System.out.println("Resultatet er "+result);
            System.out.println();

        }//slut while loop
        System.out.println("Tak for at bruge Regnemaskinen™");
        System.out.println("Mobilepay 5kr til 70807070");

    } //slut main

    static double inputDouble(String prompt){
        Scanner input=new Scanner(System.in);
        boolean OK=false;
        double num=0;
        do {
            try {
                System.out.print(prompt);
                num = input.nextDouble();
                OK=true;
            } catch (InputMismatchException e) {
                System.out.println("Udyldigt input, prøv igen");
                input.nextLine();
            }
        } while(!OK);
        return num;
    }// Slut inputDouble metode
}//slut class
