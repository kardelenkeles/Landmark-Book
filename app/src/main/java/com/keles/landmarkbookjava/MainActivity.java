package com.keles.landmarkbookjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.keles.landmarkbookjava.databinding.ActivityDetailsBinding;
import com.keles.landmarkbookjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArraylist;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArraylist = new ArrayList<>();
        Landmark pisa = new Landmark("Pisa", "Italy", R.drawable.pisa);
        Landmark eiffel = new Landmark("Eiffel", "France", R.drawable.eiffel);
        Landmark colleseum = new Landmark("Colleseum", "Italy", R.drawable.colleseum);
        Landmark fuji = new Landmark("Fuji", "Japan", R.drawable.fuji);

        landmarkArraylist.add(pisa);
        landmarkArraylist.add(eiffel);
        landmarkArraylist.add(colleseum);
        landmarkArraylist.add(fuji);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter landmarkAdapter = new Adapter(landmarkArraylist);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}



