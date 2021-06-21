/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment3.ex41;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
Exercise 41 - Name Sorter

Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.
Example Output

Total of 7 names
-----------------
Ling, Mai
Johnson, Jim
Jones, Aaron
Jones, Chris
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint

    Don't hard-code the number of names.

Challenges

    Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
    Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.

 */
public class App {

    public static void main(String[] args) {
        //create input and sort classes
        new Input();
        new Sort();

        //grab list from sort
        Input fin = new Input();

        //output list
        generateOutput(fin);


    }

    public static void generateOutput(Input fin) {
        try{
            //create output file
            FileWriter fw = new FileWriter("output/exercise41_output.txt");
            Writer output = new BufferedWriter(fw);
            //convert sorted list size to int
            int ls = fin.fInputs.size();
            //for i < list size
            output.write("Total of " + ls + " names\n" +
                    "-----------------\n");
            for(int i = 0; i < ls; i++) {
                //  output list
                output.write(fin.fInputs.get(i).toString() + "\n");
            }
            //close file, ending the program
            output.close();
        }catch(IOException e){
            System.out.println("Couldn't write file.");
            e.printStackTrace();
        }
    }
}
