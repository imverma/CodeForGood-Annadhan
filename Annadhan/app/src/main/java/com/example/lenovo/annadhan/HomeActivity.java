package com.example.lenovo.annadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class HomeActivity extends AppCompatActivity {
Button btnDonate,btnVolunteer;
HorizontalScrollView slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDonate=(Button)findViewById(R.id.btnDonate);
        btnVolunteer=(Button)findViewById(R.id.btnVolunteer);
        slider=(HorizontalScrollView)findViewById(R.id.slider);

        btnDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(HomeActivity.this,FooduploadActivity.class);
                startActivity(i);
            }
        });




    }
}
