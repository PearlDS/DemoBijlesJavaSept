package be.intecbrussel.programeerlogica;

public class DimensionalArraysDemo {
    public static void main(String[] args) {


        String [][] dictionary = new String[3][];
        String [][] dictionary2 = {{"ap", "az"},{"be"}};
        dictionary[0]= new String[2];
        dictionary[1]= new String[1];
        dictionary[2]= new String[3];

        dictionary[0][0] = "aardvark";
        dictionary[0][1]= "apple";
        dictionary[1][0] = "bear";
        dictionary[2][0]= "chansey";
        dictionary[2][1] = "clown";
        dictionary[2][2]= "crap";


        for (int x = 0; x < dictionary.length; x++){
            System.out.println("Next letter in alfabet: "+ dictionary[x][0].toUpperCase().charAt(0));
            for (int y =0; y < dictionary[x].length; y++){
                System.out.println(dictionary[x][y]);
            }
        }




    }
}
