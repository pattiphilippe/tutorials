package mighty_gumball.v2;

class NoQuarterState extends State {

    NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    void refill(int refillAmount){
        //Nothing to do
    }
    
}
