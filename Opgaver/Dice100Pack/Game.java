package Opgaver.Dice100Pack;

public class Game {
    Player p1=new Player("Assil");
    Player p2=new Player("Mads");
    Player p3=new Player("John");

    void play(){
        System.out.println(p1.name+"\t"+p2.name+"\t"+p3.name+"\tture");
        int turns=0;
        while (p1.points<100 && p2.points<100 && p3.points<100) {
            p1.turn();
            p2.turn();
            p3.turn();
            System.out.println(p1.points +"\t\t"+ p2.points+"\t\t"+p3.points+"\t\t"+turns++);

            if (p1.points>=100){
                System.out.println("\nTillykke "+p1.name+"\nDu vandt!");
            }//slut if
            else if(p2.points>=100){
                System.out.println("\nTillykke "+p2.name+"\nDu vandt!");
            }//slut else if
            else if (p3.points>=100){
                System.out.println("Tillykke "+p3.name+"\nDu vandt!");
            }//slut else if
        }//slut while loop
    }//slut play metode

    public static void main(String[] args) {
        Game game=new Game();
        game.play();
    }//slut main
}//slut class Game
