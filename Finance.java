import java.util.Scanner;

public class Finance{
 
 public static void financeApplicatin(String[] args) {
 
   Scanner input = new Scanner(System.in);
   
   System.out.print("investment amount: ");
   double amount1 = input.nextDoulble();
   
   System.out.print("annual interest: ");
   double amount2 = input.nextDouble();
   
   System.out.print("number of years: ");
   int amount3 = input.nextInt();
   
   double sum = annualInterest + numberOfyears;
    
    System.out.println("The Sum is " + sum);
 }

}
