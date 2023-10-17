package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the story file: ");
        String fileName = scanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner filescanner = new Scanner(fis);
            int lineNum = 1;
            while (filescanner.hasNextLine()) {
                String line = filescanner.nextLine();
                System.out.printf("%d. %s%n", lineNum, line);
                lineNum++;
            }
            filescanner.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found: " + fileName);
        }
    }
}
