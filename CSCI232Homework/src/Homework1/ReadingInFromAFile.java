package Homework1;
/**
 * Bowen Kruse
 * 5/13/2019
 * Homework 1
 * Program that reads in file TaleOfTwoCities.txt using its relative path and writes the contents on separate lines.
 * TaleOfTwoCities.txt contains a piece of literature from Charles Dickens that unlike the real novel, is quite brief.
 */
import java.util.Scanner;
import java.io.*;

public class ReadingInFromAFile {

    public static void main(String args[]) throws IOException {

        //relative file path relies that TaleOfTwoCities.txt is in the same package as the class itself
        Scanner sc = new Scanner(new File("src/Homework1/TaleOfTwoCities.txt"));


        while (sc.hasNext()) {
            String output = sc.next();
            //prints each word on a separate line
            System.out.println(output);
        }
    }
}
