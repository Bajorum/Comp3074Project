package com.example.personalrestaurantguide;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ViewReservationsActivity extends AppCompatActivity {

    private static final ArrayList<String> reservations = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reservations);

        // Sample reservations (add real data dynamically in the future)
        reservations.add("Pizza Paradise - 2024-12-10, 6:00 PM, 4 People");
        reservations.add("Sushi World - 2024-12-12, 7:00 PM, 2 People");

        // Initialize ListView
        ListView lvReservations = findViewById(R.id.lvReservations);

        // Set up adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, reservations);
        lvReservations.setAdapter(adapter);

        // Back Button
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // Delete Reservation Button
        Button btnDeleteReservation = findViewById(R.id.btnDeleteReservation);
        btnDeleteReservation.setOnClickListener(v -> {
            if (!reservations.isEmpty()) {
                reservations.remove(reservations.size() - 1); // Remove the last reservation
                adapter.notifyDataSetChanged(); // Update the list view
            }
        });
    }
}