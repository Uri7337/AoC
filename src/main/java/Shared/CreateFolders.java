
package Shared;

import java.util.Scanner;  
import java.io.File;  

public class CreateFolders {
    public void CreateFolder(){
        Scanner sc = new Scanner(System.in);  
    
        System.out.println("Enter the number of day: ");  
        int dayNum = sc.nextInt();
       
        File f1 = new File("src/main/java/Day_"+dayNum);
        
        System.out.println(f1.mkdir() ? "Folder is created successfully" : "Error, Folder Found!");
    }
    public void CreateAllFolders(){
        
    }
}
