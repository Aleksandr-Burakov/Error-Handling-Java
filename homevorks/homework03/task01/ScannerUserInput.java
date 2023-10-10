package homevorks.homework03.task01;


import java.util.Scanner;

class ScannerUserInput {
   

    public String getUserInput(){
        try(Scanner scanner = new Scanner(System.in, "Cp866");) {
            String result = scanner.nextLine();
            return result;
        }    
    }
}
