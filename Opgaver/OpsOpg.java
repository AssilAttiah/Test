package Opgaver;


import java.util.Scanner;

public class OpsOpg {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        char op;

        Opskrift[] opskrifter = new Opskrift[10];
        opskrifter[0]=new Opskrift("Butter Chicken","\nSmør\nKylling\nFløde\nKrydderier\n","\n1. Mariner kylling i fløde med krydderier over natten.\n2. Steg kylling indtil gyldenbrun\n3. Smelt smør and do yo thang");
        opskrifter[1]=new Opskrift("Kogte ris","\nris","\n Hvor svært kan det lige være kom nu lidt dig");
        opskrifter[2]=new Opskrift("Spaghetti Bolo Ala Mads","\n Spaghetti\nKød\nFlåede tomater\nKrydderier","\n1. Kog pasta\n2. Steg og krydder kødet\n3. Hæld flåede tomater i kødet\n4. Combine that shit boi");

        while (true) {
            System.out.println("Velkommen til KOGEBOGEN™");
            System.out.println("Tryk 1 for at se retter");
            System.out.println("Tryk 2 for at se desserter");
            System.out.println("\nTryk 0 for at afslutte");
            op=scan.next().charAt(0);

            if(op=='0'){
                System.out.println("Tak for at bruge KOGEBOGEN™ \uD83D\uDC4B\uD83C\uDFFD");
                break;
            }

            switch(op){
                case '1':
                    System.out.println(" \uD83E\uDD75  \uD83E\uDD75  RETTER  \uD83E\uDD75  \uD83E\uDD75 ");
                    System.out.println(opskrifter);
                    break;

                case '2':
                    System.out.println(" \uD83D\uDE0B  \uD83D\uDE0B  DESSERTER  \uD83D\uDE0B  \uD83D\uDE0B ");
                    break;

                default:
                    System.out.println("Ugyldigt input. Prøv igen \uD83D\uDE2B ");
                    System.out.println();
            }//slut switch
        }//slut while

    }//slut main
}//slut Class OpsOpg

class Opskrift{
    String navn;
    String ingredienser;
    String fremgangsmetode;

    public Opskrift(String navn, String ingredienser, String fremgangsmetode){
        this.navn=navn;
        this.ingredienser=ingredienser;
        this.fremgangsmetode=fremgangsmetode;
    }//slut cons



}//slut class Opskrift

