package com.example.teacher.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        loginBtn = (Button) findViewById(R.id.login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = username.getText().toString();
                String pin = password.getText().toString();

                if(name.isEmpty() || name == null){
                    username.setError(" Enter username ");
                }else if(pin.isEmpty() || pin == null){
                    password.setError(" Enter the password ");
                }else{
                    Toast.makeText(login.this, " Loggin ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
