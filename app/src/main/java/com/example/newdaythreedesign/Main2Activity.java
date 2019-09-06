package com.example.newdaythreedesign;



import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Main2Activity extends Activity {
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //get the reference of button's
        button1=findViewById(R.id.firstfragment);
        button2=findViewById(R.id.secondfragment);

        //perform setOnClickListener event on first button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load first fragment
                loadFragment(new firstFragment());

            }
        });
        //perform setOnClickListener event on second button
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load second fragment
                loadFragment(new secondFragment());

            }
        });
    }


    private void loadFragment(Fragment fragment) {
        //create fragment manager
        FragmentManager fragmentManager=getFragmentManager();
        //create a fragmentTransaction to begin the transaction and replce the fragment
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        //replace the frameLayout with new fragment
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();


    }
}
