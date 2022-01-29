package Fourth_Day;

public class Split_Command {

    public static void main(String[] args) {
        //create a single string
        String message = "My name is John";

        //declare string array to split the message to print out only john
        String[] arrayMessage = message.split(" ");
        //print out the array
        System.out.println("Result is " +arrayMessage[3]);

    }//end of main



}//end of java class
