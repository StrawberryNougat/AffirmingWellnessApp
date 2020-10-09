package teamwork.affirmingwellnessapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<Nutrient> {
    /*Context context;
    ArrayList<Protein> proteinNames;
    LayoutInflater inflter;*/

    public CustomAdapter(Context applicationContext,ArrayList<Nutrient> proteins) {
        super(applicationContext, 0, proteins);
        /*this.context = applicationContext;
        this.proteinNames = proteins;
        inflter = (LayoutInflater.from(applicationContext));*/
    }

   /* @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
*/
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
        //return super.getView(position, convertView, parent);
   }
   private View initView(int position, View convertView, ViewGroup parent){
       if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(
                   R.layout.custom_spinner_items, parent, false
           );
       }
       TextView textname = convertView.findViewById(R.id.textView);
       TextView percent = convertView.findViewById(R.id.percent);
       Nutrient currentItem = getItem(position);
       if (currentItem != null) {
           textname.setText(currentItem.getName());
           percent.setText(currentItem.getPercent());
       }
       return convertView;

   }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
        //return super.getDropDownView(position, convertView, parent);
    }
    /*@Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        TextView names = (TextView) view.findViewById(R.id.textView);
        names.setText(proteinNames.get(i).getName());
        return view;
    }*/
}
/*
package com.redflamingo.wellness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    LayoutInflater inflter;
    ArrayList<Protein> names;
    public Adapter(Context context, ArrayList<Protein> proteinList){
            this.names = proteinList;

    }

    @NonNull
    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, null);
        //ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        TextView proteinName = (TextView) view.findViewById(R.id.textView);
        proteinName.setText(names.get(i).getName());
        return view;
    }
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return initView(position, convertView, parent);
//    }
    private View initView(int position, View convertView, ViewGroup parent){
        */
/*if(convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.summary_main, parent, false
            );
        }*//*

         TextView textname = convertView.findViewById(R.id.textView);
         //Protein currentItem = getItem(position);
        //if(currentItem!=null) {
       //     textname.setText(currentItem.getName());
        //}
        return convertView;
    }
    public Object getItem(int i) {
        return names.get(i);
    }
    public long getItemId(int i) {
        return 0;
    }
    public int getCount() {
        return 0;
    }

}*/

