package com.example.iosgroceryapiios;

public class GroceryItem {
    private String item_name;
    private String item_category;
    private String image_url;
    private String item_note;

    public GroceryItem(String item_name,String item_category, String image_url, String item_note) {
        this.item_name = item_name;
        this.item_category=item_category;
        this.image_url = image_url;
        this.item_note = item_note;
    }

    public String getItem_category() {
        return item_category;
    }

    public void setItem_category(String item_category) {
        this.item_category = item_category;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getItem_note() {
        return item_note;
    }

    public void setItem_note(String item_note) {
        this.item_note = item_note;
    }
}
