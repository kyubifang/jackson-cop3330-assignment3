package oop.assignment3.ex44;

import java.io.IOException;
import java.util.Scanner;

public class Input {
    public Input() {
        //Scanner
        Products prod = new Products();
        Scanner in = new Scanner(System.in);
        //try catch
        try{
            //Read user input

            while(true){
                System.out.println("What is the product name? ");
                in.next();

                //if input equals JSON products
            }
            //list price & quantity
            //else
            System.out.println();
            //prompt user again

        //catch IO ex
        }catch(IOException ex){
            ex.printStackTrace();
        }


    }
}
