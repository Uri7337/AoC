
package Shared;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDay {
  public void createWholeDay(int dayNum) {
   
    createMainFile(dayNum);
    createSolution1(dayNum);
    createSolution2(dayNum);
    
  }
  public void createMainFile(int dayNum){
  //Day_##.java
    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/Day_"+dayNum+"/Day_"+dayNum+".java"));
            
            
            writer.write("package Day_" + dayNum + ";");
            writer.newLine();
            writer.newLine(); 
            writer.write("public class Day_" + dayNum + " {");
            writer.newLine();
            writer.write("\tpublic static void main (String[] args) {");
            writer.newLine();
            writer.write("\t\tSolution_1_Day_" + dayNum + " s1 = new Solution_1_Day_" + dayNum + "();");
            writer.newLine();
            writer.write("\t\tSolution_2_Day_" + dayNum + " s2 = new Solution_2_Day_" + dayNum + "();");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t//Change for wanted solution");
            writer.newLine();
            writer.write("\t\tboolean Solution1 = true;");
            writer.newLine();
            writer.write("\t\t//boolean Solution1 = false;");
            writer.newLine();
            writer.write("\t\tSystem.out.println(Solution1 ? \"Day_" + dayNum + "_Solution1: \" + s1.getSolution() : \"Day_" + dayNum + "_Solution2: \" + s2.getSolution());");
            writer.newLine();
            writer.write("\t}");
            writer.newLine();
            writer.write("}");

            writer.close(); 
            System.out.println("Successfully wrote to the file: Day_" + dayNum +".java");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: Day_" +dayNum +".java" + " Error: "+ e.getMessage());
            e.printStackTrace();
        }
  }
  public void createSolution1(int dayNum){
  //Solution_1_Day_##.java
    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/Day_"+dayNum+"/Solution_1_Day_"+dayNum+".java"));
            
            
            writer.write("package Day_" + dayNum + ";");
            writer.newLine(); 
            writer.newLine(); 
            writer.write("import Shared.ReadFile;");
            writer.newLine();
            writer.write("import java.util.ArrayList;");
            writer.newLine();
            writer.newLine();
            writer.write("public class Solution_1_Day_" + dayNum + " {");
            writer.newLine();
            writer.write("\tint solution = 0;");
            writer.newLine();
            writer.newLine();
            writer.write("\tpublic int getSolution() {");
            writer.newLine();
            writer.write("\t\tReadFile rf = new ReadFile();");
            writer.newLine();
            writer.write("\t\tArrayList<String> file = new ArrayList<String>();");
            writer.newLine();
            writer.write("\t\tString filepath = \"/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_" + dayNum + "_test_2019.txt\";");
            writer.newLine();
            writer.write("\t\t//String filepath = \"/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_" + dayNum + "_2019.txt\";");
            writer.newLine();
            writer.write("\t\tfile = rf.getInput(filepath);");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t//Insert Solution Here:");
            writer.newLine();
            writer.write("\t\tfor (int i = 0; i < file.size(); i++) {");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t}");
            writer.newLine();
            writer.newLine();
            writer.write("\t\treturn solution;");
            writer.newLine();
            writer.write("\t}");
            writer.newLine();
            writer.write("}");

            writer.close(); 
            System.out.println("Successfully wrote to the file: Solution_1_Day_" + dayNum +".java");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: Day_" +dayNum +".java" + " Error: "+ e.getMessage());
            e.printStackTrace();
        }
  }
  public void createSolution2(int dayNum){
  //Solution_2_Day_##.java
    try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/Day_"+dayNum+"/Solution_2_Day_"+dayNum+".java"));
            
            
            writer.write("package Day_" + dayNum + ";");
            writer.newLine(); 
            writer.newLine(); 
            writer.write("import Shared.ReadFile;");
            writer.newLine();
            writer.write("import java.util.ArrayList;");
            writer.newLine();
            writer.newLine();
            writer.write("public class Solution_2_Day_" + dayNum + " {");
            writer.newLine();
            writer.write("\tint solution = 0;");
            writer.newLine();
            writer.newLine();
            writer.write("\tpublic int getSolution() {");
            writer.newLine();
            writer.write("\t\tReadFile rf = new ReadFile();");
            writer.newLine();
            writer.write("\t\tArrayList<String> file = new ArrayList<String>();");
            writer.newLine();
            writer.write("\t\tString filepath = \"/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_" + dayNum + "_test_2019.txt\";");
            writer.newLine();
            writer.write("\t\t//String filepath = \"/home/deadpool7337/UriPrograms/Other/AoC/PuzzleInputs/Day_" + dayNum + "_2019.txt\";");
            writer.newLine();
            writer.write("\t\tfile = rf.getInput(filepath);");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t//Insert Solution Here:");
            writer.newLine();
            writer.write("\t\tfor (int i = 0; i < file.size(); i++) {");
            writer.newLine();
            writer.newLine();
            writer.write("\t\t}");
            writer.newLine();
            writer.newLine();
            writer.write("\t\treturn solution;");
            writer.newLine();
            writer.write("\t}");
            writer.newLine();
            writer.write("}");

            writer.close(); 
            System.out.println("Successfully wrote to the file: Solution_2_Day_" + dayNum +".java");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: Day_" +dayNum +".java" + " Error: "+ e.getMessage());
            e.printStackTrace();
        }
  }
}

