package teamwork.affirmingwellnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HardCodeMeal extends AppCompatActivity {



    EditText carbInput;
    EditText lipidInput;
    EditText proteinInput;
    EditText vitAInput;
    EditText vitBInput;
    EditText vitCInput;
    EditText calciumInput;




    Button submitButton;

    Button backButton;

    static int currCarb, currLip, currPro;
    static double currVitA, currVitB, currVitC, currCalcium;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hardcode_meal);

        carbInput = (EditText) findViewById(R.id.carbInput);
        lipidInput = (EditText) findViewById(R.id.lipidInput);
        proteinInput = (EditText) findViewById(R.id.proteinInput);
        vitAInput = (EditText) findViewById(R.id.vitAInput);
        vitBInput = (EditText) findViewById(R.id.vitBInput);
        vitCInput = (EditText) findViewById(R.id.vitCInput);
        calciumInput = (EditText) findViewById(R.id.calciumInput);


        submitButton = (Button) findViewById(R.id.button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                currCarb = Integer.valueOf(carbInput.getText().toString());
                currLip = Integer.valueOf(lipidInput.getText().toString());
                currPro = Integer.valueOf(proteinInput.getText().toString());
                currVitA = Integer.valueOf(vitAInput.getText().toString());
                currVitB = Integer.valueOf(vitBInput.getText().toString());
                currVitC = Integer.valueOf(vitCInput.getText().toString());
                currCalcium = Integer.valueOf(calciumInput.getText().toString());





            }
        });

        backButton = (Button) findViewById(R.id.back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HardCodeMeal.this, MainActivity.class));
            }
        });



    }

}
