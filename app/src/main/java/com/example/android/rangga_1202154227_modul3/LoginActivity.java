package com.example.android.rangga_1202154227_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.R.layout;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pass);
        masuk = (Button)findViewById(R.id.button);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userkey = username.getText().toString();
                String passkey = password.getText().toString();

                if (userkey.equals("EAD") && passkey.equals("MOBILE")){
                    Toast.makeText(getApplicationContext(), "Login Sukses....!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, AirActivity.class);
                    LoginActivity.this.startActivity(intent);


                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau Password anda salah.....!").setNegativeButton("Retry...", null).create().show();
                }

            }
        });
    }
}
