package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

//has drop down menu for things to add to main activity summary
public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Button inputButton;
    private Button menuButton;
    protected void onCreate(Bundle savedInstanceState) {
        SelectorAdapter sadapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        sadapter = new SelectorAdapter(this, MainActivity.getMaster());
        Spinner selector = findViewById(R.id.selector);
        selector.setAdapter(sadapter);
        selector.setOnItemClickListener((AdapterView.OnItemClickListener) this);

        menuButton = findViewById(R.id.menuButton);
        configureMenuButton();
        inputButton= findViewById(R.id.inputInfoButton);
        configureInputButton();
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.print(i);
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
    public void configureInputButton() {
        inputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.this, InfoStorage.class));
            }
        });
    }
    public void configureMenuButton() {
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
