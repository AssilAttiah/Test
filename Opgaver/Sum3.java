package Opgaver;

public class Sum3 {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=18;
        int summen;

        summen=Test.sum(a,b,c); //for at kalde sum metode fra en anden klasse,
                                // skal den prefixes med klassen metoden ligger i
        System.out.println("Summen er "+summen);
    }//slut main metode
}//slut class Sum3

class Test{
    static int sum(int a, int b, int c){
        int result=a+b+c;
        return result;
    }//slut sum metode
}//slut class Tets