import java.util.logging.Logger;

public class Quack implements QuackBehavior {
    private static final Logger logger = Logger.getLogger(Quack.class.getName());
    private static final String QUACK_STRING = "Quack";

    @Override
    public void quack() {
        logger.info(QUACK_STRING);
    }
    
}
