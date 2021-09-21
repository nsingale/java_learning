import java.util.Scanner;

public class Recursion {
    // Recursive implementation of the factorial method.
    public int factorial(int num){
        //Base condition
        if (num <=1){
            return 1;
        }
        //Recursive call
        else{
            return num * factorial(num-1);
        }
    }

    // Recursive implementation of the fibonacci series
    public int fibonacci(int num) {
        //Base condition
        if (num <=1){
            return num;
        }
        //Recursive call
        else{
         return fibonacci(num-1) + fibonacci(num-2);
        }
    }

//    Display the Sorting.Array
    public void displayArray(int[] inputArray){
        for (int index =0; index<inputArray.length;index++){
            System.out.print(inputArray[index]+" ");
            System.out.println();
        }
    }


    public static void main(String [] args){

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter length of the Fibonacci sequence you want to display");
        int length = myObj.nextInt();
        Recursion obj = new Recursion();
        for (int i =0; i< length; i++){
            System.out.print(" "+obj.fibonacci(i));
        }

        System.out.println();
        System.out.println("Enter number for factorial to calculate");
        length = myObj.nextInt();
        System.out.println(obj.factorial(length));
        int [] inputArray = new int[]{20,-15,7,1,35,55,-22};
        obj.displayArray(inputArray);
    }
}
