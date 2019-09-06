package com.example.newdaythreedesign;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SimpleFragment extends Fragment {
    View view;
    Button firstButton;
    Intent intent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_simple,container,false);
        firstButton=(Button)view.findViewById(R.id.firstbutton);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(view.getContext(),Main2Activity.class);
                startActivity(intent);
               // Toast.makeText(getActivity(),intent., "Fragment's Button", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
