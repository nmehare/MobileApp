package com.example.techquizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories1);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        //Set back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        //as database firebase not implemeted yet so using hardcoaded list
        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category1"));


        recyclerView.setLayoutManager(layoutManager);
        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    //set back button actions

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
