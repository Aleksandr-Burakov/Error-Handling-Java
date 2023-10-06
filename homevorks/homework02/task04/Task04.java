package homevorks.homework02.task04;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task04 {

    static Scanner scanner = new Scanner(System.in);
    static String input;

    public static void printError(String errorMessage) {
        System.out.println("Упс..! " + errorMessage);
    }

    public static void printUser(String Message) {
        System.out.println("Отлично!!! " + Message);
    }

    public static String inputNullUser() throws Exception {
        System.out.println("Введите строку: ");
        input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            throw new Exception("Строка пустая!!! ");    
        }    
        return input;      
        }   

    public static void main (String[] args){ 
        try {
        printUser("Вы ввели строку: " + inputNullUser());
        }
        catch (Exception e) {
            printError("Не повезло :( . ");
            System.out.println(e.getMessage());
        }  
        finally {
        scanner.close();
        }    
    }
}
