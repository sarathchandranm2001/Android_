package com.example.fooddelivery;



public class FoodItem {

    private String itemName;
    private String itemDescription;
    private String itemPrice;

    public FoodItem(String itemName, String itemDescription, String itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }
}
