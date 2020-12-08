package com.company;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("data/input1.txt")));

            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.size(); j++) {
                    if (Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(j)) == 2020) {
                        System.out.println("Match for part 1 value 2020");
                        System.out.println(lines.get(i));
                        System.out.println(lines.get(j));
                        System.out.println(Integer.parseInt(lines.get(i)) * Integer.parseInt(lines.get(j)));
                    }
                        for (int k = 0; k < lines.size(); k++) {
                            if (Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(j)) +
                                    Integer.parseInt(lines.get(k)) == 2020) {
                                    System.out.println("Match for part 2 value 2020");
                                    System.out.println(lines.get(i));
                                    System.out.println(lines.get(j));
                                    System.out.println(lines.get(k));
                                    System.out.println(Integer.parseInt(lines.get(i)) * Integer.parseInt(lines.get(j)) * Integer.parseInt(lines.get(k)));

                           }
                        }
                    }
                }
            }
        catch (IOException e) {
            System.out.println("file open error");
            // Handle a potential exception
       }
    }
}
