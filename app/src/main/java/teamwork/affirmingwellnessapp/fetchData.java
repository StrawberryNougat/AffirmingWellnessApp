package teamwork.affirmingwellnessapp;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void> {
    String data="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.edamam.com/api/food-database/v2/parser?ingr=red%20apple&app_id=2a05ecdf&app_key=0a596e61132a5bab98bc647c8d917822");
            HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
<<<<<<< Updated upstream
            InputStream inputStream=  httpURLConnection.getInputStream();
=======
            InputStream inputStream =  httpURLConnection.getInputStream();
>>>>>>> Stashed changes
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while(line!=null){
                line = bufferedReader.readLine();
                data=data+line;
            }
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
<<<<<<< Updated upstream
        MainActivity.data.setText(this.data);
    }
}
=======
        Input.data.setText(this.data);
    }
}


>>>>>>> Stashed changes
