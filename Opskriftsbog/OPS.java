package Opskriftsbog;

public class OPS{
    String opsNavn;
    public String kategori;
    String[] ingredienser;
    int rating;

    OPS (String opn, String kat, String ing, int rating){
        opsNavn=opn;
        kategori=kat;
        ingredienser= new String[]{ing};
        this.rating=rating;
    }//slut constructor OPS
}//slut class OPS
