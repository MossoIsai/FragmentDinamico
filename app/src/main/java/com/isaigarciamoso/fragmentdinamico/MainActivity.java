package com.isaigarciamoso.fragmentdinamico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity   {
   private Button btnShowFragment;
   private String logMessage = "MessageConsole";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(logMessage,"::::::::::::::: >Activity onCreate");
        initViews();

           btnShowFragment.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   FragmentA fragmentA = new FragmentA();

                   getFragmentManager().
                           beginTransaction().
                           add(R.id.activity_main,fragmentA).commit();

               }
           });

    }
    public void initViews(){
        btnShowFragment = (Button)findViewById(R.id.btnShowFragment);
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(logMessage," :::::::::::::::::>Activity onPause");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(logMessage," :::::::::::::::::>Activity  onStart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(logMessage," :::::::::::::::::>Activity  onDestroy");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(logMessage," :::::::::::::::::>Activity  onResume");
    }

}
