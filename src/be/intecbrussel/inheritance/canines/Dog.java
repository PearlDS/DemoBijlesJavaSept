package be.intecbrussel.inheritance.canines;

public class Dog extends Wolf{

    private String nickName;


    public Dog() {
    }

    public Dog(int numberOfLegs, String name) {
        super(numberOfLegs, name);
    }

    public Dog(int numberOfLegs, String name, String nickName) {
        super(numberOfLegs, name);
        this.nickName = nickName;
    }

    public void doATrick(String order){
        System.out.println("The dog did the following trick: "+order);
    }



    @Override
    public String toString() {

        return "Dog{" +
                "numberOfLegs=" + super.numberOfLegs +
                ", name='" + super.getName() + '\'' +
                "}";
    }
}
