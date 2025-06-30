package com.example.healthconnect;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView=findViewById(R.id.featured_doctors_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        List<DoctorList> doctors = new ArrayList<>();
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Anshu Bhatam", "Cardiologist"));
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Vandana Roy", "Neurologist"));
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Vandana Roy", "Neurologist"));
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Vandana Roy", "Neurologist"));
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Vandana Roy", "Neurologist"));
        doctors.add(new DoctorList(R.drawable.manblack,"Dr. Vandana Roy", "Neurologist"));
        
        // Add more as needed

        DoctorAdapter adapter = new DoctorAdapter(this, doctors);
        recyclerView.setAdapter(adapter);

    }
}