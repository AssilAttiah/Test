package Opgaver;

public class Copenhagen_Marathon {
    public static void main(String[] args) {
    printMarathon("Peter Adam",1556,'D');
    printMarathon("Omar Farooq",1699,'D');
    printMarathon("Lotte Nybo",843,'B');

    }
    static void printMarathon(String navn, int nr, char gruppe){
        System.out.println("Dear "+navn+"!");
        System.out.println("We are happy to receive your registration");
        System.out.println("Your start number is: "+nr);
        System.out.println("You start in group: "+gruppe);
        System.out.println("Please check in 10 mins before start");
        System.out.println();

    }
}