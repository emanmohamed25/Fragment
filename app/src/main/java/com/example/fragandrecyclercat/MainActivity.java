package com.example.fragandrecyclercat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    NavController nav_controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fragment fragment = MainActivity.
        NavHostFragment navHostFragment  = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.FragmentHost);

        nav_controller= navHostFragment.getNavController();



    }

    @Override
    public boolean onSupportNavigateUp() {
        return nav_controller.navigateUp() || super.onSupportNavigateUp();
    }
}