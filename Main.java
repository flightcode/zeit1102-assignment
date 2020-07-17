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
    
    void Output(String output)
    {
        System.out.println(output);
    }
    
    void Init()
    {
        //Any reading/etc
    }
    
    void Menu() 
    {
        Output("Select Option:");
        Output("1. View Flights");
        Output("2. Add Flight");
        Output("3. Delete Flight");
        Output("4. Quit");
        Output("---");
        String menuOption = scan.nextLine();
        Output("---");
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