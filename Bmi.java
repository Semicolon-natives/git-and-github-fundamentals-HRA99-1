import java.util.Scanner;

public class Bmi{
 
 public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
   
   System.out.print("Weight in pounds: ");
   int weight1= input.nextInt();
   
   System.out.print("Height in inches: ");
   int height2 = input.nextInt();
   
   float pounds = weight1 / height2;
    
    System.out.printf("%s%n","Weight1","Height2" pounds);
 }

}
