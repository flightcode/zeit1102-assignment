
/**
 * @Elliot Parker
 * @2020-07-30
 */

import java.util.*;
import java.text.NumberFormat;

public class Flights {
    private Flight Flight = new Flight();
    private Files Files = new Files();

    private Scanner scan = new Scanner(System.in);

    private static ArrayList<Flight> flights = new ArrayList<Flight>();

    public void Init() {
        try {
            flights = Files.Read("flights.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void View() {
        System.out.println("Viewing Flights");
        System.out.println("---");
        NumberFormat numberFormat = NumberFormat.getInstance();
        for (int i = 0; i < flights.size(); i++) {
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

    public void Add() {
        System.out.print("            Departure: ");
        String dep = scan.nextLine();
        System.out.print("              Arrival: ");
        String arr = scan.nextLine();
        System.out.print("              Airline: ");
        String airline = scan.nextLine();
        System.out.print("        Flight Number: ");
        String fltNum = scan.nextLine();
        System.out.print("        Aircraft Type: ");
        String acftType = scan.nextLine();
        System.out.print("Aircraft Registration: ");
        String acftReg = scan.nextLine();
        Flight newFlt = new Flight(dep, arr, airline, fltNum, acftType, acftReg);
        flights.add(newFlt);
        try {
            Files.Write(flights, "flights.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("---");
        System.out.println("Added Flight");
        System.out.println("---");
    }

    public void Delete() {
        System.out.print("Input ID to Delete: ");
        int id = scan.nextInt();
        flights.remove(id);
        System.out.println("Deleted Flight");
        System.out.println("---");
    }
}