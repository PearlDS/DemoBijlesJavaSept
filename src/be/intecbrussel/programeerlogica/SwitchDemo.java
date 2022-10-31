package be.intecbrussel.programeerlogica;

public class SwitchDemo {

    public static void main(String[] args) {



        String season = "ajhuiofh";


        switch (season){

            case "spring":
                System.out.println("Flowers are so pretty"); break;
            case "summer":
                System.out.println("Beach time!");break;
            case "fall":
                System.out.println("I got a cold");break;
            case "winter":
                System.out.println("Let it snow");break;
            default:
                System.out.println("This is not a season");



        }


    }
}
