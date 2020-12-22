package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
     EditText email,password;
     Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.submit);
        signup=findViewById(R.id.signup);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em,pass;
                em=email.getText().toString().trim();
                pass=password.getText().toString().trim();
                if(!(em.isEmpty()) && !(pass.isEmpty())){
                    if(em.equals("lokesh@gmail") && pass.equals("loki2105")){
                        startActivity(new Intent(login.this,MainActivity.class));
                    }
                    else{
                        Toast.makeText(login.this,"Email or password wrong!!!",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(login.this,"Empty fields are not allowed!!",Toast.LENGTH_SHORT).show();
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,signup.class));
            }
        });

    }
}
