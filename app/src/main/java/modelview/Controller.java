package modelview;

import android.content.Intent;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import model.Auteur;
import model.Blague;
import model.Donnes;
import model.Resultat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import view.Blaguevue;
import view.Profilvue;
import view.Resultatvue;


public class Controller {
/**
 *Les variables d'instance
 */
private static Controller instance=null;
private Donnes lesDonnes;
private Retrofit retrofit;
public static AppCompatActivity page;
public static Auteur lAuteur;
public static ArrayList<Blague> lesBlagues=new ArrayList<Blague>();
/**
 * Controller
 */
private Controller() {
    super();
    retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://btsinfo-rousseau53.fr:11017/")
            .build();
}
/**
 * Création de l'instance
 * @return
 */
public static final Controller getInstance(){
    if(Controller.instance==null){
        Controller.instance=new Controller();
    }
    return Controller.instance;
}
    /**

     * Obtenir le résultat de l'API
     * @param login
     * @param mdp
     * @param selection
     * @param page
     */
    public void ObtenirInformation(final String login, final String mdp, int selection, AppCompatActivity page){
        MonUrl service = retrofit.create( MonUrl.class);
        this.page=page;
        service.sSelectionAPI(login,mdp,selection).enqueue(new Callback<Donnes>() {
            @Override
            public void onResponse(Call<Donnes> call, Response<Donnes> response) {

                Resultat leres=response.body().getLeResultat();
                Log.i("Pseudo",response.body().getLeResultat().getLAuteur().getPseudo());
                Log.i("Blague1",response.body().getLeResultat().getLesBlagues()[0].getTitre());
                Log.i("Blague1_description",response.body().getLeResultat().getLesBlagues() [0].getLaDescription());
                Log.i("Blague1_px",response.body().getLeResultat().getLesBlagues()[0].getPx()+"€");
                Log.i("Blague1_Auteur",response.body().getLeResultat().getLesBlagues() [0].getLAuteur().getPseudo());
                Log.i("Blague1_categorie",response.body().getLeResultat().getLesBlagues() [0].getLaCategorie().getLib());
                Log.i("Blague1_illustration",response.body().getLeResultat().getLesBlagues() [0].getLIllustration().getLib());
        lAuteur=response.body().getLeResultat().getLesBlagues()[0].getLAuteur();
        for(Blague b:response.body().getLeResultat().getLesBlagues()){
            lesBlagues.add(b);
                System.out.println(response.body());
        }

            Intent passage = new Intent( Controller.page, Resultatvue.class );
                passage.putExtra("login",login);
                passage.putExtra("password", mdp);
                Controller.page.startActivityForResult(passage, 0);
            }
           @Override
public void onFailure(Call<Donnes> call, Throwable t) {

        }
        });
    }
    public void ObtenirProfil(String login, String mdp, int selection, AppCompatActivity page){
        MonUrl service = retrofit.create( MonUrl.class);
        this.page=page;
        service.sSelectionAPI(login,mdp,selection).enqueue(new Callback<Donnes>() {
            @Override
            public void onResponse(Call<Donnes> call, Response<Donnes> response) {

                lAuteur=response.body().getLeResultat().getLAuteur();
                Log.i("Pseudo",lAuteur.getPseudo());

                Intent passage = new Intent( Controller.page, Profilvue.class );
                Controller.page.startActivityForResult(passage, 0);
            }
            @Override
            public void onFailure(Call<Donnes> call, Throwable t) {

            }
        });
    }
    public void ObtenirLesBlagues(String login, String mdp, int selection, AppCompatActivity page) {
        MonUrl service = retrofit.create( MonUrl.class);
        this.page=page;
        service.sSelectionAPI(login,mdp,selection).enqueue(new Callback<Donnes>() {
            @Override
            public void onResponse(Call<Donnes> call, Response<Donnes> response) {

                for(Blague b:response.body().getLeResultat().getLesBlagues()){
                    lesBlagues.add(b);
                    System.out.println(response.body());
                }

                Intent passage = new Intent( Controller.page, Blaguevue.class );
                Controller.page.startActivityForResult(passage, 0);
            }
            @Override
            public void onFailure(Call<Donnes> call, Throwable t) {

            }
        });
    }
}




