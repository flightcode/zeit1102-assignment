import java.io.*;
import java.util.*;

public class Files {
    Flight Flight = new Flight();

    public ArrayList<Flight> Read(String inputFile) throws Exception {
        ArrayList<Flight> arr = new ArrayList<Flight>();
        File input = new File(inputFile); // Declare save file
        if (!input.exists()) { // Check if file exists
            input.createNewFile(); // Create file
        }
        Scanner scan = new Scanner(input); // Scan file
        while (scan.hasNextLine()) { // Scan each line of file
            Flight newFlt = new Flight(scan.nextLine().split(","));
            arr.add(newFlt); // Add integer to array
        }
        scan.close();
        return arr; // Return Array List
    }
}