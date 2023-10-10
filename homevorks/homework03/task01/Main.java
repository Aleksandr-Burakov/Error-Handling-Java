package homevorks.homework03.task01;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {

    
 
  
    public static void main(String[] args) {
        System.out.println("Введите Ф.И.О.: ");
        ScannerUserInput scanner = new ScannerUserInput();
        String str = scanner.getUserInput();
        // System.out.println(str);
        // System.out.println(isNumber2(str));
        // System.out.println(isAlphabetEU(str));
        System.out.println(isAlphabetRU(str));
        // System.out.println(isNumberPhone(str));
        // System.out.println(isFirstLastName(str));
        // isFirstLastName(str);
    }

    public static boolean isNumber2(String str) {
        String string = "0123456789";
        for (char elem : str.toCharArray()) {
          if (!string.contains(String.valueOf(elem))) {
            return false;
          }
        }
        return true;
    }

    public static boolean isAlphabetRU(String str) {

 String input = str;
        boolean result = input.matches("[а-яА-Я](\\D*)");
        if(result){
        System.out.println("Это нужные Буквы");
        }
        else{
        System.out.println("Это не Буквы");    
        }
        return result;

        // String string = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        // // String string = str;
        // // string.matches("[а-я||А-Я]");
        // for (char elem : str.toCharArray()) {
        //   if (!string.contains(String.valueOf(elem))) {
        //     return false;
        //   }
        // }
        // return true;    
    }

    public static boolean isAlphabetEU(String str) {
        // String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        // // String string = str;
        // // string.matches("[a-z||A-Z]");
        // for (char elem : str.toCharArray()) {
        //   if (!string.contains(String.valueOf(elem))) {
        //     return false;
        //   }
        // }
        // return true;    

        String input = str;
        boolean result = input.matches("[a-zA-Z](\\D*)");
        if(result){
        System.out.println("Это нужные Буквы");
        }
        else{
        System.out.println("Это не Буквы");    
        }
        return result;
    }

    public static boolean isNumberPhone(String str){
        String input = str;
        boolean result = input.matches("(\\+*)\\d{11}");
        if(result){
        System.out.println("Это телефонный номер");
        }
        else{
        System.out.println("Это не телефонный номер");    
        }
        return result;
    }

    public static void isFirstLastName(String str) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*"); 
        String input = str;
        String[] words = pattern.split(input);
        for(String word:words){
            System.out.print(word);
        }
            
        // return input;
    }   
}