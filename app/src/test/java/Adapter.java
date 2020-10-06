import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

//import com.AffirmingWellnessApp.AffirmingWellnessApp.Protein;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import teamwork.affirmingwellnessapp.Protein;

public class Adapter extends ArrayAdapter {
    public Adapter(Context context, ArrayList<Protein> workoutList){
        super(context,0, workoutList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getDropDownView(position, convertView, parent);
    }
}
