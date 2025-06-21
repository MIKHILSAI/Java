import java.util.Scanner;
public class Coding7{
  public static void main(String [] args){
    System.out.print("Enter Number: ");
    Scanner mik = new Scanner(System.in);
    int number = mik.nextInt();
    if(number % 2 == 0){
      System.out.println("The number is even");
    }
    else{
      System.out.println("The number is odd");
    }
  }
}