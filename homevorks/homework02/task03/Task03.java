// Задание 3.
// Дан следующий код, исправьте его там, где требуется.

package homevorks.homework02.task03;

public class Task03 {
    
    public static void main(String[] args) throws Exception {
    try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;

    // Вызов в первом блоке catch супперкласс Throwable, приведет к неисполнению 
    // последующих исключений в блоках catch, так как супперкласс Throwable в Иерархии
    // исключений самый старший и все остальные блоки содержатся в нем. 
    // Поэтому для исполнения младших класов исключений в блоках catch
    // должны прописываться в первую очередь самый младший класс по Иерархии.  

    }catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
    }catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
    }catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
    }
    }

    // Тип исключения FileNotFoundException обрабатывает файлы и являится исключением для отображения 
    // информации о том, что ФАЙЛ НЕ НАЙДЕН. так как мы в данном коде не работаем с файлом 
    // данный тип исключения лишний. 
    // Вместо FileNotFoundException можно обработать в данном контексте NullPointerException
    // Уведомив другие методы, что printSum может вызвать исключение NullPointerException
    // и создали throw для выброса исключений.

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        if(a == null || b == null) throw new NullPointerException("Возможно указывает на null!");
        System.out.println(a + b);
    }
}