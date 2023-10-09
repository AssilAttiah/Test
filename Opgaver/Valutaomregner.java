package Opgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Valutaomregner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double SEK=1.60;
        double NOK=1.54;
        double EUR=0.13;
        double ISK=19.26;

        while (true){
            System.out.println("Velkommen til Valuta omregner.");
            System.out.println("Her kan du veksle fra danske kroner til svensk, norsk, finsk eller islandsk valuta");
            System.out.println();
            System.out.println("Indtast beløb i danske kroner: ");

            // Læs brugerens indtastning for DKK
            double dkkbl = input.nextDouble();

            System.out.println();
            System.out.println("Tast 1 for svenske kroner");
            System.out.println("Tast 2 for norske kroner");
            System.out.println("Tast 3 for finske euro");
            System.out.println("Tast 4 for islandske kroner");
            System.out.println();
            System.out.println("Tast 0 for at afslutte programmet");
            System.out.println();

            // Læs brugerens valg
            int valg=input.nextInt();


            // Brug en switch-sætning til at håndtere brugerens valg
           switch (valg){
                case 1:
                    // Konverter beløbet til SEK og udskriv resultatet
                    double sekbl = dkkbl * SEK;
                    System.out.println("Beløb i SEK: " +sekbl);
                    System.out.println();
                    break;
                case 2:
                    // Konverter beløbet til NOK og udskriv resultatet
                    double nokbl = dkkbl * NOK;
                    System.out.println("Beløb i NOK: " +nokbl);
                    System.out.println();
                    break;
                case 3:
                    // Konverter beløbet til EUR og udskriv resultatet
                    double eurbl = dkkbl * EUR;
                    System.out.println("Beløb i EUR: " +eurbl);
                    System.out.println();
                    break;
                case 4:
                    // Konverter beløbet til ISK og udskriv resultatet
                    double iskbl = dkkbl * ISK;
                    System.out.println("Beløb i ISK: " +iskbl);
                    System.out.println();
                    break;
               case 0:
                   // Afslut programmet, når brugeren taster 0
                   System.out.println("Progammet afsluttes");
                   // Lukker Scanneren
                   input.close();
                   System.exit(0);

            }//Slut switch
        } //slut while
    } // slut main
} // slut class
