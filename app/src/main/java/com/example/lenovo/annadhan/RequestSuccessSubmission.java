package com.example.lenovo.annadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestSuccessSubmission extends AppCompatActivity {
Button btnOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_success_submission);


        btnOK=(Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(RequestSuccessSubmission.this,HomeActivity.class);
                startActivity(i);
            }
        });

    }
}
