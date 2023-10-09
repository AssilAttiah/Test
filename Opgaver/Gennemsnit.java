package Opgaver;

public class Gennemsnit {
    public static void main(String[] args) {
        double a=0;
        double b=1;
        double c=1;
        double gnmsnt;

        gnmsnt=gennemsnit(a,b,c);
        System.out.println("Gennemsnittet af tallene er "+gnmsnt);

    }
    static double gennemsnit(double a, double b, double c) {
        double result=(a+b+c)/3;
        return result;
    }
}
