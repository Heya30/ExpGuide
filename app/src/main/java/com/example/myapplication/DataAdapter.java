package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class DataAdapter extends ArrayAdapter {

    public DataAdapter(Context context, int resource, List list) {
        super(context, resource);
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

}
