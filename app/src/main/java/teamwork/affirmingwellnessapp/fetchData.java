package teamwork.affirmingwellnessapp;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void> {
    String data="[";
    String dataParsed="";
    String singleParsed="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://api.edamam.com/api/food-database/v2/parser?upc=011284003014&app_id=2a05ecdf&app_key=0a596e61132a5bab98bc647c8d917822");
            HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
            InputStream inputStream =  httpURLConnection.getInputStream();
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));
            String line="";
            while(line!=null){
                line = bufferedReader.readLine();
                data=data+line;
            }
            data= data.substring(0,data.length()-4)+"]";
            JSONArray JA = new JSONArray(data);
            for(int i=0; i <JA.length();i++){
                JSONObject JO= (JSONObject) JA.get(i);
                //JSONObject parsedFood = (JSONObject) JO.get("text");
                //JSONObject food= (JSONObject)parsedFood.get("food");
                //singleParsed="Name"+food.get("label")+"\n";
                singleParsed="Name"+JO.get("text")+"\n";
                dataParsed= dataParsed+singleParsed;
            }
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Input.data.setText(this.dataParsed);
    }
}



