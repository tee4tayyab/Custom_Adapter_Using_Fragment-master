package com.example.salman.custom_adapter_using_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    ListView l;
    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_my, container, false);
        ArrayList<User> arrayList = new ArrayList<User>();
        for (int i=0; i<100; i++)
        {
            arrayList.add(new User("           Name = " + i, "           Phone = " + i));
        }

        l=(ListView)view.findViewById(R.id.listView);
        CustomAdapter customAdapter = new CustomAdapter(getActivity(),arrayList);
        l.setAdapter(customAdapter);


        return view;
    }

}
