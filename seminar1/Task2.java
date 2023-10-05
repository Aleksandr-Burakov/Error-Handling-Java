package seminar1;

public class Task2 {

        public static String ErrorMas(Integer numError){
            if (numError == -1) {
                return "Длинна массива меньше заданого минимума";  
            }
            else if (numError == -2) {
                return "Искомый элемент не найден";
            }
            else if (numError == -3) {
                return "Mas == null";
            }
            else{
                return "Индекс первого вхождения: " + numError;
            }
                        
        }
         
        public static Integer FindElement (Integer[] mas, Integer value) {
            Integer min = 5;
            if (mas == null) {
                return -3;
            }
            if (min > mas.length){
                return -1;
            }
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] == value) {
                    return i;
                }
            }
            return -2;
        }
        public static void main(String[] args){
            Integer min = 4;
            // Integer min = 5;
            // Integer[] mas = {1, 2, 32, 3, 4}; - Искомый элемент не найден
            // Integer[] mas = {1, 2, 3}; - Длинна массива меньше заданого минимума
            // Integer[] mas = {1, 2, 3, 4, 6}; - Индекс первого вхождения: 3
            // Integer[] mas = null; - Mas == null
            Integer[] mas = {1, 2, 32, 3, 4};
            System.out.println(ErrorMas(FindElement(mas, min)));
        }     
}
