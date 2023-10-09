package Opgaver;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPG {
    static Scanner scan= new Scanner(System.in);
    static Random rand= new Random();
    public static String playerName;
    public static String charRace;
    public static String charclass;
    public static int maxhp;
    public static int playerhp;
    public static int playerMeleeDmg;
    public static int playerRangedDmg;
    public static int maxmana;
    public static int playermana;
    public static int level;
    public static String enemyclass;
    public static int enemyhp;
    public static int enemyMeleeDmg;
    public static int enemyRangedDmg;

    private static void stats() {
        if(charclass.equalsIgnoreCase("mage")){
            System.out.println("\n"+playerName + "\n("+charRace+ " "+ charclass + ")" + "\nHP: " + playerhp + "\nDamage: " + playerRangedDmg + "\nMana: " + playermana + "\nLevel: " + level);
        }//slut If Mage
        if(charclass.equalsIgnoreCase("Ranger")){
            System.out.println("\n"+playerName + "\n("+charRace+" " + charclass + ")" + "\nHP: " + playerhp + "\nDamage: " + playerRangedDmg + "\nLevel: " + level);
        }//slut if Ranger
        if(charclass.equalsIgnoreCase("Warrior")){
            System.out.println("\n"+playerName + "\n("+charRace+" " + charclass + ")" + "\nHP: " + playerhp + "\nDamage: " + playerMeleeDmg + "\nLevel: " + level);
        }//slut if Warrior
        if(charclass.equalsIgnoreCase("Rogue")){
            System.out.println("\n"+playerName + "\n("+charRace+" " + charclass + ")" + "\nHP: " + playerhp + "\nDamage: " + playerMeleeDmg + "\nLevel: " + level);
        }//slut if Rogue
    }//slut stats
//__________________________________________CLASSES+RACES+ABILITIES_______________________________________________
private static void warriorClass(){
    charclass = "Warrior";
    maxhp=20;
    playerhp=20;
    playerMeleeDmg=6;
    level=1;
        ArrayList<String> warriorAbilities = new ArrayList<>();
        warriorAbilities.add("Slice");
        warriorAbilities.add("Spinning Sword");
        warriorAbilities.add("Crushing Blow");
        warriorAbilities.add("Charging Slash");
    }//slut warriorClass

    private static void rangerClass(){
    charclass = "Ranger";
    maxhp=14;
    playerhp=14;
    playerRangedDmg=8;
    level=1;
        ArrayList<String> rangerAbilities = new ArrayList<>();
        rangerAbilities.add("Piercing Shot");
        rangerAbilities.add("Arrow Storm");
        rangerAbilities.add("Rapid Fire");
        rangerAbilities.add("Bomb Arrow");
    }//slut archerClass


    private static void mageClass(){
    charclass = "Mage";
    maxhp=10;
    playerhp=10;
    playerRangedDmg=11;
    maxmana=20;
    playermana=20;
    level=1;
        ArrayList<String> mageAbilities = new ArrayList<>();
        mageAbilities.add("Fireball");
        mageAbilities.add("Nova Blast");
        mageAbilities.add("Blizzard");
        mageAbilities.add("Arcane Missiles");
    }//slut mageClass

    private static void rogueClass(){
    charclass= "Rogue";
    maxhp=14;
    playerhp=14;
    playerMeleeDmg=8;
    level=1;
        ArrayList<String> rogueAbilities=new ArrayList<>();
        rogueAbilities.add("Sneaky Blade");
        rogueAbilities.add("Backstab");
        rogueAbilities.add("Knife Throw");
        rogueAbilities.add("Ambush");
    }//slut rogueClass

    private static void humanRace(){
        charRace="Human";}

    private static void elfRace(){
        charRace="Elf";}

    private static void dragonbornRace(){
        charRace="Dragonborn";}

    private static void goblinRace(){
        charRace="Goblin";}

    private static void dwarfRace(){
        charRace="Dwarf";}
//_______________________________________________USE_ABILITIES___________________________________________________
    private static void executePlayerAbilityWarrior(){
        System.out.println("\n");
        System.out.println("Use Ability:\n");
        System.out.println("'1' Slice");
        System.out.println("'2' Spinning Sword");
        System.out.println("'3' Crushing Blow");
        System.out.println("'4' Charging slash");
    }//slut warrior ability

    private static void executePlayerAbilityRanger(){
        System.out.println("\n");
        System.out.println("Use Ability:\n");
        System.out.println("'1' Piercing Shot");
        System.out.println("'2' Arrow Storm");
        System.out.println("'3' Rapid Fire");
        System.out.println("'4' Bomb Arrow");
    }//slut ranger ability

    private static void executePlayerAbilityMage(){
        System.out.println("\n");
        System.out.println("Use Ability:\n");
        System.out.println("'1' Fireball");
        System.out.println("'2' Nova Blast");
        System.out.println("'3' Blizzard");
        System.out.println("'4' Arcane Missiles");
    }//slut mage ability

    private static void executePlayerAbilityRogue(){
        System.out.println("\n");
        System.out.println("Use Ability:\n");
        System.out.println("'1' Sneaky Blade");
        System.out.println("'2' Backstab");
        System.out.println("'3' Knife Throw");
        System.out.println("'4' Ambush");
    }//slut rogue ability

    String choice= scan.nextLine();

//___________________________________________ENEMIES________________________________________________________
    private static void enemyBrute(){
    enemyclass = "Brute";
    maxhp=35;
    enemyhp=35;
    enemyMeleeDmg=10;
    }//slut enemyBrute

    private static void enemyRanger(){
    enemyclass = "Ranger";
    maxhp=15;
    enemyhp=15;
    enemyRangedDmg=8;
    }//slut enemyRanger

    private static void enemySorcerer(){
    enemyclass = "Sorcerer";
    maxhp=12;
    enemyhp=12;
    enemyRangedDmg=7;
    }//slut enemySorcerer
//____________________________________CHARACTER CREATE________________________________________________________________
    public static void main(String[] args) {
        String charclass;
        while(true){
            System.out.println("Enter Name");
            playerName=scan.nextLine();
            System.out.println("Choose Your Race");
            System.out.println("'1' for Human");
            System.out.println("'2' for Elf");
            System.out.println("'3' for Dragonborn");
            System.out.println("'4' for Goblin");
            System.out.println("'5' for Dwarf");
            charRace= scan.nextLine();
            System.out.println("Choose Your Class");
            System.out.println("'1' for Warrior");
            System.out.println("'2' for Archer");
            System.out.println("'3' for Mage");
            System.out.println("'4' for Rogue");
            charclass= scan.nextLine();

            while(charRace.charAt(0) !='1' && charRace.charAt(0) !='2' && charRace.charAt(0) !='3' && charRace.charAt(0) !='4' && charRace.charAt(0) !='5'){
                System.out.println("'1' for Human");
                System.out.println("'2' for Elf");
                System.out.println("'3' for Dragonborn");
                System.out.println("'4' for Goblin");
                System.out.println("'5' for Dwarf");
            }//slut while Race Creator

            while(charclass.charAt(0) !='1' && charclass.charAt(0) != '2' && charclass.charAt(0) !='3' && charclass.charAt(0) !='4'){
                System.out.println("'1' for Warrior");
                System.out.println("'2' for Archer");
                System.out.println("'3' for Mage");
                System.out.println("'4' for Rogue");
                charclass= scan.nextLine();
            }//slut while Class Creator
            if(charRace.charAt(0)=='1'){
                humanRace();
            }
            if(charRace.charAt(0)=='2'){
                elfRace();
            }
            if(charRace.charAt(0)=='3'){
                dragonbornRace();
            }
            if(charRace.charAt(0)=='4'){
                goblinRace();
            }
            if(charRace.charAt(0)=='5'){
                dwarfRace();
            }
            if(charclass.charAt(0)=='1'){
                warriorClass();
            }
            if (charclass.charAt(0)=='2'){
                rangerClass();
            }
            if (charclass.charAt(0)=='3'){
                mageClass();
            }
            if (charclass.charAt(0)=='4'){
                rogueClass();
            }//slut if class+race creator
            stats();
        }//slut while start game
    }//slut main
}//slut class RPG

