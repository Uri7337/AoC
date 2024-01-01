

package uri.tech.aoc_2015;

import Shared.CreateFolders;
import java.util.Scanner;

public class AoC_2015 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       
       CreateFolders cf = new CreateFolders();
        
       System.out.println("Enter the number of day: ");
       int dayNum = sc.nextInt();
         
       
       
       String[] menuOptions = {
            "Create Whole Day in Project",
            "Get Puzzle Input",
            "Open Web",
            "Enter Different Day",
            "Exit"
        };

        int choice;

        do {
            displayMenu(menuOptions, dayNum);

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character after reading integer input

            
                System.out.println("You selected " + menuOptions[choice - 1]);
                switch (choice) {
                case 1:
                    cf.CreateFolder(dayNum);
                    break;
                case 2:
                    
                    
                    break;
                case 3:
                    
                    
                    break;
                case 4:
                    System.out.println("Change day");
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
                    break;
            }
           
        } while (choice != menuOptions.length);

        System.out.println("Exiting the program...");
        sc.close();
    }

    private static void displayMenu(String[] options, int dayNum) {
        System.out.println("Day_"+dayNum);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}

