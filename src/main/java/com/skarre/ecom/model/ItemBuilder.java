package com.skarre.ecom.model;

public class ItemBuilder {

    private String itemName;

    private String itemStyle;

    private String color;

    private double basePrice;

    private double discount;

    public ItemBuilder setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public ItemBuilder setItemStyle(String itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public ItemBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ItemBuilder setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        return this;
    }

    public ItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public ItemBuilder(String itemName, String itemStyle, String color, double basePrice, double discount) {
        this.itemName = itemName;
        this.itemStyle = itemStyle;
        this.color = color;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public ItemBuilder() {
    }

    public Item build(){
        return new Item(itemName,itemStyle,color,basePrice,discount);
    }
}
