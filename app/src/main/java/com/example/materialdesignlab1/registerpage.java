package com.example.materialdesignlab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class registerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

/*
        configureRegisterButton();
        configureHomeButton();
*/
    }

    private void configureRegisterButton() {
        Button RegisterButton = (Button) findViewById(R.id.Registerbtn);
        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(registerpage.this,mainpage.class));
            }
    });
    }
    private void configureHomeButton() {
        Button HomeButton = (Button) findViewById(R.id.Registerbtn);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(registerpage.this,MainActivity.class));
            }
        });

    }
    /*
    private void setToolbar() {
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setNavigationIcon(R.drawable.menuicon);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(registerpage.this,MainActivity.class));
                }
            });
        }

     */
}

