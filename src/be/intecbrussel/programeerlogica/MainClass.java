package be.intecbrussel.programeerlogica;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//        System.out.println("Give an age:");
//        int age = scanner.nextInt();
//        System.out.println("Your number is: "+ number);


//        System.out.println("What will the weather be?");
//        String weather = scanner.next();


//        if(weather.equals("sun")){
//            System.out.println("Sunshine");
//        }else {
//            System.out.println("Better stay inside");
//        }
//
//        if (age > 60){
//            System.out.println("You're wise");
//        }
//      else if (age> 30){
//            System.out.println("You're beautiful");
//        }
//       else {
//           System.out.println("You're young");
//       }
//

        boolean legalToDrink = false;
//
//       if(age > 18){
//           legalToDrink = true;
//       }else {
//           legalToDrink =false;
//       }
//
//        System.out.println(legalToDrink);
//
//       legalToDrink = age>18?true:false;
//
//        System.out.println(legalToDrink);

        int aNumber = 12;


        String result = aNumber%2==0?"Number is even":"Number is uneven";

        System.out.println(result);


    }
}
