package com.example.salman.custom_adapter_using_fragment;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Salman on 10/15/2017.
 */

public class CustomAdapter extends ArrayAdapter<User> {

    TextView myName;
    TextView myPhone;
    View v;
    LayoutInflater inflater;
    FragmentActivity context;
    ArrayList<User> info;


    public CustomAdapter(FragmentActivity context, ArrayList<User> info) {
        super(context, R.layout.single_row, info);
        this.context = context;
        this.info = info;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        v = LayoutInflater.from(context).inflate(R.layout.single_row, parent, false);
        myName = (TextView) v.findViewById(R.id.name);
        myPhone = (TextView) v.findViewById(R.id.phone);
        User u = getItem(position);
        myName.setText(u.getName().toString());
        myPhone.setText(u.getPhone().toString());
        return v;
    }
}
