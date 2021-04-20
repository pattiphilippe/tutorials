import java.util.logging.Logger;

public abstract class Duck {
    private static final Logger logger = Logger.getLogger(Duck.class.getName());
    private static final String SWIM_MSG = "All ducks float, even decoys.";

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected Duck() {
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        logger.info(SWIM_MSG);
    }
}