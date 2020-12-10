package Practice;

import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner number =  new Scanner(System.in);
        System.out.print("Input first number : ");
        int number1 =  number.nextInt();
        System.out.print("Input second number : ");
        int number2 = number.nextInt();
        System.out.print("Input third number : ");
        int number3 = number.nextInt();
        System.out.print("Input fourth number : ");
        int number4 = number.nextInt();

        if ((number1 == number2 ) && (number3 == number4)){
           System.out.println("Numbers are Equal.");
        } else 
        {
            System.out.println("Number are not equal.");
        }

    }
    
}
