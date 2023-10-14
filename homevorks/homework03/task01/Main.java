// Напишите приложение, которое будет запрашивать у пользователя следующие данные
// в произвольном порядке, разделенные пробелом:
// Фамилия Имя Отчество дата рождения номер телефона пол
// Форматы данных:
// фамилия, имя, отчество - строки
// дата рождения - строка формата dd.mm.yyyy
// номертелефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.
// Приложение должно проверить введенные данные по количеству. 
// Если количество не совпадает с требуемым, вернуть код ошибки,
// обработать его и показать пользователю сообщение, 
// что он ввел меньше и больше данных, чем требуется.
// Приложение должно попытаться распарсить полученные значения и 
// выделить из них требуемые параметры. Если форматы данных не совпадают,
// нужно бросить исключение, соответствующее типу проблемы.
// Можно использовать встроенные типы java и создать свои. 
// Исключение должно быть корректно обработано, 
// пользователю выведено сообщение с информацией, что именно неверно.
// Если всё введено и обработано верно, должен создаться файл с названием,
// равным фамилии, в него в одну строку должны записаться полученные данные,
// вида <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
// Не забудьте закрыть соединение с файлом.
// При возникновении проблемы с чтением-записью в файл,
// исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

package homevorks.homework03.task01;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class Main {
  public static void main(String[] args) {
 
  UserPresenterModel model = new UserPresenterModel();
  UserPresenterView view = new UserPresenterView();
  DataUserPresenter controll = new DataUserPresenter(model, view);
  Scanner scanner = new Scanner(System.in);
  System.out.println("\n Введите в одну строку, всё через пробел: \n Фамилию Имя Отчество ");
  String num1 = view.getUserInput();
  String num11 = model.isFirstLastName(num1);

  System.out.println("\n Введите в одну строку, через точку, Дату рождения: \n dd.mm.yyyy ");
  String num2 = view.getUserInput();
  String num22 = model.dateBirth(num2);

  System.out.println("\n Введите в одну строку, Номер телефона: \n +2 цифры ");
  String num3 = view.getUserInput();
  String num33 = model.getUserPhone(num3);

  System.out.println("\n Введите в одну строку Пол - символ латиницей: \n f или m ");
  String num4 = view.getUserInput();
  String num44 = model.getsexUser(num4);
  
  scanner.close();
  controll.dataUserString(num11, num22, num33, num44);
  

        
         
        
        // try(FileWriter writer = new FileWriter("dataUser.txt", true ))
        // {
        //    // запись всей строки
        //     String text = str ;
        //     writer.write(text);
        //     // запись по символам
        //     writer.append('\n');
        //     writer.append('E');
             
        //     writer.flush();
        // }
        // catch(IOException ex){
             
        //     System.out.println(ex.getMessage());
        // } 



  // String text =str; // строка для записи
  //   try(FileOutputStream file = new FileOutputStream("J:\\GeekBrains\\Обучение GeekBrains" + //
  //   "\\Обучение Программирование\\Занятие_12. Исключения в программировании и их обработка\\" + //
  //   "Error Git\\Error-Handling-Java\\homevorks\\homework03\\task01\\dataUser.txt", true))
  //   {  
  //   byte[] buffer = text.getBytes(); // перевод строки в байты   
  //   file.write(buffer, 0, buffer.length);
  //   System.out.println("Файл записан");
  //   }
  //   catch(IOException ex){       
  //     System.out.println(ex.getMessage());
  //     }  
  }
}  

