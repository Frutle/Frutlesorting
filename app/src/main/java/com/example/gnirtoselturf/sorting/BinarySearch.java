package com.example.gnirtoselturf.sorting;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.gnirtoselturf.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch extends Fragment {

    private EditText mSizeArray;
    private EditText mKeyArray;
    private EditText mArrayvalue;

    private Button mButtonMake;

    private  Integer size;
    private Integer key;
    private int[] num;


    public static BinarySearch newInstance() { return new BinarySearch();}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.binary_search_fr,container,false);
        return view;
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        mSizeArray = (EditText) view.findViewById(R.id.btn_array_size);
        mKeyArray = (EditText) view.findViewById(R.id.btn_key);
        mArrayvalue = (EditText) view.findViewById(R.id.btn_value);
        mButtonMake = (Button) view.findViewById(R.id.btn_make);


       // size = Integer.parseInt(mSizeArray.getText().toString());

       // key = Integer.parseInt(mSizeArray.getText().toString());

       // String str = mArrayvalue.getText().toString();
       // num = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        mButtonMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 size = Integer.parseInt(mSizeArray.getText().toString());
                 key = Integer.parseInt(mKeyArray.getText().toString());

                 String str = mArrayvalue.getText().toString();
                 num = (int[]) Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
                 Arrays.sort(num);

               //  Toast.makeText(getContext(),Arrays.deepToString(new int[][]{num}),Toast.LENGTH_LONG).show();
                // Toast.makeText(getContext(),key.toString(),Toast.LENGTH_LONG).show();

                int first = 0;
                int last = size - 1;

                binarySearch(num,first,last,key);
            }
        });
    }

    private   void binarySearch(int[] array,int first,int last,int key){
        int position ;
        position = (first+last)/2;

        while ((array[position] != key) && (first <= last)) {
            if (array[position] > key) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
            if (first <= last){
               Toast.makeText(getActivity(), " ключ " + " "+ key + " находится на позиции " + position,Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getContext(),"Элемент не найден",Toast.LENGTH_LONG).show();
        }
    }
}
