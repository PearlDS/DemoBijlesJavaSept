package be.intecbrussel.inheritance.canines;

public final class Poodle extends Dog{

    private static int numberOfPoodles;

    {
        numberOfPoodles++;
    }


    @Override
    public String getName() {
        return "It's name is: "+ super.getName();
    }

    public static int getNumberOfPoodles() {
        return numberOfPoodles;
    }

    @Override
    public String toString() {
        return "Poodle{" +
                "numberOfLegs=" + super.numberOfLegs +
                ", name='" + super.getName() + '\'' +
                "}";
    }
}
