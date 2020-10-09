package teamwork.affirmingwellnessapp;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Input extends AppCompatActivity {

    private Button mealButton;
    public static TextView data;
    private EditText meal;
    public static String mealInput="";

    protected void onCreate(Bundle savedInstanceState) {
        Button menuButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);

        menuButton = findViewById(R.id.menuButton);
        menuButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();

        mealButton = (Button)findViewById(R.id.crying);
        data = (TextView) findViewById(R.id.fetchedData);
        meal=(EditText)findViewById(R.id.wtf);

        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mealInput=meal.getText().toString();
                setContentView(R.layout.summary_main);
                Button menu=(Button)findViewById(R.id.menuButton);
                menu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                /*if(mealInput=="apple"){

                }*/

                /*if(mealInput.indexOf(" ")!=-1){
                    for(int i=0;i<mealInput.length();i++){
                        if(mealInput.charAt(i)==' '){
                            mealInput=mealInput.substring(0,i)+"%20"+mealInput.substring(i+1);
                        }
                    }
                }
                fetchData process = new fetchData();
                process.execute();*/
            }
        });

    }
}
