package com.example.testinlogin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class About extends AppCompatActivity {

    private TabLayout tabLayout; //to put the green toolbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //to put the green toolbar
        Toolbar toolbar = findViewById(R.id.mainToolBar);
        toolbar.setTitle(R.string.sobre);
        setSupportActionBar(toolbar);

    }
}
