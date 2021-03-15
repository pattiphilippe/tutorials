import java.util.logging.Logger;

public class MallardDuck extends Duck {
    
    private static final Logger logger = Logger.getLogger(MallardDuck.class.getName());
    private static final String DISPLAY_STRING = "I'm a real Mallard duck";

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        logger.info(DISPLAY_STRING);
    }
    
}
