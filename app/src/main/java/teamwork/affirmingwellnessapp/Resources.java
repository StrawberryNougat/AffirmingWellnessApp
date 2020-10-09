package teamwork.affirmingwellnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

public class Resources extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        Button menuButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resource);
        menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });
    }
}
