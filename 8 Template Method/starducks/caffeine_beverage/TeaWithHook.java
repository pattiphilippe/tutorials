package starducks.caffeine_beverage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dipping tea bag in water");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return getUserInput().toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like lemon with you tea (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null)
            return "no";
        return answer;
    }

}