package Opgaver.Dice100Pack;

public class Player {
    String name;
    Cup cup=new Cup();
    int points;

    Player(String name){
        this.name=name;
    }//slut constructor

    void turn(){
        cup.roll();
        points=points+cup.getSum();
    }//slut turn Metode

    public static void main(String[] args) {
        Player p =new Player("Ole");
        while (p.points<100){
            p.turn();
            System.out.println(p.points);
        }//slut while loop
    }//slut main
}//slut class Player
