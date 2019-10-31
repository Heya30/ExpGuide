package com.example.myapplication.Fragements;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Eleven extends Fragment implements View.OnClickListener {
    private TextView density;
    private EditText densityet;
    private Button bt1;
    private TextView coefficient;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_eleven, container, false);
        density = view.findViewById(R.id.density);
        density.setText("");
        densityet = view.findViewById(R.id.et_eleven);
        bt1 = view.findViewById(R.id.confirm);
        bt1.setOnClickListener(this);

        coefficient = view.findViewById(R.id.coefficient);
        coefficient.setText("");
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.confirm:
                String temp = densityet.getText().toString();
                int tempture = Integer.parseInt(temp);
                density.setText(""+getDensity(tempture));
                coefficient.setText(getcoefficient(tempture)+"*10^-6");
                break;

                default:
                    break;
        }

    }

    private double getDensity(int tep){
        if(tep >= 0 &&tep <= 10 ) return 1;
        else if (tep >= 11 && tep <=18) return 0.999;
        else if (tep >= 19 && tep <=22) return 0.998;
        else if (tep >= 23 && tep <=26) return 0.997;
        else if (tep >= 24 && tep <=29) return 0.996;
        else if (tep >= 30 && tep <=33) return 0.995;
        else if (tep >= 34 && tep <=36) return 0.994;
        else if (tep >= 37 && tep <=39) return 0.993;
        else return 0.00;

    }

    private  double getcoefficient(int tep){
        if(tep >= 0 &&tep <= 10 ) return 1.5;
        else if (tep >= 11 && tep <=18) return 1.17;
        else if (tep >= 19 && tep <=22) return 1.0;
        else if (tep >= 23 && tep <=26) return 0.9;
        else if (tep >= 24 && tep <=29) return 0.87;
        else if (tep >= 30 && tep <=33) return 0.78;
        else if (tep >= 34 && tep <=36) return 0.72;
        else if (tep >= 37 && tep <=39) return 0.68;
        else return 0.00;
    }
}
