package com.example.iosgroceryapiios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



@RestController
public class GroceryItemController {

    //http://localhost:8080/allitems
    @GetMapping("/groceryitems")
    public OuterClass GetItems()  {

        List<GroceryItem> AllGroceryItems = new ArrayList<>();
        AddAllItems(AllGroceryItems);
        Result results=new Result("groceryitems",AllGroceryItems);
        return new OuterClass("OK", AllGroceryItems.size(), "Grocery Inventory for ios app",results,"Greg Garman");
    }

    private void AddAllItems(List<GroceryItem> AllGroceryItems)  {
          AllGroceryItems.add(new GroceryItem("Gatorade","https://cutpcdnwimages.azureedge.net/images/products/10000/012188-600x600-A.jpg","Orange"));
           AllGroceryItems.add(new GroceryItem("Gatorade","https://cutpcdnwimages.azureedge.net/images/products/10000/012057-600x600-A.jpg","Lemon Lime"));

    }

}

