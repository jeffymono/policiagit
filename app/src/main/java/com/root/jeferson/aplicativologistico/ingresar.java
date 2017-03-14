package com.root.jeferson.aplicativologistico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ingresar extends AppCompatActivity {
    Button btn;
    EditText txt_usu, txt_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);


        txt_usu = (EditText) findViewById(R.id.txt_usu);
        txt_pass = (EditText) findViewById(R.id.txt_pass);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txt_usu.getText().toString().equals("123456") && txt_pass.getText().toString().equals("policia")) {
                    Toast.makeText(getApplicationContext(), "Login Sucess", Toast.LENGTH_LONG);
                    Intent myiIntent = new Intent(ingresar.this, MapsActivity.class);
                    startActivity(myiIntent);
                }

            }

        });

    }

}
