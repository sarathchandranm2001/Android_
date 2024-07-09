package com.example.contactlist_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {

    public ContactAdapter(Context context, ArrayList<Contact> contacts) {
        super(context, 0, contacts);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        Contact contact = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_contact, parent, false);
        }

        // Lookup view for data population
        TextView name = convertView.findViewById(R.id.contactName);
        TextView phone = convertView.findViewById(R.id.contactPhone);

        // Populate the data into the template view using the data object
        assert contact != null;
        name.setText(contact.getName());
        phone.setText(contact.getPhone());

        // Return the completed view to render on screen
        return convertView;
    }
}
