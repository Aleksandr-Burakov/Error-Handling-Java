// Реализуйте метод, который запрашивает у пользователя 
// ввод дробного числа (типа float), и возвращает введенное значение.
//  Ввод текста вместо числа не должно приводить к падению приложения,
//  вместо этого, необходимо повторно запросить у пользователя ввод данных.


package homevorks.homework02.task01;
import java.util.Locale;
import java.util.Scanner;

public class InputPrint {
    
    public static void printUser(String Message) {
        System.out.println("Вы ввели требуемое значение - " + Message);
    }

    public static void printError(String errorMessage) {
        System.err.println("Error: " + errorMessage);
    }

    public static Float inputUser(){
        float number;
        System.out.println("Введите дробное число разделенное '.' (точкой): ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        try {
            number = scanner.nextFloat();    
        } catch (Exception e) {
            printError("Введено некоректное значение: "); 
            number = inputUser();  
        } 
        scanner.close();
        return number;  
    }
  
    public static void main(String[] args){
        Float meaning = inputUser();
        printUser("Число: " + meaning);
    }
}
