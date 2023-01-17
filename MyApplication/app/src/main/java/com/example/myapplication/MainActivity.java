package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_insta);
    }

    public void LginFb(View view){
        EditText txtUsername = findViewById(R.id.txtUsernameFb);
        EditText txtPwdFb = findViewById(R.id.txtPwdFb);
        if(txtUsername.getText().toString().equals("admin") && txtPwdFb.getText().toString().equals("123456")){
            Toast.makeText(MainActivity.this, "Login success, welcome admin !", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();
        }
    }

    public void LoginInsta(View view){
        EditText txtUsername = findViewById(R.id.txtUsername);
        EditText txtPwd = findViewById(R.id.txtPwd);
        if(txtUsername.getText().toString().equals("admin") && txtPwd.getText().toString().equals("123456")){
            Toast.makeText(MainActivity.this, "Login success, welcome admin !", Toast.LENGTH_SHORT).show();
        } else{
            Toast toast =Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}