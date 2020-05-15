package view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesblaguessio.R;

import modelview.Controller;

public class Connexion extends AppCompatActivity {
    /**     * Les variables d'instance     */
    private EditText txtLogin;
    private EditText txtMdp;
    private ImageButton btnConnexion;
    private Controller controller;
    /**
     * Le constructeur de l'activité Connexion
     ** @param savedInstanceState     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connexion);
        init();
    }
    /**
     * Initialisation des liens avec les objets graphiques     */
    private void init(){
        this.txtLogin=(EditText) findViewById(R.id.txtLogin);
        this.txtMdp = (EditText) findViewById(R.id.txtMdp);
        this.btnConnexion=(ImageButton) findViewById(R.id.btnConnexion);
        this.ListenBtnConnexion();
        this.controller=Controller.getInstance();
    }
    /**     * Evenement click sur le bouton btnConnexion     */
    private void ListenBtnConnexion(){
        this.btnConnexion.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Récupérer les données saisies
                String login=txtLogin.getText().toString();
                String mdp=txtMdp.getText().toString();
                controller.ObtenirInformation(login, mdp,0, Connexion.this);
                // Toast.makeText(Connexion.this,Toast.LENGTH_SHORT).show();
                // Controller les données saisies
                }
        });
    }
}