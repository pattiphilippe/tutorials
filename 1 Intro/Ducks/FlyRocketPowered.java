import java.util.logging.Logger;

public class FlyRocketPowered implements FlyBehavior {
    
    private static final Logger logger = Logger.getLogger(FlyRocketPowered.class.getName());
    private static final String FLY_STRING = "I'm flying with a rocket!";

    @Override
    public void fly() {
        logger.info(FLY_STRING);
    }
    
}
