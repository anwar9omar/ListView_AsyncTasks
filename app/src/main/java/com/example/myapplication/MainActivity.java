package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

String[]cities={"Baghdsd","Mosul","Anbar","Kut","Basra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.list_view,cities);
        ListView listView=(ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

  public abstract class MyAsyncTasks extends AsyncTask<String,String,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("processing results");
            progressDialog.setCancelable(false);
            progressDialog.show();
            progressDialog.dismiss();
            }

      @Override
      protected void onPostExecute(String s) {
          super.onPreExecute();
      }

  }


    }
