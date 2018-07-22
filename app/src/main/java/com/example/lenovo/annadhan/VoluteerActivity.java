package com.example.lenovo.annadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class VoluteerActivity extends AppCompatActivity {
    Button btnParticipate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voluteer);

        btnParticipate=(Button)findViewById(R.id.button10);
        btnParticipate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(VoluteerActivity.this,AfterParticipate.class);
                startActivity(i);
            }
        });
    }
}
