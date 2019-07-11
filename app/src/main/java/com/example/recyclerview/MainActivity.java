package com.example.recyclerview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    TextView txtName,txtPassword;
    EditText userName,password;
    Button loginBtn;
    ConstraintLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        loginBtn=findViewById(R.id.loginButton);
        mainLayout=findViewById(R.id.constraintLayout);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.getText().toString().equals("mad312") && password.getText().toString().equals("abc123")){
                    Log.d("username",userName.getText().toString());
                    Log.d("pass",password.getText().toString());
                    Intent i = new Intent(MainActivity.this,HomePage.class);
                    i.putExtra("userName",userName.getText().toString());
                    startActivity(i);
                }
                else{
                    Snackbar snackbar = Snackbar
                            .make(mainLayout, "Invalid Input !! Please try again ..", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
            }
        });
    }
}
