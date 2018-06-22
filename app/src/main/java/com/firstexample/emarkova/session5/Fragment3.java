package com.firstexample.emarkova.session5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment3 extends Fragment {
    TextView textView;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, null);
        textView = view.findViewById(R.id.textView);
        View viewFromOne = getActivity().findViewById(R.id.frag1);
        textView.setText(((EditText)viewFromOne.findViewById(R.id.editText)).getText().toString());
        return view;
    }
}
