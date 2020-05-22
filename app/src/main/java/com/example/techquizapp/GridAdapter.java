package com.example.techquizapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private int sets = 0;

    public GridAdapter(int sets) {
        this.sets = sets;
    }

    @Override
    public int getCount() {
        return sets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;
        if(convertView == null){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.set_item,parent,false);
        }
        else{
            view = convertView;
        }
        //using position as we are only showing number for the sets
        //+1 because position whould start from 1, as our set will start from 0 index
        //finally return view
        ((TextView)view.findViewById(R.id.textview)).setText(String.valueOf(position+1));
        return view;
    }
}
