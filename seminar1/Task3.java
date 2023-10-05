package seminar1;

import java.util.zip.Checksum;

// Реализуйте метод, принемающий в качестве аргумента целочисленный двумерный массив.

// Необходимо посчитать и вернуть сумму элементов этого массива
// При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (Колличество строк + колличеству столбцов),
//  и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен бросить RunTimeExeption с сообщением об ошибке.



public class Task3 {
    public static void main(String[] args){
        // Integer [][] arr = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}}; - Значения не удовлетворяют условию. Значения массивов, не являются 0 (нулём) или 1 (еденицей).
        // Integer [][] arr = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}}; - Сумма значений равна: 5
        // Integer [][] arr = {{1, 0, 1, 0}, {1, 1, 0, 0}, {0, 1, 0, 1}}; // Массив не квадратный, количество строк не равно количеству столбцов.
        
        try {
             Integer [][] arr = {{1, 0, 1, 0}, {1, 1, 0, 0}, {0, 1, 0, 1}}; // Сумма значений равна: 8
        System.out.println(checkMass(arr));
        } catch (RuntimeException e) {
           System.out.println(e.getMessage());
        }
        System.out.println(-1);
    }
       

    public static int checkMass( Integer[][] arr){
        // if (arr.length != arr[0].length) - Проверяем Длина строки не равна глубине строки.
        // if (arr.length != arr[0].length) {
        //     throw new RuntimeException(" Массив не квадратный: " + arr.length + "x" + arr[0].length); 
        // }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Проверяем количество строк равно количеству столбцов
            if (arr.length != arr[i].length) {
            throw new RuntimeException("Массив не квадратный, количество строк не равно количеству столбцов: " + arr.length + "x" + arr[i].length); 
        }
            for (int j = 0; j < arr.length; j++) {
                if (arr [i][j] > 1 || arr [i][j] < 0) {
                    throw new RuntimeException("Значения не удовлетворяют условию. Значения массивов, не являются 0 (нулём) или 1 (еденицей).");
                    // 
                }
                sum += arr[i][j]; //Сложение значений Элементов массива
            }
            
        }
        return sum;
    }
    
}
