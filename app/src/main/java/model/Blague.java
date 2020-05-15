package model;

import android.widget.ScrollView;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class Blague {
    @SerializedName("id_auteur")
    private int idAuteur;
    @SerializedName("id_illustration")
    private int idillus;
    @SerializedName("id_categorie")
    private int idcat;
    @SerializedName("id_blague")
    private int idblague;
    @SerializedName("titre_blague")
    private String titre;
    @SerializedName("desc_blague")
    private String descblague;
    @SerializedName("px_blague")
    private Double px;
    @SerializedName("auteur")
    private Auteur lAuteur;
    @SerializedName("illustration")
    private illustration lIllustration;
    @SerializedName("categorie")
    private Categorie laCategorie  ;

    public Blague (int id, int idillus, int idcat, int idblague, String titre, String descblague, Double px, Auteur lAuteur, illustration lIllustration, Categorie laCategorie){
        this.idAuteur =id;
        this.idillus=idillus;
        this.idcat=idcat;
        this.idblague=idblague;
        this.titre=titre;
        this.descblague=descblague;
        this.px=px;
        this.lAuteur=lAuteur;
        this.lIllustration=lIllustration;
        this.laCategorie=laCategorie;
        this.laCategorie=laCategorie;
    }
    public Blague() {

    }
    public  Auteur getLAuteur(){
        return this.lAuteur;
    }
    public illustration  getLIllustration(){
        return this.lIllustration;
    }
    public Categorie  getLaCategorie(){
        return this.laCategorie;
    }
    public int  getIdblague(){
        return this.idblague;
    }
    public String  getTitre(){
        return this.titre;
    }
    public String  getLaDescription(){
        return this.descblague;
    }
    public Double getPx(){
        return this.px;
    }
    public void setTitre(String titre) { this.titre = titre; }


}
