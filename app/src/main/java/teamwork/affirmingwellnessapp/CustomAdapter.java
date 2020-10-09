package teamwork.affirmingwellnessapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<Nutrient> {

    public CustomAdapter(Context applicationContext,ArrayList<Nutrient> proteins) {
        super(applicationContext, 0, proteins);
    }

   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
   }
   private View initView(int position, View convertView, ViewGroup parent){
       if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(
                   R.layout.custom_spinner_items, parent, false
           );
       }
       TextView textname = convertView.findViewById(R.id.textView);
       TextView percent = convertView.findViewById(R.id.percent);
       ProgressBar progress = convertView.findViewById(R.id.progressBar);
       Nutrient currentItem = getItem(position);
       if (currentItem != null) {
           textname.setText(currentItem.getName());
           percent.setText(currentItem.getPercent());
           progress.setMax(100);
           progress.setProgress(MainActivity.getMaster().get(position).getCurrent());
       }
       return convertView;

   }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
        //return super.getDropDownView(position, convertView, parent);
    }
}

