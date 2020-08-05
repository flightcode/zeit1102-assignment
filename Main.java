
/**
 * @Elliot Parker
 * @2020-07-30
 */

import java.util.Scanner;

public class Main {
    private Flights Flights = new Flights();

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        new Flights().Init();
        new Main().Menu();
    }

    void Menu() {
        System.out.println("Select Option:");
        System.out.println("1. View Flights");
        System.out.println("2. Add Flight");
        System.out.println("3. Delete Flight");
        System.out.println("4. Quit");
        System.out.println("---");
        String menuOption = scan.nextLine();
        System.out.println("---");
        switch (Integer.parseInt("0" + menuOption)) {
            case 1:
                Flights.View();
                Menu();
                break;
            case 2:
                try {
                    Flights.Add();
                } catch (Exception e) {
                    System.out.println(e);
                }
                Menu();
                break;
            case 3:
                Flights.Delete();
                Menu();
                break;
            case 4:
                break;
            default:
                Menu();
                break;
        }
    }
}