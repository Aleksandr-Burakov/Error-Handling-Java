package homevorks.homework01.task01;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов

class HomeWork1 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже      
      Integer[] mas = {1, 2, 3};
      Integer min = mas[5];
}
    public static void divisionByZero() {
        // Напишите свое решение ниже
        int num1 = 5;
        int num2 = 0;
        int result = num1 / num2;
      
}
    public static void numberFormatException() {
        // Напишите свое решение ниже
      String str = "1, 2, 3, 4, rt";
      Integer num = Integer.parseInt(str);      
 }
    public static void main(String[] args) {
        HomeWork1 ans = new HomeWork1();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
