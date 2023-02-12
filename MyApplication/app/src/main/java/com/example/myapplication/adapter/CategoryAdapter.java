package com.example.myapplication.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.DetailsActivity;
import com.example.myapplication.HomeActivity;
import com.example.myapplication.R;
import com.example.myapplication.model.Category;
import com.example.myapplication.model.ItemClickListener;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{
    private List<Category> listc;

    public CategoryAdapter(List<Category> listc) {
        this.listc = listc;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = listc.get(position);
        if(category == null) return;

        holder.imgCate.setImageResource(category.getImg());
        holder.tvname.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        if(listc != null) return listc.size();
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private ImageView imgCate;
        private TextView tvname;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCate = itemView.findViewById(R.id.img_category);
            tvname = itemView.findViewById(R.id.tv_name_category);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(),  tvname.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }

}
