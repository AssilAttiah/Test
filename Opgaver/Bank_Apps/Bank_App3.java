package Opgaver.Bank_Apps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

//______________________________NEDARVNING_______________________________________
public class Bank_App3 {
    public static void main(String[] args) {
        Account a1=new Indlaan("Joe Mama", 5);
        Account a2=new Hojrente("Jimi Hendrix", 10, 1000, LocalDate.of(2024, 9, 25));
        Account a3=new Credit("Drake", 10, 1000);
        Account a4=new BornOp("Rihanna",7, LocalDate.of(2024, 9, 25));
        Account a5=new Milli("Eminem", 0);

        ArrayList<Account> list=new ArrayList<Account>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

       // for (Account a: list) a.withdraw(10000);
      //  for (Account a: list) a.deposit(500);
     //   for (Account a: list) a.printTransactions();
      //  for (Account a: list) a.withdraw(100);



    }//slut main
}//slut Bank_App class

class Indlaan extends Account {
    Indlaan(String ow, double ir) { //constructor
        super(ow, ir);
    }//slut Indlaan constructor

    void withdraw(double amount) {
        if (balance >= amount) {
            super.withdraw(amount);
        }//slut if statement
        else {
            System.out.println("\nDu kan ikke hæve mere end " + balance + " kr.\t ...broke ass");
        }//slut else statement
    }//slut withdraw metode
}//slut Indlaan class


class Hojrente extends Account {

    LocalDate releaseDate;

    //constructor
    Hojrente(String ow, double ir, double startBalance, LocalDate rd){
        super(ow,ir);
        balance=startBalance;
        releaseDate=rd;
    }//slut Hojrente constructor

    void deposit(double amount){
        System.out.println("Du kan ikke sætte penge ind på denne konto efter oprættelsen");
    }//slut deposit metode

    void withdraw(double amount) {
        if (releaseDate.isAfter(LocalDate.now())){
            System.out.println("Du kan først hæve efter d. " + releaseDate);
        }//slut if statement
        else{
            super.withdraw(amount);
        }//slut else statement
    }//slut withdraw metode
}//slut class hojrente

class Credit extends Account{
   double maxCred=balance+10000;
    //constructor
    Credit(String ow, double ir, double startBalane){
        super(ow,ir);
        balance=startBalane;
    }//slut constructor

    void withdraw(double amount){
        if (amount<=maxCred)
        super.withdraw(amount);
        else
            System.out.println("ya broke");
    }//slut withdraw metode
}//slut Credit class

class BornOp extends Account{

    LocalDate releaseDate;

    BornOp(String ow, double ir, LocalDate rd) {
        super(ow, ir);
        releaseDate=rd;
    }//slut BornOp constructor

    void deposit(double amount){
        super.deposit(amount);
    }//slut deposit metode

    void withdraw(double amount){
        if (releaseDate.isBefore(LocalDate.now()))
        super.withdraw(amount);
        else
            System.out.println("nono honey");
    }//slut withdraw metode
}//slut BornOp class

class Milli extends Account{
    public static void random(double amount){
        ArrayList<String> millionærer = new ArrayList<>();
        millionærer.add("Elon Musk");
        millionærer.add("The Zucc");
        millionærer.add("Mr. Amazon");
        millionærer.add("Kim Jong Un");
        Random gen=new Random();
        int antal=millionærer.size();
        int tal= gen.nextInt(antal);
        String vinder = millionærer.get(antal);
       // Milli m=millionærer.get(4);

    }

    Milli(String ow, double ir){
        super(ow, ir);
    }//slut constrcutor


}//slut Milli class