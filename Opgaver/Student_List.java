package Opgaver;

import java.io.*;//Importerer alt i "java.io" pakken
import java.util.ArrayList;


public class Student_List {
    public static void main(String[] args) throws IOException {
        FileReader fil= new FileReader("StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> list=new ArrayList<String>();
        String linje = ind.readLine();
        while (linje !=null)
        {
            //denne linjer splitter navnene i listen efter kommaer
            String[] bidder = linje.split(",");
            String navn=bidder[0];
            list.add(navn);
            linje = ind.readLine();
        }//Slut while

        fil.close();
        list.sort(null);
        for (String s: list){
            System.out.println(s);
        }//Slut for
        SaveList(list);
    }//Slut main

    static void SaveList(ArrayList<String> l) throws IOException{
        FileWriter fil = new FileWriter("StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);

        for (String s: l){
            ud.println(s);
        }//Slut for
        fil.close();

    }//Slut SaveList Metode
}//Slut class