package mighty_gumball.v2;

class SoldOutState extends State {

    SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    void refill(int refillAmount){
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
}
