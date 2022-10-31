package be.intecbrussel.inheritance.canines;

import java.util.Objects;

public class Wolf extends Animal {

    protected int numberOfLegs =4;
    private String name;
    private static int numberOfWolves;


    {
        numberOfWolves++;
    }


    public Wolf() {

    }

    public Wolf(int numberOfLegs, String name) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void makenoise() {
        System.out.println("awooo");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfWolves() {
        return numberOfWolves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wolf)) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(getName(), wolf.getName());
    }

    @Override
    public int hashCode() {
        
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "numberOfLegs=" + numberOfLegs +
                ", name='" + name + '\'' +
                '}';
    }
}
