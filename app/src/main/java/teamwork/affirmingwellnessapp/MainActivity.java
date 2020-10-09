package teamwork.affirmingwellnessapp;


<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button summaryButton;
    private Button settingsButton;
    private Button inputButton;
    private Button resourceButton;

    private static ArrayList<Nutrient> proteinArrayList = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> vitaminArrayList = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> mineralArrayList = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> overview = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> master = new ArrayList<Nutrient>();


    protected void onCreate(Bundle savedInstanceState) {
        makeNutrientList();
        CustomAdapter overviewAdapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        summaryButton = (Button) findViewById(R.id.summary);
        settingsButton = findViewById(R.id.settings);
        inputButton = findViewById(R.id.input);
        resourceButton = findViewById(R.id.resources);
        configureSummaryButton();
        configureSettingsButton();
        configureInputButton();
        configureResourceButton();
        overviewAdapter = new CustomAdapter(this, MainActivity.getOverview());
        Spinner overviewSpinner = findViewById(R.id.overviewSpinner);
        overviewSpinner.setAdapter(overviewAdapter);
    }
    public void configureSummaryButton(){
        summaryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Summary.class));
            }
        });
    }
    public void configureSettingsButton(){
        settingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InfoStorage.class));
            }
        });
    }
    public void configureInputButton(){
        inputButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Input.class));
            }
        });
    }
    public void configureResourceButton(){
        resourceButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Resources.class));
            }
        });
    }
    public static ArrayList<Nutrient> getOverview(){
        for(int i = 0; i < master.size(); i++) {
            if (master.get(i).getOverview()) {
                overview.add(master.get(i));
            }
        }
        return overview;
    }
    public static ArrayList<Nutrient> getProteinArrayList(){
        return proteinArrayList;
    }
    public static ArrayList<Nutrient> getVitaminArrayList(){
        return vitaminArrayList;
    }
    public static ArrayList<Nutrient> getMineralArrayList(){
        return mineralArrayList;
    }
    public void makeNutrientList(){
       // if(master.size()==0) {
            for (int i = 1; i < 5; i++) {
                String a = "Protein" + i;
                master.add(new Nutrient(a, i));
            }
        //}
    }
    public static ArrayList<Nutrient> getMaster(){
        for(int i = 0; i < proteinArrayList.size(); i++){
            master.add(proteinArrayList.get(i));
        }
        for(int i = 0; i < vitaminArrayList.size(); i++){
            master.add(vitaminArrayList.get(i));
        }
        for(int i = 0; i < mineralArrayList.size(); i++){
            master.add(mineralArrayList.get(i));
        }
        return master;
    }

}
