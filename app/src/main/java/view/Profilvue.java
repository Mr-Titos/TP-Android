package view;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesblaguessio.R;

import modelview.Controller;

public class Profilvue extends AppCompatActivity {
    TextView resultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profils);
        resultat = (TextView) findViewById(R.id.profilText);
        String text = "Pseudo :" + Controller.lAuteur.getPseudo()
                + "\nNom : " + Controller.lAuteur.getNom()
                + "\nPrenom : " + Controller.lAuteur.getPrenom()
                +("\n" + "Code postal : ") + Controller.lAuteur.getCP()
                + "\nDescription : " + Controller.lAuteur.getDescription();

        resultat.setText(text);
    }
}
