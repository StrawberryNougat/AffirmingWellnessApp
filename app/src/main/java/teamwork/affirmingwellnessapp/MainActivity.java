package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button summaryButton;
    private Button settingsButton;
    private Button inputButton;
    private Button resourceButton;
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

}
