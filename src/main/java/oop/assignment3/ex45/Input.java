package oop.assignment3.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    //create list
    List<String> fInputs = new ArrayList<>();
    public Input(){
        //Read file
        File read = new File("input/exercise45_input.txt");
        //try catch
        try{
            //Scanner
            Scanner in = new Scanner(read);
            //while read has next line
            while(in.hasNextLine()){
                //Scan String "utilize"
                // if "utilize" found
                //replaceAll("utilize", "use")
                fInputs.add(in.nextLine().replaceAll("utilize", "use"));
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }



    }
}
