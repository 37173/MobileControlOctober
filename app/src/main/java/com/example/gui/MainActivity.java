package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonList;
    Button buttonList2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonList = (Button) findViewById(R.id.buttonList);

        buttonList2 = (Button) findViewById(R.id.buttonList2);
        buttonList2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonList:
                Intent intent = new Intent(this, ActivityTwo2.class);
                startActivity(intent);
                break;
            case R.id.buttonList2:
                Intent intent1 = new Intent(this, ActivityThree.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
