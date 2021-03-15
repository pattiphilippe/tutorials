import java.util.logging.Logger;

public class FlyWithWings implements FlyBehavior {
    
    private static final Logger logger = Logger.getLogger(FlyWithWings.class.getName());
    private static final String FLY_STRING = "I'm flying !!";

    @Override
    public void fly() {
        logger.info(FLY_STRING);
    }
    
}
