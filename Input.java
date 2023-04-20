package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws FileNotFoundException {
        String filename;
        if (args.length > 0) {
            filename = args[0];
        } else {
            filename = "SampleInput1_2022.csv";
        }
        
        File inputFile = new File(filename);
        Scanner scanner = new Scanner(inputFile);
        
        // Read input file and process data
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // Process data
        }
        
        scanner.close();
        
        // Write output file
        File outputFile = new File("SampleOutput1_2022.txt");
        // Write data to output file
    }
}



