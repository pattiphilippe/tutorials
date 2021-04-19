package ducks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>(Arrays.asList(new Duck("Daffy", 8), new Duck("Dewey", 2),
                new Duck("Howard", 7), new Duck("Louie", 2), new Duck("Noham", 10), new Duck("McGregor", 2)));

        System.out.println("Before sorting");
        display(ducks);

        Collections.sort(ducks);

        System.out.println("After sorting");
        display(ducks);
    }

    private static void display(List<Duck> ducks) {
        ducks.forEach(System.out::println);
        System.out.println("");
    }
}
