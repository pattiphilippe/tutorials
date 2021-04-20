import java.util.logging.Logger;

public class ModelDuck extends Duck {
    private static final Logger logger = Logger.getLogger(ModelDuck.class.getName());
    private static final String DISPLAY_STRING = "I'm a model duck";


    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    

    @Override
    public void display() {
        logger.info(DISPLAY_STRING);
    }
    
}
