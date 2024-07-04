package com.example.contactlistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of contacts
        String[] contacts = {"John Doe", "Jane Smith", "Robert Johnson", "Emily Davis", "Michael Brown"};

        // Find the ListView in the layout
        ListView contactListView = findViewById(R.id.contactListView);

        // Create an ArrayAdapter to bind the contacts array to the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, contacts);

        // Set the adapter on the ListView
        contactListView.setAdapter(adapter);
    }
}
