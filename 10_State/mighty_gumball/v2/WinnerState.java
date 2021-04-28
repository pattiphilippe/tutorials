package mighty_gumball.v2;

class WinnerState extends State {

    private static final int MAX_BALLS_TO_RELEASE = 2;

    WinnerState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    void insertQuarter() {
        System.out.println("Please wait, we're already giving you 2 gumballs");
    }

    @Override
    void ejectQuarter() {
        System.out.println("Please wait, we're giving you 2 gumballs");
        
    }

    @Override
    void turnCrank() {
        System.out.println("Please wait, you already won");
    }

    @Override
    void dispense() {
        System.out.println("YOU WON AN EXTRA BALL!!");
        int ballsReleased = 0;
        while(ballsReleased < MAX_BALLS_TO_RELEASE && 0 < gumballMachine.getNbGumballs()){
            gumballMachine.releaseBall();
            ballsReleased++;
        }

        if (gumballMachine.getNbGumballs() == 0) {
            System.out.println("Oops, out of gumballs!");
            if(ballsReleased < MAX_BALLS_TO_RELEASE){
                System.out.println("You won, but got trolled. There's no second ball left xD");
            }
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
