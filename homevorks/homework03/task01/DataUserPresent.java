package homevorks.homework03.task01;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class DataUserPresenter {

    private UserPresenterModel model;
    private UserPresenterView view;

  
    public DataUserPresenter(UserPresenterModel newModel, UserPresenterView view) {
        model = newModel;
        this.view = view;
    }

    public void dataUserString (String num1, String num2, String num3, String num4) {
        String result;
      
             result = model.add("\n" + num1," " + num2," " + num3," " + num4);
       
        view.printResult(result);
        
        try(FileWriter writer = new FileWriter("J:\\GeekBrains\\Обучение GeekBrains\\Обучение Программирование\\Занятие_12. Исключения в программировании и их обработка\\Error Git\\Error-Handling-Java\\homevorks\\homework03\\task01\\dataUser.txt", true )) 
        {
            String path = result ;
            writer.write(path); 
            writer.close(); 
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }          
    }      
}
