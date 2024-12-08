package com.example.personalrestaurantguide;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private WebView webViewMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Retrieve data passed from MainActivity
        String restaurantName = getIntent().getStringExtra("name");
        String restaurantDetails = getIntent().getStringExtra("description");
        String rating = getIntent().getStringExtra("rating");
        String typeOfFood = getIntent().getStringExtra("type_of_food");
        String distance = getIntent().getStringExtra("distance");
        String contact = getIntent().getStringExtra("phone");
        String hours = getIntent().getStringExtra("hours");
        double latitude = getIntent().getDoubleExtra("latitude", 0.0);
        double longitude = getIntent().getDoubleExtra("longitude", 0.0);

        // Populate data in views
        ((TextView) findViewById(R.id.tvRestaurantName)).setText(restaurantName != null ? restaurantName : "N/A");
        ((TextView) findViewById(R.id.tvRestaurantDetails)).setText(restaurantDetails != null ? restaurantDetails : "N/A");
        ((TextView) findViewById(R.id.tvRating)).setText(rating != null ? "Rating: " + rating : "Rating: N/A");
        ((TextView) findViewById(R.id.tvTypeOfFood)).setText(typeOfFood != null ? "Cuisine: " + typeOfFood : "Cuisine: N/A");
        ((TextView) findViewById(R.id.tvDistance)).setText(distance != null ? "Distance: " + distance : "Distance: N/A");
        ((TextView) findViewById(R.id.tvContact)).setText(contact != null ? "Phone: " + contact : "Phone: N/A");
        ((TextView) findViewById(R.id.tvHours)).setText(hours != null ? "Hours: " + hours : "Hours: N/A");

        // Initialize the WebView for the map
        webViewMap = findViewById(R.id.webViewMap);

        // Configure WebView settings
        WebSettings webSettings = webViewMap.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript
        webSettings.setDomStorageEnabled(true); // Enable DOM storage
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT); // Default cache mode

        webViewMap.setWebViewClient(new WebViewClient()); // Handle navigation inside WebView

        // Generate OpenStreetMap URL with latitude and longitude
        String mapUrl = "https://www.openstreetmap.org/?mlat=" + latitude + "&mlon=" + longitude + "#map=15/" + latitude + "/" + longitude;

        // Load the map URL in the WebView
        webViewMap.loadUrl(mapUrl);

        // Back Button functionality
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        // "Our Menu" Button functionality
        Button btnOurMenu = findViewById(R.id.btnOurMenu);
        btnOurMenu.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, MenuActivity.class);
            intent.putExtra("restaurant_name", restaurantName);
            startActivity(intent);
        });

        // "Make Reservations" Button functionality
        Button btnMakeReservations = findViewById(R.id.btnMakeReservations);
        btnMakeReservations.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, ReservationActivity.class);
            intent.putExtra("restaurant_name", restaurantName);
            startActivity(intent);
        });
    }
}
