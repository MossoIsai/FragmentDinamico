package com.isaigarciamoso.fragmentdinamico;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by isaigarciamoso on 21/02/17.
 */

public class FragmentA extends Fragment {
    private Button btn;
    private String messageConsole = "Message Console";

    @Override
    public void onAttach(Context context) { //Invisible
        //Apartir de un contexto de una actividad se va asociar a esta actividad
        super.onAttach(context);
        Log.d(messageConsole," :::::::::::::::::::::>  onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) { //Invisible
        //Se crea el fragmento
        super.onCreate(savedInstanceState);
        Log.d(messageConsole," :::::::::::::::::::::>  onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) { //Invisible
      View view;
        view = inflater.inflate(R.layout.fragment_a,container,false);
        btn = (Button) view.findViewById(R.id.btnFragment);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"Mensaje de ISAI",Toast.LENGTH_SHORT).show();
            }
        });
        Log.d(messageConsole," :::::::::::::::::::::>  onCreateView");
        return  view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) { //Invisible
        super.onActivityCreated(savedInstanceState);
        Log.d(messageConsole," :::::::::::::::::::::::::::.>   onActivityCreated");

    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        //Restaura las vistas del oncreateView
        Log.d(messageConsole," :::::::::::::::::::::::::::.>   onViewStateRestored");
    }

    @Override
    public void onStart() {
        super.onStart();
        //Visible pero no se puede interactuar con el
        Log.d(messageConsole," :::::::::::::::::::::::::::.>   onStart");

    }
}
