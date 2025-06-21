import java.util.Scanner;
public class Coding6{
  public static void main(String [] args){
    System.out.print("Enter Number: ");
    Scanner mik = new Scanner(System.in);
    int number = mik.nextInt();
    if(number % 5 == 0 && number % 3 == 0){
      System.out.println("The number is divisible by both 5 and 3");
    }
    else{
      System.out.println("The number is not divisible by both 5 and 3");
    }
  }
}