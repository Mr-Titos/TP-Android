package modelview;

import retrofit2.Call;
import model.Donnes;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MonUrl {
    /**
     * @param login
     * @param mdp
     * @param selection
     */
    @GET("2018-btssio/api/")
    Call<Donnes> sSelectionAPI(@Query(value = "login", encoded = true) String login,
                               @Query(value = "mdp", encoded = true) String mdp,
                               @Query(value = "selection", encoded = true) int selection);
    //méthode asynchrone

}
