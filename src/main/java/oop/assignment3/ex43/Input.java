package oop.assignment3.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    //create methods
    public Input(){
        //create scanner
        Scanner in = new Scanner(System.in);
        //scan site name
        System.out.println("Site name: ");
        String name = in.nextLine();
        //scan site author
        System.out.println("Author: ");
        String author = in.nextLine();
        //prompt for javascript folder
        System.out.println("Do you want a folder for JavaScript? ");
        //make placeholder for boolean switch
        boolean JS = switch (in.nextLine()) {
            case "Y", "y" -> true;
            default -> false;
        };
        //prompt for css folder
        System.out.println("Do you want a folder for CSS? ");
        //make placeholder for boolean switch
        boolean CSS = switch (in.nextLine()) {
            case "Y", "y" -> true;
            default -> false;
        };
        //createHTML using given values
        createHTML(name, author, JS, CSS);
    }

    public static void createHTML(String name, String author, boolean JS, boolean CSS){
        //create html structure
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <title>" + name + "</title>\n" +
                "  <meta>" + author + "</meta>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";
        //create new file
        File site = new File("src/main/java/oop/assignment3/ex43/index.html");
        //try catch
        try{
            //write out html buffer
            BufferedWriter bw = new BufferedWriter(new FileWriter(site));
            bw.write(html);
            bw.close();
            //sout successful creation
            System.out.println("Created ./website/" + name + "\n" +
                    "Created ./website/"+ name + "/index.html");
            //if js == true
            if(JS){
                //create js folder
                site = new File("src/main/java/oop/assignment3/ex43/js");
                site.mkdir();
                //sout js folder creation
                System.out.println("Created ./website/" + name + "/js/");
            //if css == true
            }if(CSS){
                //create css folder
                site = new File("src/main/java/oop/assignment3/ex43/css");
                site.mkdir();
                //sout cs folder creation
                System.out.println("Created ./website/" + name + "/css/");
            }
        //catch ioEx
        }catch(IOException e){
            System.out.println("Couldn't create html.");
            e.printStackTrace();
        }
    }
}
