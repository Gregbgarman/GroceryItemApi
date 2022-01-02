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
        return new OuterClass("OK", AllGroceryItems.size(), "Grocery Inventory for ios app","Greg Garman",results);

    }

    private void AddAllItems(List<GroceryItem> AllGroceryItems)   {     //file io would not work when deployed to azure...so here's a lot of adding items

        AllGroceryItems.add(new GroceryItem("Avocados","Produce","https://cutpcdnwimages.azureedge.net/images/products/255000/255234-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Bacon","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/70000/070797-600x600-A.jpg","Not already cooked"));
        AllGroceryItems.add(new GroceryItem("Bananas","Produce","https://cutpcdnwimages.azureedge.net/images/products/20000/024008-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Bread","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/785000/787075-600x600-A.jpg","Arnold Whole Wheat"));
        AllGroceryItems.add(new GroceryItem("Carrots","Produce","https://cutpcdnwimages.azureedge.net/images/products/20000/024277-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008655-600x600-A.jpg","Cheerios"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008647-600x600-A.jpg","Honey Nut Cheerios"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/10000/010082-600x600-A.jpg","Apple Jacks"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008473-600x600-A.jpg","Frosted Flakes"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008682-600x600-A.jpg","Cinnamon Toast Crunch"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008550-600x600-A.jpg","Raisin Bran"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/125000/127081-600x600-A.jpg","Shredded Wheat"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/260000/263592-600x600-A.jpg","Fiber One"));
        AllGroceryItems.add(new GroceryItem("Cereal","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/5000/008667-600x600-A.jpg","Wheaties"));
        AllGroceryItems.add(new GroceryItem("Cheese","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/70000/071028-600x600-A.jpg","Provolone"));
        AllGroceryItems.add(new GroceryItem("Cheese","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/70000/070834-600x600-A.jpg","Swiss"));
        AllGroceryItems.add(new GroceryItem("Cheese","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/190000/192796-600x600-A.jpg","Extra Sharp"));
        AllGroceryItems.add(new GroceryItem("Cherry Juice","Drinks","https://cutpcdnwimages.azureedge.net/images/products/310000/312027-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/865000/867669-600x600-A.jpg","Cheddar and Sour Cream"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/865000/867963-600x600-A.jpg","Jalapeno"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/310000/312672-600x600-A.jpg","Spicy Sweet Chili"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/865000/866663-600x600-A.jpg","Mesquite BBQ"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/455000/456772-600x600-A.jpg","Harvest Cheddar"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/455000/456774-600x600-A.jpg","Original"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/195000/198503-600x600-A.jpg","Baked-BBQ"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/250000/254245-600x600-A.jpg","Baked-Cheddar and Sour Cream"));
        AllGroceryItems.add(new GroceryItem("Chips","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/315000/316608-600x600-A.jpg","Flaming Hot"));
        AllGroceryItems.add(new GroceryItem("Cliff Bars","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/815000/818631-600x600-A.jpg","Peanut Butter"));
        AllGroceryItems.add(new GroceryItem("Cliff Bars","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/815000/818629-600x600-A.jpg","Chocolate Chip"));
        AllGroceryItems.add(new GroceryItem("Cliff Bars","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/945000/946476-600x600-A.jpg","White Chocolate Macadamia"));
        AllGroceryItems.add(new GroceryItem("Coffee Filters","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/340000/342012-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Coffee","Drinks","https://cutpcdnwimages.azureedge.net/images/products/5000/008854-600x600-A.jpg","Whole Bean "));
        AllGroceryItems.add(new GroceryItem("Coffee","Drinks","https://cutpcdnwimages.azureedge.net/images/products/180000/184254-600x600-A.jpg","Whole Bean "));
        AllGroceryItems.add(new GroceryItem("Coffee","Drinks","https://cutpcdnwimages.azureedge.net/images/products/975000/975051-600x600-A.jpg","Whole Bean "));
        AllGroceryItems.add(new GroceryItem("Cups","Non-Food","https://i5.walmartimages.com/asr/34962f31-b7bb-45ef-8688-d0bc353cf9c9_1.a85af9c9f7f546e9f4fae44db96aafc5.jpeg?odnHeight=612&odnWidth=612&odnBg=FFFFFF"," "));
        AllGroceryItems.add(new GroceryItem("Deli Meat","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/95000/099114-600x600-A.jpg","Everroast Chicken "));
        AllGroceryItems.add(new GroceryItem("Deodorant","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/180000/180598-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Dishwasher Pacs","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/150000/151054-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Dryer Sheets","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/85000/089843-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Eggs","Breakfast","https://cutpcdnwimages.azureedge.net/images/products/65000/067019-600x600-A.jpg","Eggland's Best"));
        AllGroceryItems.add(new GroceryItem("Gatorade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/10000/012188-600x600-A.jpg","Orange"));
        AllGroceryItems.add(new GroceryItem("Gatorade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/10000/012057-600x600-A.jpg","Lemon Lime"));
        AllGroceryItems.add(new GroceryItem("Gatorade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/10000/012632-600x600-A.jpg","Frost-Glacier Freeze"));
        AllGroceryItems.add(new GroceryItem("Gatorade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/20000/021941-600x600-A.jpg","Lemonade"));
        AllGroceryItems.add(new GroceryItem("Gatorade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/10000/012187-600x600-A.jpg","Fruit Punch"));
        AllGroceryItems.add(new GroceryItem("Green Tea","Drinks","https://cutpcdnwimages.azureedge.net/images/products/370000/370995-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Half and half","Drinks","https://cutpcdnwimages.azureedge.net/images/products/65000/067721-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Hummus","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/885000/885831-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Kale","Produce","https://cutpcdnwimages.azureedge.net/images/products/245000/247461-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Laundry Detergent","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/125000/128635-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Lemons","Produce","https://cutpcdnwimages.azureedge.net/images/products/20000/024076-600x600-A.jpg","Bagged Lemons"));
        AllGroceryItems.add(new GroceryItem("Lysol Wipes","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/960000/962293-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Mayonnaise","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/135000/135395-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Mouthwash","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/135000/135283-600x600-A.jpg","Act-Alcohol"));
        AllGroceryItems.add(new GroceryItem("Mouthwash","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/260000/261999-600x600-A.jpg","No Alcohol"));
        AllGroceryItems.add(new GroceryItem("Nuts","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/15000/019101-600x600-A.jpg","Mixed Nuts"));
        AllGroceryItems.add(new GroceryItem("Nuts","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/15000/018575-600x600-A.jpg","Cashews"));
        AllGroceryItems.add(new GroceryItem("Paper Towels","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/890000/893496-600x600-A.jpg","8 Pack"));
        AllGroceryItems.add(new GroceryItem("Pomegranate Juice","Drinks","https://cutpcdnwimages.azureedge.net/images/products/20000/023033-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Powerade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/305000/306745-600x600-A.jpg","Fruit Punch"));
        AllGroceryItems.add(new GroceryItem("Powerade","Drinks","https://cutpcdnwimages.azureedge.net/images/products/315000/316501-600x600-A.jpg","Blue"));
        AllGroceryItems.add(new GroceryItem("Shaving Cream","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/35000/037765-600x600-A.jpg","Gillette"));
        AllGroceryItems.add(new GroceryItem("Soda","Drinks","https://images.bonanzastatic.com/afu/images/985c/c0f3/99c6_10474300684/s-l1600.jpg","Vanilla Coke"));
        AllGroceryItems.add(new GroceryItem("Soda","Drinks","https://cutpcdnwimages.azureedge.net/images/products/330000/330057-600x600-A.jpg","Coke"));
        AllGroceryItems.add(new GroceryItem("Soup","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/875000/878606-600x600-A.jpg","Chicken and Sausage Gumbo"));
        AllGroceryItems.add(new GroceryItem("Soup","Snacks/Sides","https://cutpcdnwimages.azureedge.net/images/products/230000/234797-600x600-A.jpg","Chili Mac"));
        AllGroceryItems.add(new GroceryItem("Tissues","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/885000/886021-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Toothpaste","Non-Food","https://cutpcdnwimages.azureedge.net/images/products/45000/046869-600x600-A.jpg","Crest"));
        AllGroceryItems.add(new GroceryItem("Tortillas","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/105000/108778-600x600-A.jpg"," "));
        AllGroceryItems.add(new GroceryItem("Tuna","Sandwich","https://cutpcdnwimages.azureedge.net/images/products/5000/006485-600x600-A.jpg"," "));




    }

}

