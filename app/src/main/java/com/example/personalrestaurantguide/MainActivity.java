package com.example.personalrestaurantguide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Click listener for Restaurant 1
        findViewById(R.id.card_restaurant_1).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "Pizza Paradise");
            intent.putExtra("address", "123 Main St, Springfield, IL");
            intent.putExtra("phone", "(123) 456-7890");
            intent.putExtra("description", "The best pizza in town with vegetarian and vegan options.");
            intent.putExtra("rating", "4.8");
            intent.putExtra("type_of_food", "Pizza, Italian, Vegetarian");
            intent.putExtra("distance", "2.5 km");
            intent.putExtra("hours", "10:00 AM - 10:00 PM");
            intent.putExtra("latitude", 39.7817);
            intent.putExtra("longitude", -89.6501);
            startActivity(intent);
        });

        // Click listener for Restaurant 2
        findViewById(R.id.card_restaurant_2).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "Sushi World");
            intent.putExtra("address", "456 Oak Ave, Chicago, IL");
            intent.putExtra("phone", "(987) 654-3210");
            intent.putExtra("description", "Fresh and authentic sushi, sashimi, and rolls.");
            intent.putExtra("rating", "4.7");
            intent.putExtra("type_of_food", "Sushi, Japanese");
            intent.putExtra("distance", "5.0 km");
            intent.putExtra("hours", "11:00 AM - 10:00 PM");
            intent.putExtra("latitude", 41.8781);
            intent.putExtra("longitude", -87.6298);
            startActivity(intent);
        });

        // Click listener for Restaurant 3
        findViewById(R.id.card_restaurant_3).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "Burger Haven");
            intent.putExtra("address", "789 Pine Rd, Denver, CO");
            intent.putExtra("phone", "(555) 123-4567");
            intent.putExtra("description", "Juicy gourmet burgers with customizable toppings.");
            intent.putExtra("rating", "4.6");
            intent.putExtra("type_of_food", "Burgers, American");
            intent.putExtra("distance", "3.2 km");
            intent.putExtra("hours", "12:00 PM - 11:00 PM");
            intent.putExtra("latitude", 39.7392);
            intent.putExtra("longitude", -104.9903);
            startActivity(intent);
        });

        // Click listener for Restaurant 4
        findViewById(R.id.card_restaurant_4).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "Taco Fiesta");
            intent.putExtra("address", "321 Elm St, Austin, TX");
            intent.putExtra("phone", "(222) 333-4444");
            intent.putExtra("description", "Authentic Mexican tacos with a twist of fusion flavors.");
            intent.putExtra("rating", "4.9");
            intent.putExtra("type_of_food", "Mexican, Tacos");
            intent.putExtra("distance", "4.1 km");
            intent.putExtra("hours", "9:00 AM - 9:00 PM");
            intent.putExtra("latitude", 30.2672);
            intent.putExtra("longitude", -97.7431);
            startActivity(intent);
        });

        // Click listener for Restaurant 5
        findViewById(R.id.card_restaurant_5).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("name", "The Green Bowl");
            intent.putExtra("address", "654 Cedar Blvd, Portland, OR");
            intent.putExtra("phone", "(444) 555-6666");
            intent.putExtra("description", "Healthy and delicious bowls, catering to vegans and vegetarians.");
            intent.putExtra("rating", "4.5");
            intent.putExtra("type_of_food", "Healthy, Vegetarian, Vegan");
            intent.putExtra("distance", "1.8 km");
            intent.putExtra("hours", "8:00 AM - 8:00 PM");
            intent.putExtra("latitude", 45.5051);
            intent.putExtra("longitude", -122.6750);
            startActivity(intent);
        });

        // Click listener for "View Reservations" button
        Button btnViewReservations = findViewById(R.id.btnViewReservations);
        btnViewReservations.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ViewReservationsActivity.class);
            startActivity(intent);
        });
    }
}
