package com.vvit.ammu.quizapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;

/**
 * Created by Ammu on 01-05-2017.
 */

public class MyAdapter extends ArrayAdapter {
    private final Context context;
    private final String[] values;

    public MyAdapter(@NonNull Context context, String[] values) {
        super(context,R.layout.list,values);
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list,parent,false);
        TextView textView = (TextView) rowView.findViewById(R.id.id_list_text);
        //ImageView imageView = (ImageView) rowView.findViewById(R.id.id_list_image);

        textView.setText(values[position]);
        String s = values[position];

        /*if(s.equals("C")){
            imageView.setImageResource(R.drawable.c);
        }
        else if(s.equals("Java")){
            imageView.setImageResource(R.drawable.java);
        }
        else if(s.equals("CPP")){
            imageView.setImageResource(R.drawable.cpp);
        }
        else if(s.equals("Android"))
        {
            imageView.setImageResource(R.drawable.android);
        }
        else{
            imageView.setImageResource(R.mipmap.ic_launcher);
        }*/
        return rowView;
    }
}
