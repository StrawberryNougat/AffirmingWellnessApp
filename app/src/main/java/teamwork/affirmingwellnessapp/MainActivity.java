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

        makeNutrientList();

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
                startActivity(new Intent(MainActivity.this, HardCodeMeal.class));
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
            for (int i = 1; i < 5; i++) {
                String a = "Protein" + i;
                master.add(new Nutrient(a, i));
            }
        }
        master.get(2).setCurrent(60);
    }
    public static ArrayList<Nutrient> getMaster(){
        master.addAll(proteinArrayList);
        master.addAll(vitaminArrayList);
        master.addAll(mineralArrayList);
        return master;
    }
}
