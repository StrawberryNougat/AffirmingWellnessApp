package teamwork.affirmingwellnessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Input extends AppCompatActivity {
    //ProgressDialog progress = new ProgressDialog(this);
    private Button mealButton;
    public static TextView data;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
<<<<<<< Updated upstream
=======
        mealButton = (Button)findViewById(R.id.crying);
        data = (TextView) findViewById(R.id.fetchedData);
        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
            }
        });

>>>>>>> Stashed changes
    }
}
