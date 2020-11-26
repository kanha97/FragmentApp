package com.devkanhaiya.fragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Fragment2 extends ListFragment {
String [] Family={
        "KAnhaiya Narkhede",
        "Sunil Narkhede",
        "Shila Narkhede",
        "Prasad Narkhede",
        "Parmila Narkhede",
        "Sarubai Narkhede"
};

String[] Member={
        "It's Me..........An Developer",
        "My Father Who I Love The Most",
        "My Mother Who Help Me Every Possible",
        "My Brother Is An Awesome Flower  Which Blooom In My Heart",
        "My Antee Nothing To Describe",
        "My GrandMother Who Is Most Hardworking In My Family"

};
Integer[] images={
        R.drawable.image1,
        R.drawable.baba,
        R.drawable.aii,
        R.drawable.brother,
        R.drawable.img5,
        R.drawable.img6,
};



    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContext(),
        android.R.layout.simple_list_item_1,Family);
        setListAdapter(adapter);


        return view;
    }
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        Fragment1 text=(Fragment1) getFragmentManager().findFragmentById(R.id.fragment1);
        text.change(Family[position],"My Loved Family :\n "+Member[position],images[position]);
        getListView().setSelector(android.R.color.holo_blue_bright);
    }
}