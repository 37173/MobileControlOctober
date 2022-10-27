package com.example.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo2 extends AppCompatActivity {
    private ListView listView;
    private ImageView imageView;
    Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two2);
        listView=(ListView) findViewById(R.id.ListView);

        final String[] resNames = new String[]{
                "page1.png", "page2.png","page3.png","page4.png","page5.png", "page6.png"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<> (this,
                android.R.layout.simple_list_item_1,resNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener (new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View itemClicked, int i, long l) {
                Toast toast = Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(), Toast.LENGTH_SHORT);
                toast.setGravity(2, 10, 400);
                toast.show();
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                switch (strText) {
                    case "page1.png":
                        imageView.setImageResource(R.drawable.page1);
                        break;
                    case "page2.png":
                        imageView.setImageResource(R.drawable.page2);
                        break;
                    case "page3.png":
                        imageView.setImageResource(R.drawable.page3);
                        break;
                    case "page4.png":
                        imageView.setImageResource(R.drawable.page4);
                        break;
                    case "page5.png":
                        imageView.setImageResource(R.drawable.page5);
                        break;
                    case "page6.png":
                        imageView.setImageResource(R.drawable.page6);
                        break;
                }

            }


        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Back:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}