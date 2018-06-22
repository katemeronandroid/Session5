package com.firstexample.emarkova.session5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    String recievedStr = "";
    Button buttonClick;
    FragmentTransaction fragmentTransaction;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null);
        buttonClick = (Button)view.findViewById(R.id.button);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View viewFromOne = getActivity().findViewById(R.id.frag1);
                //recievedStr = ((EditText)viewFromOne.findViewById(R.id.editText)).getText().toString();
               // Log.d("Loglog", recievedStr);
                Fragment3 fragment3 = new Fragment3();
               // ((TextView)fragment3.getView().findViewById(R.id.textView)).setText(recievedStr);
                fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frameLayout,fragment3);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
