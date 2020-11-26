package com.devkanhaiya.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class Fragment1 extends Fragment {
    TextView title,description;
    ImageView imageView;


    public Fragment1() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

         title=view.findViewById(R.id.Title);
         description=view.findViewById(R.id.Description);
         imageView=view.findViewById(R.id.image);

        return view;
    }

    public void change(String text, String text2,int img){
        title.setText(text);
        description.setText(text2);
        imageView.setImageResource(img);
    }


}