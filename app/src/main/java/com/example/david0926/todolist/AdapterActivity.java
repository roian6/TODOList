package com.example.david0926.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class AdapterActivity extends RecyclerView.Adapter<HolderActivity>{


    List<ModelActivity> items = new ArrayList<>();


    public void add(ModelActivity data){
        items.add(data);
        notifyDataSetChanged();
    }

    public void del(int pos){
        items.remove(items.get(pos));
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HolderActivity onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item, parent, false);
        return new HolderActivity(view){};
    }

    @Override
    public void onBindViewHolder(@NonNull HolderActivity holder, int position) {

        ModelActivity item = items.get(position);
        holder.title.setText(item.getTitle());
        holder.sub.setText(item.getSub());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }



}