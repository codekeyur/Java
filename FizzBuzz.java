import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Number: ");
        int value = number.nextInt();
        
        if (value % 5 ==0 && value % 3 == 0){
            System.out.println("FizzBuzz");
        }else if (value % 3 == 0){
            System.out.println("Buzz");
        }else if (value % 5 == 0){
            System.out.println("Fizz");
        }else {
            System.out.println(value);
        }


    }
}
