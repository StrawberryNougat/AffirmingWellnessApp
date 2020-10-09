package teamwork.affirmingwellnessapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

public class Summary extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        CustomAdapter proteinAdapter;
        CustomAdapter vitaminAdapter;
        CustomAdapter mineralAdapter;
        Button menuButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_main);

        proteinAdapter = new CustomAdapter(this, MainActivity.getProteinArrayList());
        vitaminAdapter = new CustomAdapter(this, MainActivity.getVitaminArrayList());
        mineralAdapter = new CustomAdapter(this, MainActivity.getMineralArrayList());
        Spinner proteinSpinner = findViewById(R.id.proteins);
        Spinner vitaminSpinner = findViewById(R.id.vitamins);
        Spinner mineralSpinner = findViewById(R.id.minerals);
        proteinSpinner.setAdapter(proteinAdapter);
        vitaminSpinner.setAdapter(vitaminAdapter);
        mineralSpinner.setAdapter(mineralAdapter);

        menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });
    }
}
