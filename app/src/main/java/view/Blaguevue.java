package view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lesblaguessio.R;

import java.util.ArrayList;

import model.Blague;
import modelview.Controller;

public class Blaguevue extends AppCompatActivity {
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blagues);
        MyAdapter myAdapter = new MyAdapter(this,R.layout.blague_item,Controller.lesBlagues);
        GridView list_blagues = findViewById(R.id.listBlagues);
        list_blagues.setAdapter(myAdapter);
        list_blagues.setOnItemClickListener(gridview_listener);
    }


    AdapterView.OnItemClickListener gridview_listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
            Blague blague = Controller.lesBlagues.get(position);
            String text = "Titre : " + blague.getTitre()
                        + "\nDescription : " + blague.getLaDescription()
                        + "\nCategorie : " + blague.getLaCategorie().getLib();
            TextView detail = (TextView) findViewById(R.id.blaguedetailText);
            detail.setText(text);
        }
    };

}

class MyAdapter extends ArrayAdapter {

    ArrayList<Blague> blagues = new ArrayList<>();

    MyAdapter(Context context, int textViewResourceId, ArrayList<Blague> objects) {
        super(context, textViewResourceId, objects);
        blagues = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.blague_item, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(blagues.get(position).getTitre());
        return v;

    }

}