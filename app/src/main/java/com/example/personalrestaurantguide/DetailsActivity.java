package com.example.personalrestaurantguide;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private WebView webViewMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Get the data passed from MainActivity
        String restaurantName = getIntent().getStringExtra("restaurant_name");
        String restaurantDetails = getIntent().getStringExtra("restaurant_details");
        String rating = getIntent().getStringExtra("rating");
        String typeOfFood = getIntent().getStringExtra("type_of_food");
        String distance = getIntent().getStringExtra("distance");
        String contact = getIntent().getStringExtra("contact");
        String hours = getIntent().getStringExtra("hours");
        double latitude = getIntent().getDoubleExtra("latitude", 0.0);
        double longitude = getIntent().getDoubleExtra("longitude", 0.0);

        // Populate the data in the views

        ((TextView) findViewById(R.id.tvRestaurantName)).setText(restaurantName);
        ((TextView) findViewById(R.id.tvRestaurantDetails)).setText(restaurantDetails);
        ((TextView) findViewById(R.id.tvRating)).setText(rating);
        ((TextView) findViewById(R.id.tvTypeOfFood)).setText(typeOfFood);
        ((TextView) findViewById(R.id.tvDistance)).setText(distance);
        ((TextView) findViewById(R.id.tvContact)).setText(contact);
        ((TextView) findViewById(R.id.tvHours)).setText(hours);

        // Initialize the WebView

        webViewMap = findViewById(R.id.webViewMap);

        // Configure WebView settings

        WebSettings webSettings = webViewMap.getSettings();
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT); // Default cache behavior
        webSettings.setDomStorageEnabled(true); // Enable the DOM storage
        webSettings.setJavaScriptEnabled(true); // Enable the JavaScript

        webViewMap.setWebViewClient(new WebViewClient()); // Handle page navigation inside WebView

        // Generate OpenStreetMap URL
        String mapUrl = "https://www.openstreetmap.org/?mlat=" + latitude + "&mlon=" + longitude + "#map=15/" + latitude + "/" + longitude;

        // Load the map URL
        webViewMap.loadUrl(mapUrl);
    }

    // Handle the back button click
    public void onBackClick(View view) {
        finish(); // Close the current activity and return to the previous one
    }
}
