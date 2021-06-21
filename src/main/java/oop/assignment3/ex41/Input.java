package oop.assignment3.ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    //create list for inputs
    List<String> fInputs = new ArrayList<>();

    public Input() {
        //read file
        File file = new File("input/exercise41_input.txt");
        //try catch
        try{
            //read input from file
            Scanner in = new Scanner(file);
            // while file has next line
            while(in.hasNextLine()){
                //  add line to list
                fInputs.add(in.nextLine());
            }
        //catch noFileEx
        }catch(FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
