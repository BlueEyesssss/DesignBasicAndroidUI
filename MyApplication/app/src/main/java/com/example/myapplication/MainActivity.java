package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvSinhvien;


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
//        if(txtUsername.getText().toString().equals("admin") && txtPwd.getText().toString().equals("123456")){
//            Toast.makeText(MainActivity.this, "Login success, welcome admin !", Toast.LENGTH_SHORT).show();
//
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            intent.putExtra("USERNAME", txtUsername.getText().toString());
//            Bundle b = new Bundle();
//            b.putString("USERNAME", txtUsername.getText().toString());
//            intent.putExtras(b);
            startActivity(intent);
//        } else{
//            Toast toast =Toast.makeText(MainActivity.this, "Login Fail", Toast.LENGTH_SHORT);
//            toast.show();
//        }

//        Uri uri = Uri.parse("https://www.youtube.com");
//        Intent it = new Intent(Intent.ACTION_VIEW,uri);
//        startActivity(it);
//        Uri uri = Uri.parse("tel:0917724708");
//        Intent it = new Intent(Intent.ACTION_DIAL, uri);
//        startActivity(it);

    }

    public void LoginMain(View view){
        EditText username = findViewById(R.id.username);
        EditText pwd = findViewById(R.id.pwd);
        String msg = "Hello Kha - username: " + username.getText().toString() + " - pwd: " + pwd.getText().toString();
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}