/**
 * @Elliot Parker
 * @2020-07-16
 */

import java.util.Scanner;

public class Flights
{
    Scanner scanner = new Scanner(System.in);
    
    public void Init()
    {
        System.out.println("Select Option:");
        System.out.println("1. View Flights");
        System.out.println("2. Add Flight");
        System.out.println("3. Delete Flight");
        System.out.println("---");
        String initOption = scanner.nextLine();
        System.out.println("---");
        
        switch(Integer.parseInt(initOption))
        {
            case 1:
                View();
                break;
            case 2:
                Add();
                break;
            case 3:
                Delete();
                break;
            default:
                Init();
                break;
        }
    }
    
    void View()
    {
        System.out.println("Viewing Flights");
    }
    
    void Add()
    {
        System.out.println("Adding (Not Complete) Flight");
    }
    
    void Delete()
    {
        System.out.println("Deleting (Not Complete) Flight");
    }
}