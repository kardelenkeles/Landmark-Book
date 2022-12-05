package com.keles.landmarkbookjava;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.keles.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.LandmarkHolder> {
    ArrayList<Landmark> landmarkArrayList;

    public Adapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder LandmarkHolder, int position) {
        LandmarkHolder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);
    }

    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    public class LandmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
