package homevorks.homework03.task01;

class DataUserPresenter {
    

    private UserPresenterModel model;
    private UserPresenterView view;

  
    public DataUserPresenter(UserPresenterModel newModel, UserPresenterView view) {
        model = newModel;
        this.view = view;
    }

    public void dataUserString (String num1, String num2, String num3, String num4){
        String result;
      
             result = model.add(num1," " + num2," " + num3," " + num4);
       
        view.printResult(result);
        
        
         
    }

   
        
}
