package teamwork.affirmingwellnessapp;


import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class InfoStorage extends AppCompatActivity {

    public static String name, pronouns, meal; //I think that we may want to add a pronoun option if the app ever uses them
    public static int age, height, weight;

    EditText nameInput;
    EditText ageInput;
    EditText heightIntput;
    EditText weightInput;
    EditText mealInput;



    Button submitButton;

    Button backButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_info);

        nameInput = (EditText) findViewById(R.id.nameInput);
        ageInput = (EditText) findViewById(R.id.ageInput);
        heightIntput = (EditText) findViewById(R.id.heightInput);
        weightInput = (EditText) findViewById(R.id.heightInput);


        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                age = Integer.valueOf(ageInput.getText().toString());
                height = Integer.valueOf(heightIntput.getText().toString());
                weight = Integer.valueOf(weightInput.getText().toString());
                meal = mealInput.getText().toString();


            }
        });

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InfoStorage.this, MainActivity.class));
            }
        });



    }

}
