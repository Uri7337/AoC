
package shared;

import java.io.File;  

public class CreateFolders {
    public void CreateFolder(int dayNum){
       
        File f1 = new File("src/main/java/Day_"+dayNum);
        
        boolean isCreated = f1.mkdir();
        
        System.out.println(isCreated ? "Folder Day_" + dayNum + " is created successfully" : "Error, Folder Day_" + dayNum + " Found!");
        
        if(isCreated){
            CreateDay cd = new CreateDay();
            cd.createWholeDay(dayNum);
        }
    }
    public void CreateAllFolders(){
        boolean isCreated = false;
        for (int i = 1; i < 26; i++) {
            isCreated = false;
            File f1 = new File("src/main/java/Day_"+i);
            
            isCreated = f1.mkdir();
            
            System.out.println(isCreated ? "Folder Day_" + i + " is created successfully" : "Error, Folder Day_" + i + " Found!");
            
            if(isCreated){
                CreateDay cd = new CreateDay();
                cd.createWholeDay(i);
            }
        }
    }
}
