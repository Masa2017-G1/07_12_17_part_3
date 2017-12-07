package com.sheygam.masa_2017_07_12_part3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.Set;

public class MySecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);
        Intent intent = getIntent();
        Log.d("MY_TAG", "action: " + intent.getAction());
        Uri uri = intent.getData();
        Set<String> params = uri.getQueryParameterNames();
        String str = "";
        for (String param : params){

            str += param + "=" + uri.getQueryParameter(param) + "\n";
        }

        TextView dataTxt = findViewById(R.id.data_txt);
        dataTxt.setText(str);
    }
}
