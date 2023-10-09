package Opgaver.Bank_Apps;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bank_App2 {
    public static void main(String[] args) {
        //Account kan skrives på denne måde pga den constructor
        //som vi lavede under "class Account"
        Account a1=new Account("Joe Mama", 5);
        Account a2=new Account("Jimi Hendrix", 7);

        a1.deposit(100);
        a1.withdraw(50);

        a2.deposit(2500);
        a2.withdraw(500);

        a1.annualInterest();
        a2.annualInterest();

        a1.printTransactions();
        a2.printTransactions();
    }// slut main metode
}//slut class bank_app

class Account {
    protected static int noOfAccounts=0;
    protected int accountNo;
    protected String owner;
    protected double balance;
    protected double interestRate;//årlig rente i %
    ArrayList<Transaction> transactions=new ArrayList<Transaction>();

    //Dette er en constructor, som indeholer datatyper + variabler
    Account(String own, double ir){
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=own;
        interestRate=ir;
        balance=0;
    }//Slut constructor Account

    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat",amount,balance));
    }//slut deposit metode

    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet",amount,balance));
    }//slut withdraw metode

    void annualInterest(){
        double interestamount=balance*interestRate/100;
        balance=balance+interestamount;
        transactions.add(new Transaction("Rente",interestamount,balance));
    }//slut annualInterese metode

    void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t    Beløb\tSaldo");
        for (Transaction t: transactions)
        System.out.println(t);
        System.out.println();
    }//slut printTransactions metode

    public String toString(){
        return "\nKontonr: "+accountNo+"\nNavn: "+owner+"\nSaldo: "+balance+" kr";
    }//slut toString metode
}//slut class Account

class Transaction{
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    //constructor
    Transaction(String text,double amount,double newBalance){
        this.text=text;
        this.amount=amount;
        this.newBalance=newBalance;
        date=LocalDate.now();
    }//slut constructor

    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }//slut toString metode
}//slut class Transaction