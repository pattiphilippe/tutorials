package tutorials.successive_refinement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            final Args arg = new Args("l,p#,d*", args);
            final boolean logging = arg.getBoolean('l');
            final int port = arg.getInt('p');
            final String directory = arg.getString('d');
            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            logger.error("Argument error [{}]", e.errorMessage());
        }
    }

    private static void executeApplication(final boolean logging, final int port, final String directory) {
        logger.info("Executing application, logging [{}], port [{}], directory [{}]", logging, port, directory);
    }
}