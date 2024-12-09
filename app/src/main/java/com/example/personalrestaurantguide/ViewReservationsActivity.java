package com.example.personalrestaurantguide;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewReservationsActivity extends AppCompatActivity {

    private static final String PREFS_NAME = "ReservationsPrefs";
    private static final String RESERVATIONS_KEY = "reservations";

    private ArrayList<String> reservations;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_reservations);

        // Load reservations from SharedPreferences
        reservations = loadReservations();

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
                saveReservations(); // Save the updated list
            }
        });
    }

    private ArrayList<String> loadReservations() {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        String serializedReservations = preferences.getString(RESERVATIONS_KEY, "");
        if (serializedReservations.isEmpty()) {
            return new ArrayList<>();
        } else {
            String[] reservationArray = serializedReservations.split("\\|\\|");
            return new ArrayList<>(Arrays.asList(reservationArray));
        }
    }

    private void saveReservations() {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        String serializedReservations = String.join("||", reservations);
        editor.putString(RESERVATIONS_KEY, serializedReservations);
        editor.apply();
    }
}
