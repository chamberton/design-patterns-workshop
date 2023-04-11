package creational.factory.abstr;

import creational.factory.*;

public class ButtonFactoryProducer {

    public static AbstractButtonFactory getFactory(boolean bordered){   
       if(bordered){
          return new BorderedButtonFactory();         
       }else{
          return new BordelessButtonFactory();
       }
    }

 }