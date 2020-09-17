
/**
 * @Elliot Parker
 * @2020-07-30
 */

import java.util.*;
import java.text.NumberFormat;

public class Flights { // Holds all functions for the flights system (This was created separate with
                       // the intent for futureproofing the system, if other features were added)
    private Flight Flight = new Flight();
    private Files Files = new Files();

    private Scanner scan = new Scanner(System.in);

    private static ArrayList<Flight> flights = new ArrayList<Flight>();

    public void Init() { // Reads save file to array.
        try {
            flights = Files.Read("flights.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void View() { // Iterate through all flights in array and display on screen.
        System.out.println("Viewing Flights");
        System.out.println("---");
        NumberFormat numberFormat = NumberFormat.getInstance();
        for (int i = 0; i < flights.size(); i++) { // Iterate through all in array and display data.
            System.out.println("                   ID: " + numberFormat.format(i));
            System.out.println("            Departure: " + flights.get(i).getDep());
            System.out.println("              Arrival: " + flights.get(i).getArr());
            System.out.println("              Airline: " + flights.get(i).getAirline());
            System.out.println("        Flight Number: " + flights.get(i).getFltNum());
            System.out.println("        Aircraft Type: " + flights.get(i).getAcftType());
            System.out.println("Aircraft Registration: " + flights.get(i).getAcftReg());
            System.out.println("---");
        }
    }

    public void Add() throws Exception { // Prompts user for input and adds flight based on input.
        System.out.print("            Departure: "); // Get user inputs
        String dep = scan.nextLine();
        if (dep.length() != 4) { // Check ICAO code validity
            throw new Exception("Enter valid 4 character ICAO code");
        }
        System.out.print("              Arrival: ");
        String arr = scan.nextLine();
        if (arr.length() != 4) { // Check ICAO code validity
            throw new Exception("Enter valid 4 character ICAO code");
        }
        System.out.print("              Airline: ");
        String airline = scan.nextLine();
        System.out.print("        Flight Number: ");
        String fltNum = scan.nextLine();
        System.out.print("        Aircraft Type: ");
        String acftType = scan.nextLine();
        System.out.print("Aircraft Registration: ");
        String acftReg = scan.nextLine();
        Flight newFlt = new Flight(dep, arr, airline, fltNum, acftType, acftReg); // Create flight based on inputs
        flights.add(newFlt);
        try { // Write new flight to file
            Files.Write(flights, "flights.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---");
        System.out.println("Added Flight");
        System.out.println("---");
    }

    public void Delete() { // Delete flight by ID.
        System.out.print("Input ID to Delete: ");
        int id = scan.nextInt();
        flights.remove(id);
        System.out.println("Deleted Flight");
        System.out.println("---");
    }
}