package com.example.a1_layout;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnConstraintLayout, btnLinearLayout, btnRelativeLayout, btnFrameLayout, btnTableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        btnConstraintLayout = findViewById(R.id.btnConstraintLayout);
        btnLinearLayout = findViewById(R.id.btnLinearLayout);
        btnRelativeLayout = findViewById(R.id.btnRelativeLayout);
        btnFrameLayout = findViewById(R.id.btnFrameLayout);
        btnTableLayout = findViewById(R.id.btnTableLayout);

        // Set click listeners
        btnConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConstraintActivity.class));
            }
        });

        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearActivity.class));
            }
        });

        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeActivity.class));
            }
        });

        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameActivity.class));
            }
        });

        btnTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TableActivity.class));
            }
        });
    }

        public void navigateToConstraintLayout(View view) {
            startActivity(new Intent(MainActivity.this, ConstraintActivity.class));
        }

        public void navigateToLinearLayout(View view) {
            startActivity(new Intent(MainActivity.this, LinearActivity.class));
        }

        public void navigateToRelativeLayout(View view) {
            startActivity(new Intent(MainActivity.this, RelativeActivity.class));
        }

        public void navigateToFrameLayout(View view) {
            startActivity(new Intent(MainActivity.this, FrameActivity.class));
        }

        public void navigateToTableLayout(View view) {
            startActivity(new Intent(MainActivity.this, TableActivity.class));
        }


}
