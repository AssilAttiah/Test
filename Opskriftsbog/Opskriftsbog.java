package Opskriftsbog;

import java.util.ArrayList;
import java.util.Scanner;

public class Opskriftsbog {

public static String titel;
public static String ingredienser;
public static int rec;
public static ArrayList<OPS> Opskrift = new ArrayList<OPS>();

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

            while(true){
            System.out.println("Tryk 1 for at tilføje en opskrift"+"\n Tryk 2 for at afslutte");
            rec=scan.nextInt();
            if (rec==1){
                System.out.println("Angiv navnet på din opskrift");
                scan.nextLine();
                titel=scan.nextLine();
            }
            if (!titel.isEmpty()) {
                System.out.println("Tilføj Ingredienser (Adskil med komma)");
                ingredienser= scan.nextLine();
            }
            else if (rec==2){
                System.out.println("Tak for at bruge Kogebogen™");
                break;
            }//slut else if break loop
            }//slut while loop
    }//slut main
}//slut class Opskriftsbog