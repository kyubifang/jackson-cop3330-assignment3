/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment3.ex45;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
Exercise 45 - Word Finder

There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize. Replace each occurrence with use. Write the modified file to a new file.
Example Output

Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".

The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints

    Prompt for the name of the output file.
    Write the output to a new file.

Challenges

    Modify the program to track the number of replacements and report that to the screen when the program finishes.
    Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
    Modify the program so it can handle every file a folder of files instead of a single file.

 */
public class App {
    public static void main(String[] args) {
        //create input
        new Input();

        //grab list from Input
        Input fin = new Input();

        //output list
        generateOutput(fin);
    }

    public static void generateOutput(Input fin) {
        //try catch
        try{
            //create output file
            FileWriter fw = new FileWriter("output/exercise45_output.txt");
            Writer output = new BufferedWriter(fw);
            //convert sorted list size to int
            int ls = fin.fInputs.size();
            //for i < list size
            for(int i = 0; i < ls; i++) {
                //  output list
                output.write(fin.fInputs.get(i).toString() + "\n");
            }
            //close file, ending the program
            output.close();
        //catch IO Ex
        }catch(IOException e){
            System.out.println("Couldn't write file.");
            e.printStackTrace();
        }
    }
}
