package homevorks.homework03.task01;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserInput {
   
    public static String getUserInput(){
        try(Scanner scanner = new Scanner(System.in, "Cp866");) {
            String result = scanner.nextLine();
            return result;
        }    
    }

     public String isFirstLastName(String str) {
        Pattern pattern = Pattern.compile("\\s*(\\D+\\s\\D+\\s\\D+)\\s" + //
        "([01-31]{2}+\\.[01-12]{2}+\\.[1901-2022]{4}+)\\s((\\+*)\\d{2}+)\\s([f,m]{1}+)\\s*");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()){
            String dataUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + dataUser);    
            } 
        else{
            System.out.println("Введенная строка " + str + " не совпадает с параметрами: ");   
        }
        return str;       
    }  

       public Boolean isFirstLastName2(String str) {
        String pattern = str;
        Boolean matcher = pattern.matches("\\s*(\\D+\\s\\D+\\s\\D+)\\s" + //
        "([01-31]{2}+\\.[01-12]{2}+\\.[1901-2022]{4}+)\\s((\\+*)\\d{2}+)\\s([f,m]{1}+)\\s*");
        if (matcher){
            System.out.println("Отлично!!! Введенная строка: " + matcher);    
            } 
        else{
            System.out.println("Введенная строка " + str + " не совпадает с параметрами: ");   
        }
        return matcher;       
    }  








}
