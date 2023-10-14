package homevorks.homework03.task01;

import java.io.FileNotFoundException;
import java.util.Scanner;


    
class UserPresenterView {
      // public void extends FileNotFoundException {
      // UserPresenterView() {
      //   super("Файл не найден ");
      // }
    
      // UserPresenterView(String path) {
      //   super("Файл не найден по пути " + path);
      // }


      public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }

      public void printResult(String result) {
        System.out.println(" \n Данные пользователя: " + "\n" + result);
    }

      public static String getUserInput(){
        // System.out.println("Введите в одну строку, всё через пробел: \n        " + // 
        //               "Фамилию Имя Отчество \n\n" + // 
        //               "Дату рождения: \n        dd.mm.yyyy \n\n" + //
        //               "Номер телефона: \n        +2 цифры \n\n" + //
        //               "Пол - символ латиницей: \n        f или m \n");
      Scanner scanner = new Scanner(System.in, "Cp866");
            String result = scanner.nextLine();
            return result; 
    }


}
