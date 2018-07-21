package com.example.lenovo.annadhan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class FooduploadActivity extends AppCompatActivity {
    String server_url="http://10.49.37.149/victory.jpg";
    AlertDialog.Builder builder;

    TextView tvNoOfPpl,tvWhenCooked,tvDis,tvAnnadhanId,tvTemp;
EditText etNoOfPpl,etDis,etAnnadhanId;
RadioGroup rgWhenCooked,rgTemp;
RadioButton rdMorning,rdAfternoon,rdNight,rdRoomTemp,rdRefrigerated;


Button btnPickUpLocation;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodupload);
        tvTemp=(TextView)findViewById(R.id.tvTemp);
        tvAnnadhanId=(TextView)findViewById(R.id.tvAnnadhanId);
        etAnnadhanId=(EditText)findViewById(R.id.etAnnadhanId);
         etNoOfPpl=(EditText)findViewById(R.id.etNoOfPpl);
        etDis=(EditText)findViewById(R.id.etDis);
         btnPickUpLocation=(Button)findViewById(R.id.btnPickUpLocation);
        tvNoOfPpl=(TextView)findViewById(R.id.tvNoOfPpl);
        tvWhenCooked=(TextView)findViewById(R.id.tvWhenCooked);
        tvDis=(TextView)findViewById(R.id.tvDis);
        rgTemp=(RadioGroup)findViewById(R.id.rgTemp);
        rg=(RadioGroup)findViewById(R.id.rg);
        rgWhenCooked=(RadioGroup)findViewById(R.id.rgWhenCooked);
        rdAfternoon=(RadioButton)findViewById(R.id.rdAfteroon);
        rdMorning=(RadioButton)findViewById(R.id.rdMorning);
        rdNight=(RadioButton)findViewById(R.id.rdNight);
        rdRoomTemp=(RadioButton)findViewById(R.id.rdRoomTemp);
        rdRefrigerated=(RadioButton)findViewById(R.id.rdRefrigerated);
        rd=(RadioButton)findViewById(R.id.rd);
        rd=(RadioButton)findViewById(R.id.rd);
        rd=(RadioButton)findViewById(R.id.rd);


//taking cvalues for volley request

        btnPickUpLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final String AnnadhanId,No_Of_people,When_cooked,Description,Packed_or_not,Temperature,Pickup_location,Status;
                AnnadhanId=etAnnadhanId.getText().toString();
                No_Of_people=etNoOfPpl.getText().toString();
                  When_cooked=.getText().toString();
                  Description =tvDis.getText().toString();
                   Packed_or_not=.getText().toString();
                  // Time_of_uploading=.getText().toString();
                   Temperature=.getText().toString();
                  Pickup_location= .getText().toString();
                   Status="null";
                StringRequest stringRequest= new StringRequest(Request.Method.POST, server_url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        builder.setTitle("Server Response");
                        builder.setMessage("Response:" +response);
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                               // etName.setText("");
                              //  etEmail.setText("");
                            }
                        });
                        AlertDialog alertDialog=builder.create();
                        alertDialog.show();
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(FooduploadActivity.this,"Error....",Toast.LENGTH_SHORT).show();
                        error.printStackTrace();
                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String,String> params=new HashMap<String, String>();
                        params.put("AnnadhanId",AnnadhanId);
                        params.put("No_Of_people",No_Of_people);
                        params.put("When_cooked",When_cooked);
                        params.put("Description",Description);
                        params.put("Packed_or_not",Packed_or_not);
                      //  params.put("Time_of_uploading",Time_of_uploading);
                        params.put("Temperature",Temperature);
                        params.put("Pickup_location",Pickup_location);
                        params.put("Pickup_location",Pickup_location);
                        return params;
                    }
                };
                MySingleton.getInstance(FooduploadActivity.this).addToRequestque(stringRequest);
            }

            Intent i= new Intent(FooduploadActivity.this,RequestSuccessSubmission.class);

        });





    }
}
