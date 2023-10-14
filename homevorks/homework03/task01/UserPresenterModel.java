package homevorks.homework03.task01;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPresenterModel {

    public String add(String num1, String num2, String num3, String num4) {
        return num1 + num2 + num3 + num4;     
    }

    public String isFirstLastName(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A[а-яА-Я]+\\s[а-яА-Я]+\\s[а-яА-Я]+\\Z");
        Matcher matcher = pattern.matcher(text);
         try {
            if (matcher.find()){
                String nameUser = matcher.group();
                System.out.println("Отлично!!! Введенная строка: " + nameUser);   
            }
        } 
         catch (Exception e) {
           printError("Фамилию Имя Отчество, повторите ввод."); 
        }       
      return text;  
    }

    public String dateBirth(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)(0?[1-9]|[1][0-9]|2[012]))\\Z");
        Matcher matcher = pattern.matcher(text);
        try {
            if (matcher.find()){
                String dataUser = matcher.group();
                System.out.println("Отлично!!! Введенная строка: " + dataUser);    
            }         
            
        } catch (Exception e) {
            printError("дату, повторите ввод. "); 
        }             
        return text;      
    }  

    public String getUserPhone(String str) {
        String number = str;
        Pattern pattern = Pattern.compile("\\A\\+*\\d{2}\\Z");
        Matcher matcher = pattern.matcher(number);
        try {
            if (matcher.find()){
                String numberPhone = matcher.group();
                System.out.println("Отлично!!! Введенная строка: " + numberPhone);    
            } 
        } 
        catch (Exception e) {
            printError("номер телефона, повторите ввод. ");
        }    
        return number;       
    }

    public String getsexUser(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A[fm]\\Z");
        Matcher matcher = pattern.matcher(text);
        try {
            if (matcher.find()){
            String sexUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + sexUser);   
            } 
        } catch (Exception e) {
            printError("идентификатор пола, повторите ввод. ");
        } 
        return text;          
    }  

    public void printError (String errorMessage) {
        System.err.println("Вы ввели не коректно " + errorMessage);
        }  
}



    
