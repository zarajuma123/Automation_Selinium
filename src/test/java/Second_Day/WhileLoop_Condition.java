package Second_Day;

public class WhileLoop_Condition {
    public static void main(String[] args) {
        //using dynamic array for Zipcodes
        String[] zipcodes;
        zipcodes = new String[5];
        zipcodes[0] = "11235";
        zipcodes[1] = "11835";
        zipcodes[2] = "11735";
        zipcodes[3] = "11935";
        zipcodes[4] = "11035";

        //iterate all zipcodes using while loop condition
        int i=0;
        while (i< zipcodes.length){

            System.out.println("My zipcode is " + zipcodes[i]);


            i = i+1;

        }//end of while loop

    }//end of main method
}//end of while loop
