package com.example.apphamburguesascliente;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.View;


import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

public class PagoFranccionadoFragment extends Fragment {


    public PagoFranccionadoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pago_franccionado, container, false);


        return view;
    }
}