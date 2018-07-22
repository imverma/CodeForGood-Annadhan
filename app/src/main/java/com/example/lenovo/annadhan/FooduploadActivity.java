package com.example.lenovo.annadhan;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
    String server_url="http://192.168.43.130/php/c.php";
    AlertDialog.Builder builder;

    TextView tvNoOfPpl,tvWhenCooked,tvDis,tvAnnadhanId;
EditText etNoOfPpl,etDis,etAnnadhanId,etPickupLoc;
RadioGroup rgWhenCooked,rgTemp,rgPacked;
RadioButton rdMorning,rdAfternoon,rdNight,rdRoomTemp,rdRefrigerated,rdPacked,rdNotPacked;


Button btnPickUpLocation;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodupload);

        //tvTemp=(TextView)findViewById(R.id.tvTemp);
       etPickupLoc=(EditText)findViewById(R.id.etPickupLoc);
        tvAnnadhanId=(TextView)findViewById(R.id.tvAnnadhanId);
        etAnnadhanId=(EditText)findViewById(R.id.etAnnadhanId);
        etNoOfPpl=(EditText)findViewById(R.id.etNoOfPpl);
        //etDis=(EditText)findViewById(R.id.etDis);
        btnPickUpLocation=(Button)findViewById(R.id.btnPickupLocation);
        tvNoOfPpl=(TextView)findViewById(R.id.tvNoOfPpl);
        tvWhenCooked=(TextView)findViewById(R.id.tvWhenCooked);
       // tvDis=(TextView)findViewById(R.id.tvDis);
        rgTemp=(RadioGroup)findViewById(R.id.rgTemp);
        rgPacked=(RadioGroup)findViewById(R.id.rgPacked);
        rgWhenCooked=(RadioGroup)findViewById(R.id.rgWhenCooked);
        rdAfternoon=(RadioButton)findViewById(R.id.rdAfternoon);
        rdMorning=(RadioButton)findViewById(R.id.rdMorning);
        rdNight=(RadioButton)findViewById(R.id.rdNight);
        rdRoomTemp=(RadioButton)findViewById(R.id.rdRoomTemp);
        rdRefrigerated=(RadioButton)findViewById(R.id.rdRefrigerated);
        rdPacked=(RadioButton)findViewById(R.id.rdPacked);
        rdNotPacked=(RadioButton)findViewById(R.id.rdNotPacked);



//taking cvalues for volley request
        builder=new AlertDialog.Builder(FooduploadActivity.this);
        btnPickUpLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(FooduploadActivity.this,RequestSuccessSubmission.class);
                startActivity(i);

               final String AnnadhanId,No_Of_people,When_cooked,Description,Packed_or_not,Temperature,Pickup_location,Status;
                AnnadhanId=etAnnadhanId.getText().toString();
                System.out.println(AnnadhanId);
                //Log.i("TAG",)
                No_Of_people=etNoOfPpl.getText().toString();
                System.out.println(No_Of_people);
                int s1=rgWhenCooked.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(s1);
                  When_cooked=rb.getText().toString();
                System.out.println(When_cooked);

                 // Description =tvDis.getText().toString();
                int s2=rgPacked.getCheckedRadioButtonId();
                RadioButton rb2=(RadioButton)findViewById(s2);
                   Packed_or_not=rb2.getText().toString();
                System.out.println(Packed_or_not);
                  // Time_of_uploading=.getText().toString();
                int s3=rgTemp.getCheckedRadioButtonId();
                RadioButton rb3=(RadioButton)findViewById(s3);
                   Temperature=rb3.getText().toString();
                  Pickup_location= etNoOfPpl.getText().toString();
                System.out.println(Pickup_location);

                  // Status="null";
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
                        String d="rice n daal";

                        params.put("No_of_people",No_Of_people);
                        params.put("When_cooked",When_cooked);
                        params.put("Description","d");
                        params.put("Packed_or_not",Packed_or_not);
                      //  params.put("Time_of_uploading",Time_of_uploading);
                        params.put("Temperature",Temperature);
                        params.put("Annadhan_id",AnnadhanId);
                        params.put("Pickup_location",Pickup_location);
                        params.put("Status","open");

                        return params;
                    }
                };
                MySingleton.getInstance(FooduploadActivity.this).addToRequestque(stringRequest);


            }



        });





    }
}
