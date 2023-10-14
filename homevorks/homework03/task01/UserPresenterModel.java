package homevorks.homework03.task01;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserPresenterModel {




    public String add(String num1, String num2, String num3, String num4) {
        return num1 + num2 + num3 + num4;
        
    }
   
    // public static String getUserInput(){
    //     System.out.println("Введите в одну строку, всё через пробел: \n        " + // 
    //                   "Фамилию Имя Отчество \n\n" + // 
    //                   "Дату рождения: \n        dd.mm.yyyy \n\n" + //
    //                   "Номер телефона: \n        +2 цифры \n\n" + //
    //                   "Пол - символ латиницей: \n        f или m \n");
    //     try(Scanner scanner = new Scanner(System.in, "Cp866");) {
    //         String result = scanner.nextLine();
    //         return result;
    //     }    
    // }

     public String isFirstLastName(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A[a-zA-Z]+\\s[a-zA-Z]+\\s[a-zA-Z]+\\Z");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            String dataUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + dataUser);    
            } 
        else{
            System.out.println("Введены не коректные данные Ф.И.О. " + str + " не совпадает с параметрами: ");   
        }
        return str;       
    }  


     public String dateBirth(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)(0?[1-9]|[1][0-9]|2[012]))\\Z");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            String dataUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + dataUser);    
            } 
        else{
            System.out.println("Введена не коректная дата " + str + " не совпадает с параметрами: ");   
        }
        return str;       
    }  

    public String getUserPhone(String str) {
        String number = str;
        Pattern pattern = Pattern.compile("\\A\\+*\\d{2}\\Z");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()){
            String numberUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + numberUser);    
            } 
        else{
            System.out.println("Введен не коректный номер телефона " + str + " не совпадает с параметрами: ");   
        }
        return str;       
    }





    public String getsexUser(String str) {
        String text =str;
        Pattern pattern = Pattern.compile("\\A[fm]\\Z");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()){
            String sexUser = matcher.group();
            System.out.println("Отлично!!! Введенная строка: " + sexUser);    
            } 
        else{
            System.out.println("Введен не коректный идентификатор пола: " + str + " не совпадает с параметрами: ");   
        }
        return str;       
    }  


     


    
    //    public Boolean isFirstLastName2(String str) {
    //     String pattern = str;
    //     Boolean matcher = pattern.matches("\\s*(\\D+\\s\\D+\\s\\D+)\\s" + //
    //     "([01-31]{2}+\\.[01-12]{2}+\\.[1901-2022]{4}+)\\s((\\+*)\\d{2}+)\\s([f,m]{1}+)\\s*");
    //     if (matcher){
    //         System.out.println("Отлично!!! Введенная строка: " + matcher);    
    //         } 
    //     else{
    //         System.out.println("Введенная строка " + str + " не совпадает с параметрами: ");   
    //     }
    //     return matcher;       
    // }

   

  
  







}
