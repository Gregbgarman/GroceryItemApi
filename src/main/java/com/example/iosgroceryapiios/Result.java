package com.example.iosgroceryapiios;

import java.util.List;



public class Result {

        private String list_name;
        private List<GroceryItem> groceryItems;

        public Result(String list_name, List<GroceryItem> groceryItems) {
            this.list_name = list_name;
            this.groceryItems = groceryItems;
        }

        public String getList_name() {
            return list_name;
        }

        public void setList_name(String list_name) {
            this.list_name = list_name;
        }

        public List<GroceryItem> getGroceryItems() {
            return groceryItems;
        }

        public void setGroceryItems(List<GroceryItem> groceryItems) {
            this.groceryItems = groceryItems;
        }


    }
