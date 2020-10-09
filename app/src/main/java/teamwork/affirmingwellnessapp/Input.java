package teamwork.affirmingwellnessapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Input extends AppCompatActivity{
    //ProgressDialog progress = new ProgressDialog(this);
    protected void onCreate(Bundle savedInstanceState) {
        Button menuButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }
        });

    }
}
