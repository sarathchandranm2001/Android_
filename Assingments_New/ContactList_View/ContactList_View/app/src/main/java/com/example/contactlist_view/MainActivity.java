package com.example.contactlist_view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generate sample data
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("John Doe", "+1234567890"));
        contacts.add(new Contact("Jane Smith", "+1987654321"));
        contacts.add(new Contact("Michael Johnson", "+1122334455"));
        contacts.add(new Contact("Emily Davis", "+9988776655"));
        contacts.add(new Contact("David Brown", "+5544332211"));
        contacts.add(new Contact("Emma Wilson", "+6677889900"));
        contacts.add(new Contact("James Taylor", "+1234987654"));
        contacts.add(new Contact("Olivia Martinez", "+8765123456"));
        contacts.add(new Contact("Daniel Garcia", "+5432167890"));
        contacts.add(new Contact("Sophia Lopez", "+1123581321"));

        // Create the adapter to convert the array to views
        ContactAdapter adapter = new ContactAdapter(this, contacts);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.contactListView);
        listView.setAdapter(adapter);
    }
}
