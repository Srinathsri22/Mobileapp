package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView email,dob,address,username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        dob=findViewById(R.id.dob);
        address=findViewById(R.id.Address);
        username=findViewById(R.id.username);
        Bundle bundle=getIntent().getExtras();

        String em,user,age,add;
        em=bundle.getString("email","Lokesh@gmail.com");
        user=bundle.getString("username","lokeshwaran");
        age=bundle.getString("dob","21/05/2001");
        add=bundle.getString("address","2/103 T Udumalpet");

        email.setText(em);
        dob.setText(age);
        address.setText(add);
        username.setText(user);
    }
}
