package com.example.sccqrideapp.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.sccqrideapp.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ViewQRTicket extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_qrticket, container, false);

        // Check the current orientation
        int orientation = getResources().getConfiguration().orientation;
        BottomNavigationView bottomNav = getActivity().findViewById(R.id.bottom_navigation);

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            if (bottomNav != null) {
                bottomNav.setVisibility(View.GONE); // Hide navigation in landscape
            }
        } else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            if (bottomNav != null) {
                bottomNav.setVisibility(View.VISIBLE); // Show navigation in portrait
            }
        }

        return view;
    }
}
