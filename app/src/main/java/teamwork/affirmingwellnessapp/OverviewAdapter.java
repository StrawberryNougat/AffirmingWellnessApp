package teamwork.affirmingwellnessapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class OverviewAdapter extends RecyclerView.Adapter<OverviewAdapter.MyViewHolder>{
    private ArrayList<Nutrient> overview;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textView;
        public MyViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }
    public OverviewAdapter(ArrayList<Nutrient> array) {
        overview = array;
    }
    public OverviewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_spinner_items, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(overview.get(position).getName());
    }

    public int getItemCount() {
        return overview.size();
    }
}
