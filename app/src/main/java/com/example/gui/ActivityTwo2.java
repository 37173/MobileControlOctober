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
                "Мост ведущий в замок", "Под водой","Мы туристы","Лесная осень","В Венеции", "В деревне"
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
                    case "Мост ведущий в замок":
                        imageView.setImageResource(R.drawable.page1);
                        break;
                    case "Под водой":
                        imageView.setImageResource(R.drawable.page2);
                        break;
                    case "Мы туристы":
                        imageView.setImageResource(R.drawable.page3);
                        break;
                    case "Лесная осень":
                        imageView.setImageResource(R.drawable.page4);
                        break;
                    case "В Венеции":
                        imageView.setImageResource(R.drawable.page5);
                        break;
                    case "В деревне":
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