package com.example.personalrestaurantguide;

public class Restaurant {
    private final String name;
    private final String address;
    private final String phone;
    private final String description;

    public Restaurant(String name, String address, String phone, String description) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }
}
