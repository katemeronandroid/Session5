package com.firstexample.emarkova.session5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class Fragment1 extends Fragment {
    EditText text;
    private CustomBroadcastReciever mReciever;
    private IntentFilter mFilter;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        text = (EditText)view.findViewById(R.id.editText);
        mReciever = new CustomBroadcastReciever();
        mFilter = new IntentFilter("emarkova.GET_NUMBER");
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().registerReceiver(mReciever,mFilter);
    }

    private class CustomBroadcastReciever extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            text.setText(intent.getStringExtra("number"));
        }
    }
}
