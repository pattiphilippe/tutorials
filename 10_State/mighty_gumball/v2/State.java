package mighty_gumball.v2;

abstract class State {

    GumballMachine gumballMachine;

    State(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    abstract void insertQuarter();
    abstract void ejectQuarter();
    abstract void turnCrank();
    abstract void dispense();
    abstract void refill(int refillAmount);

    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
