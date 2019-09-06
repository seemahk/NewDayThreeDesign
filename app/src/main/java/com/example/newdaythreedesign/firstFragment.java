package com.example.newdaythreedesign;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;



public class firstFragment extends Fragment {
    View view;
    Button firstButtonOne;


    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_simple_first,container,false);
        firstButtonOne=(Button)view.findViewById(R.id.textView1);
        firstButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "Fragment's First", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
