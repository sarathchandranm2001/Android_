package com.example.tab_grid_demo;

import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<>();

        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.ic_launcher_background));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_gfglogo));
        coursesGV.setAdapter(adapter);
    }
}
