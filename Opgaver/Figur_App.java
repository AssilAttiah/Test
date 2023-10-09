package Opgaver;

import java.util.ArrayList;

public class Figur_App {
    public static void main(String[] args) {
        Figur f1=new Rektangel(4,3);
        Figur f2=new Punkt();

        ArrayList<Figur>list=new ArrayList<Figur>();
        list.add(f1);
        list.add(f2);
        list.add(new Rektangel(2,5));
        for (Figur f: list){
            System.out.println(f+" omkreds = "+f.beregnOmkreds()+" areal = "+f.beregnAreal());
        }//slut for
    }//slut main
}//slut class Figur_App

abstract class Figur{
    abstract double beregnOmkreds();
    abstract double beregnAreal();
}//slut class Figur

class Punkt extends Figur{
    double beregnOmkreds(){return 0;}
    double beregnAreal(){return 0;}

    public String toString(){
        return "Punkt";
    }//slut toString
}//slut class Punkt

class Rektangel extends Figur{
        double hojde;
        double bredde;
        Rektangel(double h, double b){
            hojde=h;
            bredde=b;
        }//slut constructor

    double beregnOmkreds(){
            return 2*(hojde+bredde);
    }//slut metode beregnOmkreds

    double beregnAreal(){
            return hojde*bredde;
    }//slut metode beregnAreal

    public String toString(){
            return "Rektangel h = "+hojde+"\t b = "+bredde;
    }//slut toString
}//slut class Rektangel