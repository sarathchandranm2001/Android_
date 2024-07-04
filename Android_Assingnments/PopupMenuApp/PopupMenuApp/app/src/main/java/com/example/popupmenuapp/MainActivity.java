package com.example.popupmenuapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Apply window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find button and set up click listener to show popup menu
        Button buttonShowMenu = findViewById(R.id.button_show_menu);
        buttonShowMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    // Method to show popup menu
    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return handleMenuItemClick(item);
            }
        });
        popupMenu.show();
    }

    // Method to handle menu item clicks
    private boolean handleMenuItemClick(MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.action_edit) {
            Toast.makeText(MainActivity.this, "Edit selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.action_delete) {
            Toast.makeText(MainActivity.this, "Delete selected", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.action_share) {
            Toast.makeText(MainActivity.this, "Share selected", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return false;
        }
    }
}
