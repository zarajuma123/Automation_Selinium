package Second_Day;

public class ForLoop_Array {

    public static void main(String[] args) {
        //create a String dynamic array for borough
        String[] borough = new String[6]; //you set the limit/boundaries for your array
        //now you define your values by the variables indexing
        borough[0] = "USA";
        borough[1] = "Canada";
        borough[2] = "Bangladesh";
        borough[3] = "Austria";
        borough[4] = "India"; 
        borough[5] ="Russia";

        for (int i=0;i< borough.length;i++){
            //print statement
            System.out.println("My current borough is " +borough[i]);

        }//end of for loop



    }//end of main method
}//end of java class
