package be.intecbrussel.programeerlogica;

public class LoopDemo {

    public static void main(String[] args) {

        int timeToWakeUp = 6;
        int currentHour=6;

        do{

            currentHour++;
            System.out.println("Current hour is: "+currentHour);

        }while (currentHour<timeToWakeUp);



        //BAD EXAMPLE: never use while(true); it's not clear for other programmers
        while (true){

            System.out.println("This loop will run forever");
            currentHour++;
            if (currentHour==14){
                break;
            }
        }


    }
}
