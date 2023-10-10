// package homevorks.homework03.task2;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class MainVoids {
    
//     public static boolean isNumber2(String str) {
//         String string = "0123456789";
//         for (char elem : str.toCharArray()) {
//           if (!string.contains(String.valueOf(elem))) {
//             return false;
//           }
//         }
//         return true;
//     }

//     public static boolean isAlphabetRU(String str) {

//  String input = str;
//         boolean result = input.matches("[а-яА-Я](\\D*)");
//         if(result){
//         System.out.println("Это нужные Буквы");
//         }
//         else{
//         System.out.println("Это не Буквы");    
//         }
//         return result;

//         // String string = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
//         // // String string = str;
//         // // string.matches("[а-я||А-Я]");
//         // for (char elem : str.toCharArray()) {
//         //   if (!string.contains(String.valueOf(elem))) {
//         //     return false;
//         //   }
//         // }
//         // return true;    
//     }

//     public static boolean isAlphabetEU(String str) {
//         // String string = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
//         // // String string = str;
//         // // string.matches("[a-z||A-Z]");
//         // for (char elem : str.toCharArray()) {
//         //   if (!string.contains(String.valueOf(elem))) {
//         //     return false;
//         //   }
//         // }
//         // return true;    

//         String input = str;
//         boolean result = input.matches("[a-zA-Z](\\D*)");
//         if(result){
//         System.out.println("Это нужные Буквы");
//         }
//         else{
//         System.out.println("Это не Буквы");    
//         }
//         return result;
//     }

//     // public static boolean isNumberPhone(String str){
//     //     String input = str;
//     //     boolean result = input.matches("(\\+*)\\d{11}");
//     //     if(result){
//     //     System.out.println("Это телефонный номер");
//     //     }
//     //     else{
//     //     System.out.println("Это не телефонный номер");    
//     //     }
//     //     return result;
//     // }


//         public static boolean isNumberPhone(String str){
//             Pattern pattern = Pattern.compile("^[a-zA-Z]+s[a-zA-Z]+$");
//             // String input = str;
//             Matcher result = pattern.matcher(str);

//             // if(result){
//             // System.out.println("Это телефонный номер");
//             // }
//             // else{
//             // System.out.println("Это не телефонный номер");    
//             // }
//             return result.matches();
//         }

   
//     public static boolean isFirstLastName(String str) {
//         Pattern pattern = Pattern.compile("\\D+\\s\\D+\\s\\D+");
//         Matcher matcher = pattern.matcher(str);
//         boolean result = matcher.matches();
//         return result;
//         }  
// }
