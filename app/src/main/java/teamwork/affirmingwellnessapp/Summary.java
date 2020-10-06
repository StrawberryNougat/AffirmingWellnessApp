package teamwork.affirmingwellnessapp;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class Summary extends AppCompatActivity {
   // ProgressDialog progress = new ProgressDialog(this);

    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Protein> proteinArrayList = new ArrayList<Protein>();
        CustomAdapter mAdapter;
        Button menuButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_main);
        for(int i = 0; i < 5; i++){
            String a = "Protein" +i;
            proteinArrayList.add(new Protein(a));
        }
        mAdapter = new CustomAdapter(this, proteinArrayList);
        Spinner proteinSpinner = findViewById(R.id.proteins);
        proteinSpinner.setAdapter(mAdapter);
        menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });

    }
}
