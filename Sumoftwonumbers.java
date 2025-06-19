import java.util.Scanner;
public class Sumoftwonumbers {
    public static void main(String[] args) {
      Scanner mikhil = new Scanner(System.in);
      System.out.print("Enter First Number: ");
      int a = mikhil.nextInt();
      System.out.print("Enter Second Number: ");
      int b = mikhil.nextInt();
      int sum = a + b;
      System.out.println("Sum of two numbers is: " + sum);
    }
}