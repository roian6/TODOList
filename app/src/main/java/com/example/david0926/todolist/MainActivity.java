package com.example.david0926.todolist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    AdapterActivity rcvAdap;
    EditText edt1;
    static int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.recycler);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcvAdap = new AdapterActivity();
        rcv.setAdapter(rcvAdap);
        rcvAdap.notifyDataSetChanged();
        for(int j=0;j<i;j++){
            ModelActivity model = new ModelActivity();
            model.setTitle(Integer.toString(i)+"번째 타이틀");
            model.setSub(Integer.toString(i)+"번째 서브타이틀");
            rcvAdap.add(model);
            rcvAdap.notifyDataSetChanged();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ModelActivity model = new ModelActivity();
                model.setTitle(Integer.toString(i)+"번째 타이틀");
                model.setSub(Integer.toString(i)+"번째 서브타이틀");
                rcvAdap.add(model);
                i++;
                rcvAdap.notifyDataSetChanged();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
