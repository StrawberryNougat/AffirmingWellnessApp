package teamwork.affirmingwellnessapp;

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
    private static ArrayList<Nutrient> master = new ArrayList<Nutrient>();

    protected void onCreate(Bundle savedInstanceState) {
        makeNutrientList();
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
                startActivity(new Intent(MainActivity.this, Settings.class));
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
        if(master.size()==0) {
            master.add(new Nutrient("Carbs", 150));
            master.add(new Nutrient("Lipid", 70));
            master.add(new Nutrient("Protein", 100));
            master.add(new Nutrient("Vitamin A", 700));
            master.add(new Nutrient("Vitamin B-12", 2));
            master.add(new Nutrient("Vitamin C", 90));
            master.add(new Nutrient("Calcium", 1000));
        }
    }
    public static ArrayList<Nutrient> getMaster(){
        master.addAll(proteinArrayList);
        master.addAll(vitaminArrayList);
        master.addAll(mineralArrayList);
        return master;
    }
}
