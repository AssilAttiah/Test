package Opgaver;

public class Koordinatsys {
    public static void main(String[] args) {
        Point a=new Point(10,2);
        Point b=new Point(4,7);
        Point c=new Point(1,-3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }//slut main



}//slut class Koordinatsys
class Point{
    int x;
    int y;
    int distance;

    Point(int x, int y) {
        this.x=x;
        this.y=y;
//        distance=Math.sqrt((x-x)^2+(y1-y2)^2);
    }//slut cons


    public String toString() {
        return "("+x+","+y+")";
    }
}//slut class Point
