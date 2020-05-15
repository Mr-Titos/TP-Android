package view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesblaguessio.R;

import modelview.Controller;

public class Resultatvue extends AppCompatActivity {
    /**     * Les variables d'instance     */
    TextView resultat;
    String login;
    String mdp;
    /**
     * Le constructeur de l'activité Resultatvue     * @param savedInstanceState     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultatvue);
        Intent intent = getIntent();
        login = intent.getStringExtra("login");
        mdp = intent.getStringExtra("password");
        //Auteur lAuteur = (Auteur) savedInstanceState.getPseudo();
        resultat = (TextView) findViewById(R.id.monresultat);
        resultat.setText("Auteur du livre 0 :" + Controller.lAuteur.getPseudo());
        }

    public void VueProfil(View view) {
        Controller.getInstance().ObtenirProfil(login, mdp, 0, Resultatvue.this);
    }

    public void VueBlague(View view) {
        Controller.getInstance().ObtenirLesBlagues(login, mdp, 0, Resultatvue.this);
    }
}