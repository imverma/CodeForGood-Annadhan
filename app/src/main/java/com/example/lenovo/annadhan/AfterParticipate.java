package com.example.lenovo.annadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AfterParticipate extends AppCompatActivity {
RadioButton rdPublicTransport,rdTwoWheeler,rdFourWheeler;
Button btnOk1;
RadioGroup rgModeOfTransportation;

TextView etETA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_participate);
        rdTwoWheeler=(RadioButton)findViewById(R.id.rdTwoWheeler);
        rdFourWheeler=(RadioButton)findViewById(R.id.rdFourWheeler);
rdPublicTransport=(RadioButton)findViewById(R.id.rdPublicTransport);
btnOk1=(Button)findViewById(R.id.btnOk1);
etETA=(TextView) findViewById(R.id.etETA);
rgModeOfTransportation=(RadioGroup) findViewById(R.id.rgModeOfTransportation);


        rgModeOfTransportation.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
              switch (i)
              { case R.id.rdFourWheeler:etETA.setText("1.08hrs");
              break;
                  case R.id.rdTwoWheeler:etETA.setText("0.56hrs");
                  break;
                  case R.id.rdPublicTransport:etETA.setText("4.23hrs");
                  break;
              }
            }
        });
      /*  RadioButton rb=(RadioButton)findViewById(s1);
       String radioOutput=rb.getText().toString();
       if(radioOutput!= ""){
           etETA.setText("2.35km");
       }*/



        btnOk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(AfterParticipate.this,HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
