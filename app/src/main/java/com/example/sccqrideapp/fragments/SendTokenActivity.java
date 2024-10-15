package com.example.sccqrideapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sccqrideapp.R;
import com.example.sccqrideapp.SendTokenConfirmation;
import com.example.sccqrideapp.UserDashboardActivity;

public class SendTokenActivity extends Fragment {

    View view;
    Button button, button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_send_token, container, false);


        button = view.findViewById(R.id.backbtn);
        button1 = view.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), UserDashboardActivity.class);
                startActivity(intent);
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), SendTokenConfirmation.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
