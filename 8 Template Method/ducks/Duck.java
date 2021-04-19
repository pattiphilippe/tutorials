package ducks;

import java.util.Objects;

public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Duck)) {
            return false;
        }
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name) && weight == duck.weight;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

}
