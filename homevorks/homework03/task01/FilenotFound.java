package homevorks.homework03.task01;

import java.io.FileNotFoundException;


    
class FilenotFound extends FileNotFoundException {
      FilenotFound() {
        super("Файл не найден ");
      }
    
      FilenotFound(String path) {
        super("Файл не найден по пути " + path);
      }
}



