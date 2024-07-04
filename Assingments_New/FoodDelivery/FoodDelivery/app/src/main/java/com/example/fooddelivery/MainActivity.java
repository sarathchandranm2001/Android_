package com.example.fooddelivery;


import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomListAdapter adapter;
    private ArrayList<FoodItem> foodItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ListView
        listView = findViewById(R.id.listView);

        // Initialize data
        foodItemList = new ArrayList<>();
        foodItemList.add(new FoodItem("Pizza", "Delicious cheese pizza", "$10.99"));
        foodItemList.add(new FoodItem("Burger", "Classic beef burger", "$8.99"));
        foodItemList.add(new FoodItem("Pasta", "Spaghetti with marinara sauce", "$12.49"));
        foodItemList.add(new FoodItem("Salad", "Fresh garden salad", "$6.99"));
        foodItemList.add(new FoodItem("Smoothie", "Mixed fruit smoothie", "$4.99"));

        // Initialize the adapter
        adapter = new CustomListAdapter(this, R.layout.list_item_layout, foodItemList);

        // Set the adapter to the ListView
        listView.setAdapter(adapter);
    }
}
