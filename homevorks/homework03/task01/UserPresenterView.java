package homevorks.homework03.task01;
import java.util.Scanner; 
class UserPresenterView {

  public void printResult(String result) {
    System.out.println(" \n Данные пользователя: " + "\n" + result);
    }

  public static String getUserInput(){
    Scanner scanner = new Scanner(System.in, "Cp866");
    String result = scanner.nextLine();
    return result; 
    }
}

