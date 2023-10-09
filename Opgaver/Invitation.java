package Opgaver;

public class Invitation {
    public static void main(String[] args) {
        // Denne metode trækker fra "Static Void printInvitation" under
        printInvitation("Ole","cola");
        printInvitation("Pia", "Fanta");
        printInvitation("Ulla", "Lemon");
    }
    static void printInvitation(String navn, String drik){
        System.out.println("Kære "+navn);
        System.out.println("Det ville glæde mig meget at se dig til min fødselsdag");
        System.out.println("onsdag d. 4/6 klokken 14.");
        System.out.println("Venlig hilsen");
        System.out.println("Assil");
        System.out.println();
        System.out.println("PS, medbring gerne en "+drik);
        System.out.println();
    }
}
