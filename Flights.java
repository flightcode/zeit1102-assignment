import java.util.*;

public class Flights {
    Flight Flight = new Flight();

    Scanner scan = new Scanner(System.in);

    ArrayList<Flight> flights = new ArrayList<Flight>();

    public void View() {
        System.out.println("Viewing (Not Complete) Flights");
        System.out.println("---");
    }

    public void Add() {
        Flight newFlt = new Flight();
        System.out.print("Departure: ");
        newFlt.dep = scan.nextLine();
        System.out.print("Arrival: ");
        newFlt.arr = scan.nextLine();
        System.out.print("Airline: ");
        newFlt.airline = scan.nextLine();
        System.out.print("Flight Number: ");
        newFlt.fltNum = scan.nextLine();
        System.out.print("Aircraft Type: ");
        newFlt.acftType = scan.nextLine();
        System.out.print("Aircraft Registration: ");
        newFlt.acftReg = scan.nextLine();
        flights.add(newFlt);
        System.out.println("---");
        System.out.println("Added Flight");
        System.out.println("---");
    }

    public void Delete() {
        System.out.println("Deleting (Not Complete) Flight");
        System.out.println("---");
    }
}