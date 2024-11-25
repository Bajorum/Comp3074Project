package com.example.personalrestaurantguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set click listeners for each card
        findViewById(R.id.card_restaurant_1).setOnClickListener(this::onRestaurantClick);
        findViewById(R.id.card_restaurant_2).setOnClickListener(this::onRestaurantClick);
        findViewById(R.id.card_restaurant_3).setOnClickListener(this::onRestaurantClick);
        findViewById(R.id.card_restaurant_4).setOnClickListener(this::onRestaurantClick);
        findViewById(R.id.card_restaurant_5).setOnClickListener(this::onRestaurantClick);
    }

    public void onRestaurantClick(View view) {
        Intent intent = new Intent(this, DetailsActivity.class);

        if (view.getId() == R.id.card_restaurant_1) {
            intent.putExtra("restaurant_name", "Restaurant 1");
            intent.putExtra("restaurant_details", "123 Main St, City, ZIP");
            intent.putExtra("rating", "Rating: 4.5/5");
            intent.putExtra("type_of_food", "Type of Food: Italian, Pizza, Vegetarian");
            intent.putExtra("distance", "Distance from You: 2.5 km");
            intent.putExtra("contact", "Contact: (123) 456-7890");
            intent.putExtra("hours", "Hours: 10:00 AM - 10:00 PM");
            intent.putExtra("latitude", 37.7749); // San Francisco, CA
            intent.putExtra("longitude", -122.4194);
        } else if (view.getId() == R.id.card_restaurant_2) {
            intent.putExtra("restaurant_name", "Restaurant 2");
            intent.putExtra("restaurant_details", "456 Oak Ave, City, ZIP");
            intent.putExtra("rating", "Rating: 4.0/5");
            intent.putExtra("type_of_food", "Type of Food: Chinese, Noodles, Dumplings");
            intent.putExtra("distance", "Distance from You: 3.1 km");
            intent.putExtra("contact", "Contact: (987) 654-3210");
            intent.putExtra("hours", "Hours: 11:00 AM - 11:00 PM");
            intent.putExtra("latitude", 34.0522); // Los Angeles, CA
            intent.putExtra("longitude", -118.2437);
        } else if (view.getId() == R.id.card_restaurant_3) {
            intent.putExtra("restaurant_name", "Restaurant 3");
            intent.putExtra("restaurant_details", "789 Pine Rd, City, ZIP");
            intent.putExtra("rating", "Rating: 4.2/5");
            intent.putExtra("type_of_food", "Type of Food: Indian, Curry, Spicy Dishes");
            intent.putExtra("distance", "Distance from You: 4.0 km");
            intent.putExtra("contact", "Contact: (456) 789-0123");
            intent.putExtra("hours", "Hours: 9:00 AM - 9:00 PM");
            intent.putExtra("latitude", 40.7128); // New York City, NY
            intent.putExtra("longitude", -74.0060);
        } else if (view.getId() == R.id.card_restaurant_4) {
            intent.putExtra("restaurant_name", "Restaurant 4");
            intent.putExtra("restaurant_details", "654 Elm St, City, ZIP");
            intent.putExtra("rating", "Rating: 3.8/5");
            intent.putExtra("type_of_food", "Type of Food: Fast Food, Burgers, Fries");
            intent.putExtra("distance", "Distance from You: 1.2 km");
            intent.putExtra("contact", "Contact: (321) 654-9870");
            intent.putExtra("hours", "Hours: 8:00 AM - 8:00 PM");
            intent.putExtra("latitude", 41.8781); // Chicago, IL
            intent.putExtra("longitude", -87.6298);
        } else if (view.getId() == R.id.card_restaurant_5) {
            intent.putExtra("restaurant_name", "Restaurant 5");
            intent.putExtra("restaurant_details", "321 Cedar Ln, City, ZIP");
            intent.putExtra("rating", "Rating: 5.0/5");
            intent.putExtra("type_of_food", "Type of Food: Sushi, Japanese, Seafood");
            intent.putExtra("distance", "Distance from You: 5.0 km");
            intent.putExtra("contact", "Contact: (654) 321-0987");
            intent.putExtra("hours", "Hours: 12:00 PM - 10:00 PM");
            intent.putExtra("latitude", 47.6062); // Seattle, WA
            intent.putExtra("longitude", -122.3321);
        }

        startActivity(intent);
    }
}
