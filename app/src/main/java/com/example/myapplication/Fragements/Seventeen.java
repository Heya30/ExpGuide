package com.example.myapplication.Fragements;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.menu;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class Seventeen extends Fragment implements View.OnClickListener {

    private Button submit;
    private  View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_seventeen, container, false);
        submit = view.findViewById(R.id.submit);
        submit.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                AlertDialog.Builder dialog = new AlertDialog.Builder(view.getContext());
                Random ra =new Random();
                int point = ra.nextInt(18)+1+80 ;
                dialog.setMessage("你的分数是"+point);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(view.getContext(), menu.class);
                        startActivity(intent);

                    }
                });
                dialog.show();
                break;
            default:
                break;
        }

    }
}
