package com.example.gnirtoselturf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gnirtoselturf.algorithms.sorting.BinarySearch;


public class MainFragment extends Fragment {

    private Button mButtonSorting;
    private Button mButtonMethodSimpleIteration;
    private Button mButtonmethodNewton;

    public static MainFragment newInstance() { return new MainFragment(); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        mButtonSorting = view.findViewById(R.id.btn_sorting);
        mButtonSorting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getContext(),"ВСЕ РАБОТАЕТ",Toast.LENGTH_LONG).show();
                getFragmentManager().beginTransaction()
                        .replace(R.id.activity, BinarySearch.newInstance())
                        .commit();
            }
        });

        mButtonMethodSimpleIteration = view.findViewById(R.id.btn_method_simple_iteration);
        mButtonmethodNewton = view.findViewById(R.id.btn_method_newton);
    }
}
