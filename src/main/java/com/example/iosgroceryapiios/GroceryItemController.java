package com.example.iosgroceryapiios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;



@RestController
public class GroceryItemController {

    //http://localhost:8080/groceryitems
    //https://iosgroceryapi.azurewebsites.net/groceryitems
    @GetMapping("/groceryitems")
    public OuterClass GetItems()   {
        List<GroceryItem> AllGroceryItems = new ArrayList<>();
        AddAllItems(AllGroceryItems);
        Result results=new Result("groceryitems",AllGroceryItems);
        return new OuterClass("OK", AllGroceryItems.size(), "Grocery Inventory for ios app",results,"Greg Garman");

    }

    private void AddAllItems(List<GroceryItem> AllGroceryItems)   {     //file io would not work when deployed to azure...so here's a lot of adding items

        AllGroceryItems.add(new GroceryItem("Gatorade","https://cutpcdnwimages.azureedge.net/images/products/10000/012188-600x600-A.jpg","Orange"));
        AllGroceryItems.add(new GroceryItem("Soup","https://cutpcdnwimages.azureedge.net/images/products/875000/878606-600x600-A.jpg","Chicken and Sausage Gumbo"));
        AllGroceryItems.add(new GroceryItem("Gatorade","https://cutpcdnwimages.azureedge.net/images/products/10000/012057-600x600-A.jpg","Lemon Lime"));
        AllGroceryItems.add(new GroceryItem("Soup","https://cutpcdnwimages.azureedge.net/images/products/230000/234797-600x600-A.jpg","Chili Mac"));
        AllGroceryItems.add(new GroceryItem("Hummus","https://cutpcdnwimages.azureedge.net/images/products/885000/885831-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Honey Nut Cheerios","https://cutpcdnwimages.azureedge.net/images/products/5000/008647-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Gatorade","https://cutpcdnwimages.azureedge.net/images/products/10000/012632-600x600-A.jpg","Frost-Glacier Freeze"));
        AllGroceryItems.add(new GroceryItem("Pomegranate Juice","https://cutpcdnwimages.azureedge.net/images/products/20000/023033-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Avocados","https://cutpcdnwimages.azureedge.net/images/products/255000/255234-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Cherry Juice","https://cutpcdnwimages.azureedge.net/images/products/310000/312027-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Kale","https://cutpcdnwimages.azureedge.net/images/products/245000/247461-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Green Tea","https://cutpcdnwimages.azureedge.net/images/products/370000/370995-600x600-A.jpg"," "));


    }

}

