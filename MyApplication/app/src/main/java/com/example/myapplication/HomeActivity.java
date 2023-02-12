package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.CategoryAdapter;
import com.example.myapplication.model.Category;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView rcv_category;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        Toast.makeText(this, "Welcome " + username, Toast.LENGTH_SHORT).show();

        rcv_category = findViewById(R.id.rcv_category);
        List<Category> listc = new ArrayList<>();
        listc.add(new Category(R.drawable.vien_thuoc, "phamacy"));
        listc.add(new Category(R.drawable.hop_qua, "registry"));
        listc.add(new Category(R.drawable.xe_day_hang, "cartwheel"));
        listc.add(new Category(R.drawable.quan_ao, "clothing"));
        listc.add(new Category(R.drawable.giay, "shose"));
        listc.add(new Category(R.drawable.tui, "acessory"));
        listc.add(new Category(R.drawable.quan_ao_baby, "baby"));
        listc.add(new Category(R.drawable.home, "home"));
        listc.add(new Category(R.drawable.lo_nuong, "patio & garden"));

        CategoryAdapter categoryAdapter = new CategoryAdapter(listc);
        rcv_category.setAdapter(categoryAdapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rcv_category.setLayoutManager(gridLayoutManager);


    }
}
