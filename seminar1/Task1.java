package seminar1;

public class Task1 {
    
    public static Integer CheckMas(Integer[] mas, Integer min) {
        if (min <= mas.length) {
           return mas.length;
        }
         return -1;
    }
    public static void main(String[] args){
        Integer min = 3;
        Integer[] mas = {1, 2, 3};
        System.out.println(CheckMas(mas, min));
    }     
}

