package com.example.fooddelivery;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<FoodItem> {

    private final Context mContext;
    private final int mResource;

    public CustomListAdapter(Context context, int resource, ArrayList<FoodItem> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the data item for this position
        FoodItem foodItem = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
        }

        // Lookup view for data population
        TextView itemName = convertView.findViewById(R.id.itemName);
        TextView itemDescription = convertView.findViewById(R.id.itemDescription);
        TextView itemPrice = convertView.findViewById(R.id.itemPrice);

        // Populate the data into the template view using the data object
        assert foodItem != null;
        itemName.setText(foodItem.getItemName());
        itemDescription.setText(foodItem.getItemDescription());
        itemPrice.setText(foodItem.getItemPrice());

        // Return the completed view to render on screen
        return convertView;
    }
}
