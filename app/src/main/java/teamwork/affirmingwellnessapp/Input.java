package teamwork.affirmingwellnessapp;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

public class Input extends AppCompatActivity {
    ProgressDialog progress = new ProgressDialog(this);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);


    }
}
