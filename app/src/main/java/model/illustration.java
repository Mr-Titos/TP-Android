package model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class illustration {
    @SerializedName("id_illustration")
    private int id;
    @SerializedName("img_illustration")
    private String lib;

    public illustration (int id, String lib){
        this.id=id;
        this.lib=lib;
    }
    public String getLib(){
        return this.lib;
    }
}
