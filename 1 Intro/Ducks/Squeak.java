import java.util.logging.Logger;

public class Squeak implements QuackBehavior {
    private static final Logger logger = Logger.getLogger(Squeak.class.getName());
    private static final String QUACK_STRING = "<< Silence >>";

    @Override
    public void quack() {
        logger.info(QUACK_STRING);
    }
    
}
