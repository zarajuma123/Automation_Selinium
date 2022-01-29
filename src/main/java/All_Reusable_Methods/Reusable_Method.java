package All_Reusable_Methods;

public class Reusable_Method{


    //create a void method that will add two numbers
    public static void add(int x, int y) {
            System.out.println(" Result of addition is " + (x + y));
        }//end of the method

    //create a division method
    public static void division( int x , int y){
        System.out.println("Result of division is " + (x/y));
    }//end of division method


    //create a void method that will subtract two numbers
        public static void subtract(int x, int y) {
            System.out.println("Result of subtraction is " + (x - y));

        }//end subtraction

        //create multiple
        public static void multiply(int x, int y) {
            System.out.println(" result of multiplication " + (x * y));
        }//end multiply

    //Create a return Method And add two numbers also return the result
    public static int addReturn(int x, int y) {
            int result = x+y;
        System.out.println(" Result of addition is " + result);
        return result;
    }//end of the method

   /* // create a return method and subtract two number
    public static int subtractReturn( int x,int y){
        int result= x-y;
        System.out.println("result of subtract of two numbers " + result);
        return result;
    }//*/






}//end of method


