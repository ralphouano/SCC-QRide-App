package com.example.sccqrideapp;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.example.sccqrideapp.fragments.ScanQRActivity;
import com.example.sccqrideapp.fragments.SendTokenActivity;
import com.example.sccqrideapp.fragments.Userhome;
import com.example.sccqrideapp.fragments.ViewQRTicket;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class UserDashboardActivity extends AppCompatActivity {

    private BottomNavigationView bottomNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_dashboard);

        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.nav_userhome);
        bottomNav.setOnItemSelectedListener(navListener);

        Fragment selectedFragment = new Userhome();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

    }

    private NavigationBarView.OnItemSelectedListener navListener = item -> {
        int itemId = item.getItemId();

        Fragment selectedFragment = null;

        if (itemId == R.id.nav_userhome) {
            selectedFragment = new Userhome();

        } else if (itemId == R.id.nav_sendtoken) {
            selectedFragment = new SendTokenActivity();
            bottomNav.setVisibility(View.GONE);

        } else if (itemId == R.id.nav_userbusticket) {
            selectedFragment = new ViewQRTicket();

        } else if (itemId == R.id.nav_userscanqr) {
            selectedFragment = new ScanQRActivity();
            bottomNav.setVisibility(View.GONE);

        } else if (itemId == R.id.nav_userhistory) {
//            selectedFragment = new UserTopupHistory();
            bottomNav.setVisibility(View.VISIBLE);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

        return true;
    };
}