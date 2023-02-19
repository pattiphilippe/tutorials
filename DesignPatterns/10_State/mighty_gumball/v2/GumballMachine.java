package mighty_gumball.v2;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int nbGumballs;

    public GumballMachine(int nbGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.nbGumballs = nbGumballs;
        if (0 < nbGumballs) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void refill(int refillAmount) {
        this.nbGumballs += refillAmount;
        System.out.println("The gumball machine was just refilled; its new amount is: "+ this.nbGumballs);
        state.refill(refillAmount);
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (0 < nbGumballs) {
            nbGumballs--;
        }
    }

    State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getNoQuarterState() {
        return noQuarterState;
    }

    State getHasQuarterState() {
        return hasQuarterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    public int getNbGumballs() {
        return nbGumballs;
    }

    @Override
    public String toString() {
        return "{" + "state='" + getState() + "'" + ", nbGumballs='" + getNbGumballs() + "'" + "}";
    }
}
