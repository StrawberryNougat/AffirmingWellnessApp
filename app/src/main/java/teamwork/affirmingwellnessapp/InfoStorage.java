package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InfoStorage extends AppCompatActivity{

    String name, pronouns, meal; //I think that we may want to add a pronoun option if the app ever uses them
    int age, height, weight;

    EditText nameInput;
    EditText ageInput;
    EditText heightIntput;
    EditText weightInput;
    EditText mealInput;

    Button submitButton;



    Button backButton;

    int bmr, tdee, proteinCals, carbCals, lipidCals;
    double vitA, vitB, vitC, calcium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_info);

        nameInput = (EditText) findViewById(R.id.nameInput);
        ageInput = (EditText) findViewById(R.id.ageInput);
        heightIntput = (EditText) findViewById(R.id.heightInput);
        weightInput = (EditText) findViewById(R.id.heightInput);
        mealInput = (EditText) findViewById(R.id.mealInput);


        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                age = Integer.valueOf(ageInput.getText().toString());
                height = Integer.valueOf(heightIntput.getText().toString());
                weight = Integer.valueOf(weightInput.getText().toString());
                meal = mealInput.getText().toString();
                startActivity(new Intent(InfoStorage.this, Settings.class));
            }
        });



    }
}
