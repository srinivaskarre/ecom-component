package com.skarre.ecom.model;

public class Item {

    private String itemName;

    private String itemStyle;

    private String color;

    private double basePrice;

    private double discount;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public Item(String itemName, String itemStyle, String color, double basePrice, double discount) {
        this.itemName = itemName;
        this.itemStyle = itemStyle;
        this.color = color;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemStyle='" + itemStyle + '\'' +
                ", color='" + color + '\'' +
                ", basePrice=" + basePrice +
                ", discount=" + discount +
                '}';
    }
}
