import java.util.Scanner;

public class Cost{
 
 public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
   
   System.out.print("Cost of driving: ");
   int driving distance1= input.nextInt();
   
   System.out.print("Distance to drive: ");
   int miles per gallon2 = input.nextInt();
   
   System.out.print("Fuel efficiency: ");
   int price per gallon3 = input.nextInt();
    
    System.out.printf("%s%n%s%n%s%n","Driving distance1","Miles per gallon2","Price per gallon" );
 }

}
