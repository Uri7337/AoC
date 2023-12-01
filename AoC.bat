REM bat file for creating AoC project structure.
REM Insert bat file at the very top of the project directory and let the magic happend.
 
@echo off
for /l %%i in (1, 1, 25) do (
    md "Day_%%i"
)

@echo off
pushd "%~dp0"
for /d %%a in (*Day_*) do (
    cd "%%a"
	
	echo //> %%~nxa.java
	echo package %%a;>> %%~nxa.java
	echo //>> %%~nxa.java
	echo public class %%a {>> %%~nxa.java
	echo     public static void main ^(String[] args^) {>> %%~nxa.java
	echo         Solution_1_%%a s1 = new Solution_1_%%a^(^);>> %%~nxa.java
	echo         Solution_2_%%a s2 = new Solution_2_%%a^(^);>> %%~nxa.java
	echo //>> %%~nxa.java
	echo		 System.out.println^("%%a_Solution1:" + s1.getSolution^(^)^);>> %%~nxa.java
	echo		 System.out.println^("%%a_Solution2:" + s2.getSolution^(^)^);>> %%~nxa.java
	echo     }>> %%~nxa.java
	echo }>> %%~nxa.java
	
	echo package %%a;> Solution_1_%%~nxa.java
	echo //>> Solution_1_%%~nxa.java
	echo import Shared.ReadFile;>> Solution_1_%%~nxa.java
	echo //>> Solution_1_%%~nxa.java
	echo public class Solution_1_%%a {>> Solution_1_%%~nxa.java
	echo     int solution = 0;>> Solution_1_%%~nxa.java
	echo //>> Solution_1_%%~nxa.java
	echo      public int getSolution^(^) {>> Solution_1_%%~nxa.java
	echo        ReadFile rf = new ReadFile^(^);>> Solution_1_%%~nxa.java
	echo        String file = "";>> Solution_1_%%~nxa.java
	echo        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";>> Solution_1_%%~nxa.java
	echo        file = rf.getInput^(filepath^);>> Solution_1_%%~nxa.java       
	echo        return solution;>> Solution_1_%%~nxa.java
	echo     }>> Solution_1_%%~nxa.java
	echo }>> Solution_1_%%~nxa.java
	
	echo package %%a;> Solution_2_%%~nxa.java
	echo //>> Solution_2_%%~nxa.java
	echo import Shared.ReadFile;>> Solution_2_%%~nxa.java
	echo //>> Solution_2_%%~nxa.java
	echo public class Solution_2_%%a {>> Solution_2_%%~nxa.java
	echo     int solution = 0;>> Solution_2_%%~nxa.java
	echo //>> Solution_2_%%~nxa.java
	echo      public int getSolution^(^) {>> Solution_2_%%~nxa.java
	echo        ReadFile rf = new ReadFile^(^);>> Solution_2_%%~nxa.java
	echo        String file = "";>> Solution_2_%%~nxa.java
	echo        String filepath = "/home/deadpool7337/UriPrograms/Other/PuzzleInput.txt";>> Solution_2_%%~nxa.java
	echo        file = rf.getInput^(filepath^);>> Solution_2_%%~nxa.java       
	echo        return solution;>> Solution_2_%%~nxa.java
	echo     }>> Solution_2_%%~nxa.java
	echo }>> Solution_2_%%~nxa.java
	
    cd ..
popd
)
