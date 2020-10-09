package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

//has drop down menu for things to add to main activity summary
public class Settings extends AppCompatActivity {
    private Button inputButton;
    private Button menuButton;
    protected void onCreate(Bundle savedInstanceState) {
        SelectorAdapter sadapter;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        sadapter = new SelectorAdapter(this, MainActivity.getMaster());
        Spinner selector = findViewById(R.id.selector);
        selector.setAdapter(sadapter);


        menuButton = findViewById(R.id.menuButton);
        configureMenuButton();
        inputButton= findViewById(R.id.inputInfoButton);
        configureInputButton();
    }
   /* public void setChecked(){
        if(sadapter.getCheck().ischecked){

        }
    }*/

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
