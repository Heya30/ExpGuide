package com.example.myapplication.Fragements;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.myapplication.R;

public class SecondStep extends Fragment implements View.OnClickListener {
    private Button chem;
    private Button container;
    private Button transport;
    private Button inlandWater;
    private LinearLayout header_ll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.second_step, container, false);
        header_ll = view.findViewById(R.id.se);
        chem = view.findViewById(R.id.infoChem);
        chem.setOnClickListener(this);
        return view;
    }

@Override
   public void onClick(View v) {
        switch (v.getId()){
            case R.id.infoChem:



                header_ll.removeAllViews();//清空布局

                getChildFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.se, new ChemShip())
                        .commit();
                break;
            case R.id.infoContainer:
                header_ll.removeAllViews();//清空布局
                getChildFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.se, new ContainerShip())
                        .commit();
                break;
            case R.id.infoTransport:
                header_ll.removeAllViews();//清空布局
                getChildFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.container, new TransportShip()).commit();
                break;
            case R.id.infoInlandWater:
                header_ll.removeAllViews();//清空布局
                getChildFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)  //将当前fragment加入到返回栈中
                        .replace(R.id.container, new InlandWaterShip()).commit();
                break;
        }

    }
}
