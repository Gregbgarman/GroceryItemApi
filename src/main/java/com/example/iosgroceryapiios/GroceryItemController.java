package com.example.iosgroceryapiios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



@RestController
public class GroceryItemController {

    //http://localhost:8080/groceryitems
    @GetMapping("/groceryitems")
    public OuterClass GetItems() throws IOException  {
        List<GroceryItem> AllGroceryItems = new ArrayList<>();
        AddAllItems(AllGroceryItems);
        Result results=new Result("groceryitems",AllGroceryItems);
        return new OuterClass("OK", AllGroceryItems.size(), "Grocery Inventory for ios app",results,"Greg Garman");

    }

    private void AddAllItems(List<GroceryItem> AllGroceryItems) throws IOException  {

        Reader in = new BufferedReader(new FileReader("src/main/java/com/example/iosgroceryapiios/GroceryDetails.txt"));
        int inread;
        String str = "";
        int counter=1;
        StringBuilder ItemName=new StringBuilder();
        StringBuilder Itemurl=new StringBuilder();
        String Desc=new String();

        while ((inread=in.read()) !=-1){
            if ( (char)inread=='\n'){

                if (counter==1){
                    ItemName.append(str);
                    counter++;
                }

                else if (counter==2){
                    Itemurl.append(str);
                    counter++;
                }

                else if (counter==3){
                    AllGroceryItems.add(new GroceryItem(ItemName.toString(),Itemurl.toString(),str));
                    ItemName.setLength(0);
                    Itemurl.setLength(0);
                    counter=1;
                }
                str="";

            }
            else{
                str+=(char)inread;
            }

        }

    }

}

