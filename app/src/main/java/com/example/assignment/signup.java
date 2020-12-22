package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {
    EditText email,passwoed,dob,username,address;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        email=findViewById(R.id.email);
        passwoed=findViewById(R.id.password);
        dob=findViewById(R.id.dob);
        username=findViewById(R.id.username);
        address=findViewById(R.id.Address);
        signup=findViewById(R.id.submit);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em,user,age,add;
                em=email.getText().toString().trim();
                user=username.getText().toString().trim();
                add=address.getText().toString().trim();
                age=dob.getText().toString().trim();

                Bundle bundle=new Bundle();
                bundle.putString("email",em);
                bundle.putString("username",user);
                bundle.putString("address",add);
                bundle.putString("dob",age);
                Intent intent=new Intent(signup.this,MainActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}
