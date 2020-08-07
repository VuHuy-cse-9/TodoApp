package com.application.mytodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = getLayoutInflater().inflate(R.layout.task, viewGroup, false);
            }
            //TODO: Custom View here

            return view;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String []array = new String[10];
        for (int i = 0; i < 10; ++i) {
            array[i] = "item" + i;
            Log.i("TAG", array[i]);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.task,
                array);
        ListView listTasks = findViewById(R.id.listTask);
        listTasks.setAdapter(adapter);
    }

    public void onCheckedClicked(View view) {
        //TODO:Implement method checkbox in task.xml here
    }
}