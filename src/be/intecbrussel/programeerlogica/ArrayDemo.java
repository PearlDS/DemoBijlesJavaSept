package be.intecbrussel.programeerlogica;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {



        String shoe1 = "Nike";
        String shoe2 = "Balenciaga";
        String shoe3 = "Adidas";
        String shoe4 = "Prada";
        String shoe5 = "Converse";
        String shoe6 = "Timberland";

        String [] myShoeCloset = new String[8];
        myShoeCloset [0] = shoe1;
        myShoeCloset [1] = shoe2;
        myShoeCloset [2] = shoe3;
        myShoeCloset [3] = shoe4;
        myShoeCloset [4] = shoe5;
        myShoeCloset [5] = shoe6;
        //0 1 2 3 4 5

        String [] myNewShoeCloset = {shoe1, shoe2, shoe3,shoe4,shoe5,shoe6};


        System.out.println(myNewShoeCloset[4]);
        System.out.println(myShoeCloset[0]);

        //simpele for loop
//        for (int position = 0; position <myShoeCloset.length;position++){
//
//            if (myShoeCloset[position]!=null) {
//                System.out.println("Trying on my " + myShoeCloset[position] + " shoes.");
//                System.out.println("Putting my " + myShoeCloset[position] + " shoes back in the closet.");
//            }
//
//            }

        //for each loop
//        for (String shoe:myShoeCloset){
//
//            if (shoe!=null) {
//                System.out.println("Trying on my " + shoe + " shoes.");
//                System.out.println("Putting my " + shoe + " shoes back in the closet.");
//            }
//
//        }

        //Static method vn klasse Arrays
        System.out.println(Arrays.toString(myShoeCloset));


//        System.out.println("Trying on my "+shoe1+ " shoes.");
//        System.out.println("Trying on my "+shoe2+ " shoes.");
//        System.out.println("Trying on my "+shoe3+ " shoes.");
//        System.out.println("Trying on my "+shoe4+ " shoes.");
//        System.out.println("Trying on my "+shoe5+ " shoes.");
//        System.out.println("Trying on my "+shoe6+ " shoes.");
//
//        System.out.println("Putting my "+shoe1+ " shoes back in the closet.");
//        System.out.println("Putting my "+shoe2+ " shoes back in the closet.");
//        System.out.println("Putting my "+shoe3+ " shoes back in the closet.");
//        System.out.println("Putting my "+shoe4+ " shoes back in the closet.");
//        System.out.println("Putting my "+shoe5+ " shoes back in the closet.");
//        System.out.println("Putting my "+shoe6+ " shoes back in the closet.");




    }
}
