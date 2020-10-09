package teamwork.affirmingwellnessapp;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class SelectorAdapter extends ArrayAdapter<Nutrient> {
    ArrayList<Nutrient> master;

    public SelectorAdapter(Context applicationContext, ArrayList<Nutrient> master) {
        super(applicationContext, 0, master);
        this.master = master;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public View initView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.selector_spinner_item, parent, false
            );
        }
        TextView textname = convertView.findViewById(R.id.textView);
        final CheckBox check = convertView.findViewById(R.id.checkBox);
        Nutrient currentItem = getItem(position);
        if (currentItem != null) {
            textname.setText(currentItem.getName());
            if (currentItem.getOverview()) {
                check.setChecked(true);
            }
        }
        onCheckboxClicked(check,position);
        return convertView;
    }
    public void onCheckboxClicked(View check, int position){
        boolean checked = ((CheckBox) check).isChecked();
                if (checked) {
                    setSelected(position, true);
                } else {
                    setSelected(position, false);
                }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    public void setSelected(int position, boolean b) {
        master.get(position).setOverview(b);
    }

}