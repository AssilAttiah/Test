package Opgaver;

    public class Pyramid_calc {
    public static void main(String[] args) {
Pyramid p1=new Pyramid(2,2);
Pyramid p2=new Pyramid(4,7);
Pyramid p3=new Pyramid(10,13);

        System.out.println(p1+" "+p1.areal());
        System.out.println(p2+" "+p2.areal());
        System.out.println(p3+" "+p3.areal());
        System.out.println(p3.side);
    }//slut main metode
}//slut class pyramid_calc

class Pyramid{
        double side;
        double height;
       // double result;

    //Dette er en constructor, som indeholer datatyper + variabler
    Pyramid(double sd, double ht){
        side=sd;
        height=ht;
      //  result=(side*side*height/4);
    }//slut UsePyramid Constructor

    double areal(){
        return side*side*height/4;
    }//slut areal metode

    public String toString(){
        return "Pyramide ("+side+","+height+")";
    }//slut toString metode
}//Slut class UsePyramid