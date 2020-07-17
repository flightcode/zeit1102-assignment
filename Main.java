/**
 * @Elliot Parker
 * @2020-07-16
 */

import java.util.Scanner;

public class Main
{
    Flights flts = new Flights();
    
    Scanner scan = new Scanner(System.in);
    
    public void Main()
    {
        Init();
        Menu();
    }
    
    void Init()
    {
        //Any reading/etc
    }
    
    void Menu() 
    {
        System.out.println("Select Option:");
        System.out.println("1. View Flights");
        System.out.println("2. Add Flight");
        System.out.println("3. Delete Flight");
        System.out.println("4. Quit");
        System.out.println("---");
        String menuOption = scan.nextLine();
        System.out.println("---");

        switch(Integer.parseInt("0" + menuOption))
        {
            case 1:
                flts.View();
                Menu();
                break;
            case 2:
                flts.Add();
                Menu();
                break;
            case 3:
                flts.Delete();
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