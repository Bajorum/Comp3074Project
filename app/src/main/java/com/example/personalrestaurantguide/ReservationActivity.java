package com.example.personalrestaurantguide;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);

        // Initialize UI elements
        EditText etName = findViewById(R.id.etName);
        EditText etPhone = findViewById(R.id.etPhone);
        EditText etDate = findViewById(R.id.etDate);
        EditText etTime = findViewById(R.id.etTime);
        EditText etPeople = findViewById(R.id.etPeople);
        Button btnConfirmReservation = findViewById(R.id.btnConfirmReservation);

        // Handle reservation confirmation
        btnConfirmReservation.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String phone = etPhone.getText().toString();
            String date = etDate.getText().toString();
            String time = etTime.getText().toString();
            String people = etPeople.getText().toString();

            if (name.isEmpty()  phone.isEmpty()  date.isEmpty()  time.isEmpty()  people.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show();
            } else {
                // Here you can save the reservation to a database or send it to a server
                Toast.makeText(this, "Reservation confirmed for " + name + " on " + date + " at " + time + ".", Toast.LENGTH_LONG).show();
                finish(); // Close the reservation activity and return to the previous screen
            }
        });
    }
}