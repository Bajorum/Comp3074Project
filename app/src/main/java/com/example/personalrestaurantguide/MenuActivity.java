package com.example.personalrestaurantguide;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        String restaurantName = getIntent().getStringExtra("restaurant_name");

        TextView tvMenuTitle = findViewById(R.id.tvMenuTitle);
        TextView tvMenuDetails = findViewById(R.id.tvMenuDetails);
        Button btnBackMenu = findViewById(R.id.btnBackMenu);

        // Set restaurant name as the menu title
        tvMenuTitle.setText(restaurantName + " Menu");

        // Format menu details based on the restaurant
        String menu = "";
        if (restaurantName.equals("Pizza Paradise")) {
            menu = "SALAD\n"
                    + "Hand Tossed Salad - $7\n"
                    + "With Ranch or Thousand Island - $6\n\n"
                    + "ENTRÉE\n"
                    + "Margherita Pizza - $10.99\n"
                    + "Pepperoni Pizza - $12.99\n"
                    + "Vegetarian Pizza - $11.99\n"
                    + "BBQ Chicken Pizza - $13.99\n\n"
                    + "DESSERT\n"
                    + "Tiramisu - $5.99\n"
                    + "Chocolate Lava Cake - $6.99\n\n"
                    + "BEVERAGES\n"
                    + "Soft Drinks - $3\n"
                    + "Fresh Lemonade - $4";
        } else if (restaurantName.equals("Sushi World")) {
            menu = "SALAD\n"
                    + "Seaweed Salad - $6.99\n"
                    + "Cucumber Salad - $5.99\n\n"
                    + "ENTRÉE\n"
                    + "Salmon Sushi Roll - $9.99\n"
                    + "California Roll - $8.99\n"
                    + "Dragon Roll - $13.99\n"
                    + "Tuna Sashimi - $12.99\n\n"
                    + "DESSERT\n"
                    + "Mochi Ice Cream - $4.99\n"
                    + "Green Tea Cheesecake - $5.99\n\n"
                    + "BEVERAGES\n"
                    + "Green Tea - $3\n"
                    + "Sake (Non-Alcoholic) - $5";
        } else if (restaurantName.equals("Burger Haven")) {
            menu = "SALAD\n"
                    + "Classic Caesar Salad - $7.99\n"
                    + "Garden Salad - $6.99\n\n"
                    + "ENTRÉE\n"
                    + "Classic Cheeseburger - $8.99\n"
                    + "Bacon Double Burger - $10.99\n"
                    + "Spicy Jalapeno Burger - $11.99\n\n"
                    + "DESSERT\n"
                    + "Apple Pie - $5.99\n"
                    + "Chocolate Sundae - $4.99\n\n"
                    + "BEVERAGES\n"
                    + "Milkshake (Vanilla/Chocolate/Strawberry) - $4.99\n"
                    + "Soft Drinks - $2.99";
        } else if (restaurantName.equals("Taco Fiesta")) {
            menu = "SALAD\n"
                    + "Taco Salad - $8.99\n"
                    + "Mexican Corn Salad - $7.99\n\n"
                    + "ENTRÉE\n"
                    + "Beef Tacos (3 pcs) - $7.99\n"
                    + "Chicken Tacos (3 pcs) - $8.99\n"
                    + "Fish Tacos (3 pcs) - $9.99\n\n"
                    + "DESSERT\n"
                    + "Churros with Chocolate Sauce - $4.99\n"
                    + "Flan - $5.99\n\n"
                    + "BEVERAGES\n"
                    + "Horchata - $3.99\n"
                    + "Margarita (Non-Alcoholic) - $6.99";
        } else if (restaurantName.equals("The Green Bowl")) {
            menu = "SALAD\n"
                    + "Quinoa and Kale Salad - $9.99\n"
                    + "Fruit Bowl - $8.99\n\n"
                    + "ENTRÉE\n"
                    + "Buddha Bowl - $10.99\n"
                    + "Sweet Potato and Chickpea Bowl - $11.99\n"
                    + "Avocado Toast - $8.99\n\n"
                    + "DESSERT\n"
                    + "Vegan Brownie - $4.99\n"
                    + "Oatmeal Cookies - $3.99\n\n"
                    + "BEVERAGES\n"
                    + "Green Smoothie - $5.99\n"
                    + "Matcha Latte - $4.99";
        } else {
            menu = "Menu not available for this restaurant.";
        }

        // Set the menu details
        tvMenuDetails.setText(menu);

        // Handle Back Button
        btnBackMenu.setOnClickListener(v -> finish());
    }
}
