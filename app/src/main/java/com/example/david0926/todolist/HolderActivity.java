package com.example.david0926.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class HolderActivity extends RecyclerView.ViewHolder{

    public TextView title, sub;

    public HolderActivity(View view){
        super(view);
        title = view.findViewById(R.id.title);
        sub = view.findViewById(R.id.sub);
    }
}

