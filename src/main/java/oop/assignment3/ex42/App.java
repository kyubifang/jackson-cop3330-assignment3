/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jamar Jackson
 */

package oop.assignment3.ex42;

import java.util.Arrays;

/*
Exercise 42 - Parsing a Data File

Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
Example Output

Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints

    Write your own code to parse the data. Don't use a CSV parser.

Challenges

    Make each column one space longer than the longest value in the column.
    Format the salary as currency with dollar signs and commas.
    Sort the results by salary from highest to lowest.
    Rework your program to use a CSV parsing library and compare the results.

 */
public class App {
    public static void main(String[] args) {
        //create input class
        new Input();

        //grab list from input
        Input fin = new Input();

        //sout list
        String output = generateOutput(fin);
        //sout output
        System.out.println(output);
    }

    public static String generateOutput(Input fin){
        //sout Table header
        System.out.printf("Last %10s %10s \n", "First", "Salary");
        System.out.println("--------------------------");
        int ls = fin.fInputs.size();
        //set output blank
        String output = "";
        //for i < list size
        for(int i = 0; i < ls; i++){
            //set output formatting
            output = output.concat(String.format("%10s\n", (fin.fInputs.get(i))));
        }
        //return output
        return output;
    }
}
