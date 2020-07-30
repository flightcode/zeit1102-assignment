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
            Flight newFlt = new Flight(scan.nextLine().split(", ")); // Split line by "," and generate flight
            arr.add(newFlt); // Add flight to array
        }
        scan.close();
        return arr; // Return Array List
    }

    public void Write(ArrayList<Flight> flights, String outputFile) throws Exception {
        File file = new File(outputFile); // Declare save file
        file.createNewFile(); // Try creating file to write to

        BufferedWriter output = new BufferedWriter(new FileWriter(outputFile)); // Declare file writer
        for (int i = 0; i < flights.size(); i++) { // Iterate through all flights in array
            output.write(Flight.toString(flights.get(i))); // Write flight to file, delimited by ", "
            output.newLine(); // Go to next line
        }
        output.close();
    }
}