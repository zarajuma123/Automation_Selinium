package Example_package_create;

public class Practice_forLoopArray {

    public static void main(String[] args) {
        //create string array for borough
       String[] boroughs;
        boroughs = new String[6];
        boroughs[0]= "Manhattan";
        boroughs[1]= "Bronx";
        boroughs[2]= "Brooklyn";
        boroughs[3]= "S Island";
        boroughs[4]= "Queens";
        boroughs[5]= "LI";

        //using for loop condition iterate all boroughs
        for (int i = 0; i <boroughs.length; i++){
            System.out.println(" i live in New york at " + boroughs[i]);
        }//end of for loop











}//end of main method
}//end of java class







