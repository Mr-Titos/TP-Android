package model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class Resultat {
    @SerializedName("auteur")
    private Auteur LAuteur;
    @SerializedName("total")
    private int total;
    @SerializedName("blagues")
    private Blague[] LesBlagues;

    public Resultat (Auteur LAuteur, int total, Blague[] LesBlagues){
        this.LAuteur=LAuteur;
        this.total=total;
        this.LesBlagues=LesBlagues;
    }
    public Resultat (){}
    public Auteur getLAuteur(){
        return this.LAuteur;
    }
    public int getTotal() { return this.total; }
    public Blague[] getLesBlagues(){
        return this.LesBlagues;
    }
    //public void AjouterBlagues(b:Blagues){}
}
