package com.example.sccqrideapp;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.sccqrideapp.fragments.SendTokenActivity;
import com.example.sccqrideapp.fragments.TellerHome;
import com.example.sccqrideapp.fragments.TellerTopupHistory;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class TellerDashboard extends AppCompatActivity {

    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_teller_dashboard);

        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.nav_tellerhome);
        bottomNav.setOnItemSelectedListener(navListener);

        Fragment selectedFragment = new TellerHome();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

    }

    private NavigationBarView.OnItemSelectedListener navListener = item -> {
        int itemId = item.getItemId();

        Fragment selectedFragment = null;

        if (itemId == R.id.nav_tellerhome) {
            selectedFragment = new TellerHome();
            bottomNav.setVisibility(View.VISIBLE);

        } else if (itemId == R.id.nav_topuptoken) {
            selectedFragment = new SendTokenActivity();
            bottomNav.setVisibility(View.GONE);

        } else if (itemId == R.id.nav_tellerhistory) {
            selectedFragment = new TellerTopupHistory();
            bottomNav.setVisibility(View.VISIBLE);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

        return true;
    };
}