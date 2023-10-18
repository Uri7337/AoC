@echo off
for /l %%i in (1, 1, 25) do (
    md "Day_%%i"
)

@echo off
pushd "%~dp0"
for /d %%a in (*Day_*) do (
    cd "%%a"
	echo public class %%a {> %%~nxa.java
	echo     public static void main ^(String[] args^) {>> %%~nxa.java
	echo         System.out.println^("hey %%a!"^);>> %%~nxa.java
	echo     }>> %%~nxa.java
	echo }>> %%~nxa.java
    cd ..
popd
)
