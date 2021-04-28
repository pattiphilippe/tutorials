package mighty_gumball.v2;

class SoldState extends State {

    SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getNbGumballs() == 0) {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    void refill(int refillAmount){
        //Nothing to do
    }
    
}
