package com.example.avion.funciona.Entities;

public class Item {

    String item_code;
    String item_name;
    String item_quntity;
    String item_price;
    String item_cost;
    int item_image;

    public Item(String item_code, String item_name, String item_quntity, String item_price, String item_cost, int item_image) {
        this.item_code = item_code;
        this.item_name = item_name;
        this.item_quntity = item_quntity;
        this.item_price = item_price;
        this.item_cost = item_cost;
        this.item_image = item_image;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_quntity() {
        return item_quntity;
    }

    public void setItem_quntity(String item_quntity) {
        this.item_quntity = item_quntity;
    }

    public String getItem_price() {
        return item_price;
    }

    public void setItem_price(String item_price) {
        this.item_price = item_price;
    }

    public String getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(String item_cost) {
        this.item_cost = item_cost;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }
}
