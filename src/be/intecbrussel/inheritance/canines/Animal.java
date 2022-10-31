package be.intecbrussel.inheritance.canines;

public abstract class Animal {

    private String name;


    public abstract void makenoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
