package oop.assignment3.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    //create list for inputs
    List<String> fInputs = new ArrayList<>();

    public Input(){
        //input file
        File file = new File("input/exercise42_input.txt");
        //try catch
        try{
            //scan inputs from file
            Scanner in = new Scanner(file);
            //while file has next
            while(in.hasNextLine()){
                //  input each line, removing commas
                fInputs.add(in.nextLine().replaceAll(",", " "));
            }
        }catch(FileNotFoundException e){
            //fileNotFoundEx
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
