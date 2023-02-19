package mighty_gumball;
import mighty_gumball.v2.GumballMachine;

public class GumballMachineV2TestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        emptyGumballMachine(gumballMachine);
        gumballMachine.refill(10);
        emptyGumballMachine(gumballMachine);
    }

    private static void emptyGumballMachine(GumballMachine gumballMachine){
        while(0 < gumballMachine.getNbGumballs()){
            System.out.println(gumballMachine);
    
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }

}
