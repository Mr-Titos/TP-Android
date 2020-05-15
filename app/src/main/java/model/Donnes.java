package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class Donnes {
    /**
     * Les variables d'instances
     * */
    @SerializedName("success")
    private String succees;
    @SerializedName("message")
    private String message;
    @SerializedName("results")
    private Resultat result;
    @SerializedName("connexion")
    private int laconnexion;
    /**
     * Le constructeur
     * @param succes
     * @param message
     * @param result
     * @param laconnexion
     * */

    public Donnes(String succes, String message, Resultat result, int laconnexion){
        this.succees=succes;
        this.message=message;
        this.result=result;
        this.laconnexion=laconnexion;
    }
    public Donnes (){}

    /**
     * L'accesseur de message
     * @return
     * */
    public String getLeMessage(){
        return this.message;
    }
    /**
     * L'accesseur de connexion
     * @return
     * */
    public void SetMessage(String message){
        this.message=message;
    }
    public int getLaConnexion(){
        return this.laconnexion;
    }
    /**
     * L'accesseur deresult
     * @return
     * */
    public void SetConnexion(String laConnexion){
        this.laconnexion=laconnexion;
    }

    public Resultat getLeResultat(){
        return this.result;    }
        /**
         * L'accesseur de succees
         * @return
         * */
        public void SetResultat(Resultat result){
            this.result=result;
        }

    public String getLesucces(){
            return this.succees;
        }
    public void SetLesucces(String succees){
        this.succees=succees;
    }
}
