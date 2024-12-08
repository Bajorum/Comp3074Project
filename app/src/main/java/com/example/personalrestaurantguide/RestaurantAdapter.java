package com.example.personalrestaurantguide;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {

    private final List<Restaurant> restaurantList;
    private final Context context;

    // Constructor
    public RestaurantAdapter(Context context, List<Restaurant> restaurantList) {
        this.context = context;
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);

        // Bind data to the views
        holder.tvName.setText(restaurant.getName());
        holder.tvAddress.setText(restaurant.getAddress());

        // Set click listener for the card
        holder.cardView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name", restaurant.getName());
            intent.putExtra("address", restaurant.getAddress());
            intent.putExtra("phone", restaurant.getPhone());
            intent.putExtra("description", restaurant.getDescription());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    // ViewHolder class
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvAddress;
        CardView cardView;

        public RestaurantViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
