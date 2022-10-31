package be.intecbrussel.inheritance.canines;

public class DogApp {
    public static void main(String[] args) {


        Wolf wolf = new Wolf();
        Dog dog = new Dog();

        wolf.setName("Luna");
        dog.setName("Fido");


        System.out.println(wolf);
        System.out.println(dog);



        System.out.println(wolf.getNumberOfLegs());
        System.out.println(dog.getNumberOfLegs());


        Wolf wolfDog = new Dog();
        Poodle poodle = new Poodle();
        poodle.setName("Fifi");

        Dog dog2 = new Dog(4,"Luna", "M");


        Wolf [] canines = {wolf, wolfDog,dog, poodle, dog2};

        for (Wolf w: canines){
            if (w instanceof Dog)
            System.out.println(w);
        }


        System.out.println("Amount of wolves");
        System.out.println(Wolf.getNumberOfWolves());
        System.out.println("amount of poodles");
        System.out.println(Poodle.getNumberOfPoodles());


        System.out.println("instance check");
        System.out.println(dog instanceof Wolf);
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Poodle);
        //Not compatible
        //System.out.println(dog instanceof Snake);

        Wolf wolf1 = new Wolf();
        wolf1.setName("Luna");


        System.out.println("compare check");
        System.out.println(wolf.equals(poodle));
        System.out.println(wolf.equals(dog2));
        System.out.println(wolf.equals(wolfDog));
        System.out.println(wolf.equals(wolf1));

        System.out.println(wolf.hashCode());
        System.out.println(wolf1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(poodle.hashCode());
        System.out.println(wolfDog.hashCode());




    }
}
