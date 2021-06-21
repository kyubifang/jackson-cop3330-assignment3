package oop.assignment3.ex44;

import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.Scanner;

public class Products {
    public Products(){
        //scanner
        Scanner in = new Scanner(System.in);
        //create JSONObject
        JsonObject obj = null;
        assert false;
        //Pull values from JSON
        String name = obj.get("name").getAsString();
        double price = obj.get("price").getAsDouble();
        int quantity = obj.get("quantity").getAsInt();
        //while hasNextLine
        while(in.hasNextLine()){
            // set name, price, quantity from in
            name += in.next();
            price += in.nextDouble();
            quantity = in.nextInt();
            //add to object list
        }
        //close
        in.close();
    }
}
