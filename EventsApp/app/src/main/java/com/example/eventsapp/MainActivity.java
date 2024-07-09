package com.example.eventsapp;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        ListView listView = findViewById(R.id.listView);
        ConstraintLayout mainLayout = findViewById(R.id.main);

        // Button click changes TextView text
        button.setOnClickListener(v -> textView.setText("Button Clicked"));

        // ListView long click shows Toast
        String[] values = new String[] {"Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(MainActivity.this, "Long Clicked: " + values[position], Toast.LENGTH_SHORT).show();
            return true;
        });

        // Touch anywhere on the layout except widgets shows Toast
        mainLayout.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        });
    }
}