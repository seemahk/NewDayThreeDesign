package com.example.newdaythreedesign;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class secondFragment extends Fragment {
    View view;
    Button buttonsec;


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_simple_sec,container,false);
        buttonsec=(Button)view.findViewById(R.id.textView2);
        buttonsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  intent=new Intent(view.getContext(),Main2Activity.class);
                //   startActivity(intent);
                Toast.makeText(getActivity(), "Fragment's Second", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
