package com.pluralsight;

import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        logAction("launch");
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter a search term (X to exit):");
            String searchTerm = scanner.nextLine();

            if ("X".equalsIgnoreCase(searchTerm)){
                logAction("exit");
            }
        }
    }
}
