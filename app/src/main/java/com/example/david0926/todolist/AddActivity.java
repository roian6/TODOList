package com.example.david0926.todolist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.EditText;


public class AddActivity extends AppCompatActivity{


    AdapterActivity rcvAdap;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_remove);
        rcvAdap = new AdapterActivity();
        rcvAdap.notifyDataSetChanged();

    }

    public void onClick(View view) {
        //edt1 = findViewById(R.id.edt1);
//        ModelActivity model = new ModelActivity();
//        model.setTitle(String.valueOf(edt1.getText())+"번째 타이틀");
//        model.setSub(String.valueOf(edt1.getText())+"번째 서브타이틀");
        //rcvAdap.del(Integer.parseInt(edt1.getText().toString()));
    }
}


