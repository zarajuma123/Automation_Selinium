package Third_Day;

public class MultipleCondition {

    public static void main(String[] args) {

        //define the set of variables
       int a = 1;
        int b = 2;
        int c = 3;

        //verify a+b>c, a+b<c or a+b ==c
        if(a+b > c){
            System.out.println("a & b is greater than c");
        }else if (a+b <c) {
            System.out.println(" a & b is less than c");
        } else {
            System.out.println(" a & b is equal to c");
        }//end of if statement

        // define integers variables
       /* int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;

        //verify the a+b<c+d, b+d> a+c, a+d <= b+c
         if (a+b>c+d){
             System.out.println(" a and b will be less than c + d ");
         }else if (b+d< a+c){
             System.out.println(" b and d will be bigger than a + c ");
         }else {
             System.out.println("a & d is less than or equal to b and c");

         }*/


    }//end of main

}//end of java class
