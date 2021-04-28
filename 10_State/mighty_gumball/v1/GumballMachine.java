package mighty_gumball.v1;

import static mighty_gumball.v1.GumballMachineState.*;

public class GumballMachine {
    private GumballMachineState state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (0 < count)
            state = NO_QUARTER;
    }

    public GumballMachineState getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void insertQuarter() {
        switch (state) {
        case HAS_QUARTER:
            System.out.println("You can't insert another quarter");
            break;
        case NO_QUARTER:
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
            break;
        case SOLD_OUT:
            System.out.println("You can't insert a quarter, the machine is sold out");
            break;
        case SOLD:
            System.out.println("Please wait, we're already giving you a gumball");
            break;
        }
    }

    public void ejectQuarter() {
        switch (state) {
        case HAS_QUARTER:
            System.out.println("Quarter ejected");
            state = NO_QUARTER;
            break;
        case NO_QUARTER:
            System.out.println("You haven't inserted a quarter");
            break;
        case SOLD_OUT:
            System.out.println("You can't eject, you haven't inserted a quarter yet");
            break;
        case SOLD:
            System.out.println("Sorry, you already turned the crank");
            break;
        }
    }

    public void turnCrank() {
        switch (state) {
        case SOLD:
            System.out.println("Turning twice doesn't get you another gumball!");
            break;
        case HAS_QUARTER:
            System.out.println("You turned...");
            state = SOLD;
            dispense();
            break;
        case NO_QUARTER:
            System.out.println("You turned but there's no quarter");
            break;
        case SOLD_OUT:
            System.out.println("You turned, but there are no gumballs");
            break;
        }
    }

    public void dispense() {
        switch (state) {
        case SOLD:
            System.out.println("A gumball  comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
            break;
        case HAS_QUARTER:
            System.out.println("You need to turn the crank");
            break;
        case NO_QUARTER:
            System.out.println("You need to pay first");
            break;
        case SOLD_OUT:
            System.out.println("No gumball dispensed");
            break;
        }
    }

    @Override
    public String toString() {
        return "{" + " state='" + getState() + "'" + ", count='" + getCount() + "'" + "}";
    }

}
