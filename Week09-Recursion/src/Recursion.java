import java.util.Scanner;


public class Recursion {
    Scanner input = new Scanner(System.in);
    int count;
    Recursion(){
        System.out.println("Enter a number to start countdown: ");
        count = input.nextInt();
    }

    void countdown(){
        int start = count;
        while (start > 0){
            System.out.println(start + "...");
            start--;
        }
        System.out.println("Iterative - Blast Off!!!");

    }

    void countdown1(int start){
        if (start > 0){
            System.out.println(start + "...");
            countdown1(start - 1); //recursive call here
        } else {
            System.out.println("Recursive - Blast Off!!");
        }

    }

    void multiply(){
        System.out.println("Enter first positive number:");
        int numX = input.nextInt();
        System.out.println("Enter second positive number:");
        int numY = input.nextInt();
        System.out.println("Result " + numX + " times " + numY + " = "+ numX * numY);

    }

    void multiplyInput(){
        System.out.println("Enter first positive number:");
        int first = input.nextInt();
        System.out.println("Enter second positive number:");
        int second = input.nextInt();
        int result = multiply1(first,second); //CALLING RECURSIVE METHOD
        System.out.println("Result " + first + " times " + second + " = " + result);
    }

    int multiply1(int value1, int value2){
        double answer;
        if (value2 == 0){
            return 0;
        } else {
            return value1 + multiply1(value1, value2 -1);
        }
    }



    public static void main(String[] args) {
    Recursion r1 = new Recursion();
    //r1.countdown();
    //r1.countdown1(r1.count);//needs count variable from r1's constructor
    //r1.multiply();
    r1.multiplyInput();

    }
}