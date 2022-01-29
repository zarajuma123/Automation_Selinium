package Eighth_Day;

import java.util.ArrayList;

public class ArrayList_Examples {
    public static void main(String[] args) {

        ArrayList<String > cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");

        System.out.println("My  third city is" + cities.get(2));

        ArrayList<Integer> streetnumber = new ArrayList<>();
        streetnumber.add(444);
        streetnumber.add(333);
        streetnumber.add(222);

        System.out.println("My third city is" + cities.get(2) + "and my streetnumber is" + streetnumber.get(1));






    }//end of main


}//end of java
