package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private Button summaryButton;
    private Button settingsButton;
    private Button inputButton;
    private Button resourceButton;
/*    private RecyclerView recyclerView;
    private RecyclerView.Adapter overviewAdapter;
    private RecyclerView.LayoutManager layoutManager;*/

    private static ArrayList<Nutrient> proteinArrayList = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> vitaminArrayList = new ArrayList<Nutrient>();
    private static ArrayList<Nutrient> mineralArrayList = new ArrayList<Nutrient>();


    protected void onCreate(Bundle savedInstanceState) {
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
        /*recyclerView = (RecyclerView) findViewById(R.id.overview);
        overviewAdapter = new OverviewAdapter(getOverview());
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(overviewAdapter);*/
        makeNutrientList();
    }
    //for quote create a list, copy list, delete from second list as they are used, refill list when empty, randomly generate
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
        ArrayList<Nutrient> overview = new ArrayList<Nutrient>();
        for(int i = 0; i < proteinArrayList.size(); i++){
            if(proteinArrayList.get(i).getOverview()) {
                overview.add(proteinArrayList.get(i));
            }
        }
        for(int i = 0; i < vitaminArrayList.size(); i++){
            if(vitaminArrayList.get(i).getOverview()) {
                overview.add(vitaminArrayList.get(i));
            }
        }
        for(int i = 0; i < mineralArrayList.size(); i++){
            if(mineralArrayList.get(i).getOverview()) {
                overview.add(mineralArrayList.get(i));
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
        for(int i = 0; i < 5; i++){
            String a = "Protein" +i;
            proteinArrayList.add(new Nutrient(a, i));
        }
    }
    public static ArrayList<Nutrient> getMaster(){
        ArrayList<Nutrient> master = new ArrayList<Nutrient>();
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
