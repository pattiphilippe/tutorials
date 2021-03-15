import java.util.logging.Logger;

public class FlyNoWay implements FlyBehavior {
    
    private static final Logger logger = Logger.getLogger(FlyNoWay.class.getName());
    private static final String FLY_STRING = "I can't fly.";

    @Override
    public void fly() {
        logger.info(FLY_STRING);
    }
    
}
