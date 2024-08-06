package shared;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class AoCWeb {

    public void openWeb(String year, String day, Boolean puzzleInput) throws IOException {
        if (puzzleInput) {
            String[] cmdarray = {"xdg-open " + "https://adventofcode.com/" + year + "/day/" + day + "/input"};
            execute(cmdarray);

        } else {
            String[] cmdarray = {"xdg-open " + "https://adventofcode.com/" + year + "/day/" + day};
            execute(cmdarray);
        }
    }

    public void openInputFile(String year, String day, Boolean test) throws IOException {

        if (test) {
            String[] cmdarray = {"/usr/bin/flatpak run --branch=stable --arch=x86_64 --command=netbeans-desktop org.apache.netbeans "+
                "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_"+day+"_test_"+year+".txt"
                };
            
            File testFile = new File("/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_"+day+"_test_"+year+".txt");
            testFile.createNewFile();
            FileOutputStream oFile = new FileOutputStream(testFile, false); 
            
            execute(cmdarray);
        } else {
            String[] cmdarray = {"/usr/bin/flatpak run --branch=stable --arch=x86_64 --command=netbeans-desktop org.apache.netbeans "+
                "/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_"+day+"_"+year+".txt"
            };
            
            File file = new File("/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_"+day+"_"+year+".txt");
            file.createNewFile();
            FileOutputStream oFile = new FileOutputStream(file, false); 
            
            execute(cmdarray);
        }   
    }

    public void execute(String[] commandarray) throws IOException {
        System.out.println(commandarray[0]);
        Runtime.getRuntime().exec(commandarray[0]);
    }
}



