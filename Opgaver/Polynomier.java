package Opgaver;
public class Polynomier {
    public static void main(String[] args) {
        Polynomium p1=new ForsteGrads(3,2,2);
        System.out.println(p1);
    }//slut main
}//slut class Polynomier

abstract class Polynomium{
    abstract double f(double x);
    abstract double beregnFFunk();
}//slut class abs Polynomium

class ForsteGrads extends Polynomium{
    double beregnFFunk(){return 0;}
    int a,b;
    int x;

    ForsteGrads(int a, int b, int x){
        this.a=a;
        this.b=b;
        this.x=x;
    }//slut constructor

    double f(double x) {
      return a*x+b;
    }//slut metode f double

    public String toString(){
        return "f(x)"+a+"*"+x+"+"+b+"="+"f("+x+")"+a*x+b    ;
    }//slut toString
}//slut class ForsteGrads