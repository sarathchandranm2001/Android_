package com.example.second_mobile_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import androidx.activity.EdgeToEdge;


public class MainActivity extends AppCompatActivity {

    private TextView t1, t2, t3, t4, t5, t6, t7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize TextViews
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);

        // Apply insets listener for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get current date
        Calendar calendar = Calendar.getInstance();

        // Format 1: Default format
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        t1.setText(sdf1.format(calendar.getTime()));

        // Format 2: Day of week
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-YYYY", Locale.getDefault());
        t2.setText(sdf2.format(calendar.getTime()));

        // Format 3: Month abbreviation
        SimpleDateFormat sdf3 = new SimpleDateFormat("MMM", Locale.getDefault());
        t3.setText(sdf3.format(calendar.getTime()));

        // Format 4: Full month name
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMMM", Locale.getDefault());
        t4.setText(sdf4.format(calendar.getTime()));

        // Format 5: Year
        SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy", Locale.getDefault());
        t5.setText(sdf5.format(calendar.getTime()));

        // Format 6: Day of month
        SimpleDateFormat sdf6 = new SimpleDateFormat("dd", Locale.getDefault());
        t6.setText(sdf6.format(calendar.getTime()));

        // Format 7: Time
        SimpleDateFormat sdf7 = new SimpleDateFormat("hh:mm a", Locale.getDefault());
        t7.setText(sdf7.format(calendar.getTime()));
    }
}
