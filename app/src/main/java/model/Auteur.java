package model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")

public class Auteur {
    @SerializedName("id_auteur")
    private int id;
    @SerializedName("pseudo_auteur")
    private String pseudo;
    @SerializedName("mdp_auteur")
    private String mdp;
    @SerializedName("img_auteur")
    private String img;
    @SerializedName("nom_auteur")
    private String nom;
    @SerializedName("pre_auteur")
    private String prenom;
    @SerializedName("rue_auteur")
    private String rue;
    @SerializedName("cp_auteur")
    private String cp;
    @SerializedName("ville_auteur")
    private String ville;
    @SerializedName("tel_auteur")
    private String tel;
    @SerializedName("email_auteur")
    private String email;
    @SerializedName("descriptif")
    private String description;
    @SerializedName("date")
    private String date;


    public Auteur (int id, String pseudo, String mdp, String img, String nom, String prenom, String rue, String cp, String ville, String tel, String email, String description, String date){
        this.id=id;
        this.pseudo=pseudo;
        this.mdp=mdp;
        this.img=img;
        this.nom=nom;
        this.prenom=prenom;
        this.rue=rue;
        this.cp=cp;
        this.ville=ville;
        this.tel=tel;
        this.email=email;
        this.description=description;
    }
    public Auteur (){}


    public int getId(){
        return this.id;
    }
    public String getPseudo(){
        return this.pseudo;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getRue(){
        return this.rue;
    }
    public String getCP(){
        return this.cp;
    }
    public String getVille(){
        return this.ville;
    }
    public String getTel(){
        return this.tel;
    }
    public String getEMail(){
        return this.email;
    }
    public String getDescription(){
        return this.description;
    }
}
