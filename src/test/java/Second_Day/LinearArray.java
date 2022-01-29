package Second_Day;

public class LinearArray {

    public static void main(String[] args) {

        //declare a variable first
        String[] cities, zipcodes;

        //define the linear array for cities
        cities = new String[]{"Brooklyn", "Queens", " Manhattan", " Staten Island", "Bronx"};

        //define the linear array for zipcode
        zipcodes = new String[]{ "11218", "22222", "33333", "44444", "55555"};

        //declare int variable
        int[] streetNumber;

        //define integer array for street number
        streetNumber = new int[]{22,44,55,66,77,88};

        //print the first city and first street number and also third zipcode
        System.out.println( "My first city is " + cities[0] + " and street number is " + streetNumber[0] + " And my third zipcode is " + zipcodes[2]);






    }  //end of main method




}//end of java class
