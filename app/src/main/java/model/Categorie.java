package model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class Categorie {
    @SerializedName("id_categorie")
    private int id;
    @SerializedName("lib_categorie")
    private String lib;

    public Categorie (int id, String lib){
        this.id=id;
        this.lib=lib;
    }
    public String getLib(){
        return this.lib;
    }
}
