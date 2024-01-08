

package uri.tech.aoc_2015;

import Shared.CreateFolders;
import Shared.AoCWeb;
import java.io.IOException;
import java.util.Scanner;

public class AoC_2015 {

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in); 
       
       CreateFolders cf = new CreateFolders();
       AoCWeb aoc = new AoCWeb();
        
       System.out.println("Enter the number of day: ");
       int dayNum = sc.nextInt();
       String year = "2015";
       boolean diffDay = false;
       
       String[] menuOptions = {
            "Open Day",
            "Open Test Puzzle Input",
            "Open Puzzle Input",
            "Create Whole Day in Project",
            "Enter Different Day",
            "Exit"
        };

        int choice;

        do {
            if(diffDay){
                System.out.println("Enter the number of day: ");
                dayNum = sc.nextInt();
                diffDay=false;
            }
            displayMenu(menuOptions, dayNum);

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character after reading integer input

            
                System.out.println("You selected " + menuOptions[choice - 1]);
                switch (choice) {
                case 1:
                    aoc.openWeb(year, String.valueOf(dayNum), false);
                    break;
                case 2:
                    aoc.openInputFile(year, String.valueOf(dayNum), true);
                    break;
                case 3:
                    aoc.openWeb(year, String.valueOf(dayNum), true);
                    aoc.openInputFile(year, String.valueOf(dayNum), false);
                    break;
                case 4:
                    cf.CreateFolder(dayNum);
                    break;
                case 5:
                    diffDay=true;
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-6).");
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

