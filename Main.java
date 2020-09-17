
/**
 * @Elliot Parker
 * @2020-07-30
 */

import java.util.Scanner;

public class Main { // Main function, runs any init methods, and handles the menu system.
    private Flights Flights = new Flights();

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { // Run any init functions on program load.
        new Flights().Init();
        new Main().Menu();
    }

    void Menu() { // Menu system, displays options on screen and prompts user for input. Runs that
                  // specific function once option is chosen.
        System.out.println("Select Option:"); // Output options
        System.out.println("1. View Flights");
        System.out.println("2. Add Flight");
        System.out.println("3. Delete Flight");
        System.out.println("4. Quit");
        System.out.println("---");
        String menuOption = scan.nextLine(); // Prompt user for option
        System.out.println("---");
        switch (Integer.parseInt("0" + menuOption)) {
            case 1: // If chosen view option
                Flights.View();
                Menu();
                break;
            case 2: // If chosen add option
                try {
                    Flights.Add();
                } catch (Exception e) {
                    System.out.println(e);
                }
                Menu();
                break;
            case 3: // If chosen delete option
                Flights.Delete();
                Menu();
                break;
            case 4: // If chosen quit option, end loop.
                break;
            default:
                Menu();
                break;
        }
    }
}