package mighty_gumball.v2;

import java.util.Random;

class HasQuarterState extends State {

    private Random randomWinner = new Random(System.currentTimeMillis());

    HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (1 < gumballMachine.getNbGumballs())){
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    void dispense() {
        System.out.println("You need to turn the crank");
    }

    @Override
    void refill(int refillAmount){
        //Nothing to do
    }
    
}
