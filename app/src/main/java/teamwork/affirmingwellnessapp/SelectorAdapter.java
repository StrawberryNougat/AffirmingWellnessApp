package teamwork.affirmingwellnessapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import teamwork.affirmingwellnessapp.R;

public class SelectorAdapter extends ArrayAdapter<overviewActivity> {
    private Context mContext;
    private ArrayList<overviewActivity> listState;
    private SelectorAdapter myAdapter;

    private boolean isFromView = false;

    public SelectorAdapter(Context context, int resource, ArrayList<overviewActivity> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.listState = (ArrayList<overviewActivity>) objects;
        this.myAdapter = this;
    }

    @Override
    public View getDropDownView(int position, View convertView,
                                ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(final int position, View convertView,
                              ViewGroup parent) {

        final ViewHolder holder;
        if (convertView == null) {
            LayoutInflater layoutInflator = LayoutInflater.from(mContext);
            convertView = layoutInflator.inflate(R.layout.selector_spinner_item, null);
            holder = new ViewHolder();
            holder.mTextView = (TextView) convertView
                    .findViewById(R.id.textView);
            holder.mCheckBox = (CheckBox) convertView
                    .findViewById(R.id.checkBox);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mTextView.setText(listState.get(position).getTitle());

        // To check weather checked event fire from getview() or user input
        isFromView = true;
        holder.mCheckBox.setChecked(listState.get(position).isSelected());
        MainActivity.getMaster().get(position).setOverview(listState.get(position).isSelected());
        isFromView = false;

        if ((position == 0)) {
            holder.mCheckBox.setVisibility(View.INVISIBLE);
        } else {
            holder.mCheckBox.setVisibility(View.VISIBLE);
        }
        holder.mCheckBox.setTag(position);
        holder.mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int getPosition = (Integer) buttonView.getTag();

                if (!isFromView) {
                    listState.get(position).setSelected(isChecked);
                }
            }
        });
        return convertView;
    }

    private class ViewHolder {
        private TextView mTextView;
        private CheckBox mCheckBox;
    }
}

/*
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

}*/
