import java.text.NumberFormat;
import java.util.Scanner;

public class Mortagage {
  public static void main(String[] args) {
    System.out.print("Principal : ");
      Scanner myAmnt = new Scanner(System.in);
      int principal = myAmnt.nextInt();
      if (principal < 1000 || principal > 100_000){
          System.out.println("Please Enter the value between $1000 and $100,000.");
      }
      
      System.out.print("Annunal Interest Rate : ");
      Scanner myRate = new Scanner(System.in);
      float interestRate = myRate.nextFloat();
      if (interestRate < 0 && interestRate >= 30){
          System.out.println("Enter value greater than 0 or less than or equal to  30.");
      }
      
      System.out.print("Period (Years) : ");
      Scanner myYrs = new Scanner(System.in);
      short years = myYrs.nextShort();
      if (years < 1 || years >= 30){
          System.out.println("Enter the value between 1 and 30.");
      }
      
      float anualRate = (interestRate /100)/12;
      System.out.println(anualRate);
      double power =  Math.pow((anualRate + 1), years);
      System.out.println(power);
      double mortgage = (principal *anualRate * power)/(power -1);
      NumberFormat mortgageAmount = NumberFormat.getCurrencyInstance();
      String currency = mortgageAmount.format(mortgage);
      System.out.print("Mortagage : " + currency );

  }   
}
