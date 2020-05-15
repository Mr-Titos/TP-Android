package model;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
@SuppressWarnings("ALL")
public class Personne implements Serializable {
    @SerializedName(value="nom")
    private String leNom ;
    @SerializedName("prenom")
    private String lePrenom ;

}
