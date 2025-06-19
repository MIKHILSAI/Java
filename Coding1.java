import java.util.Scanner;
public class Coding1 {
  public static void main(String[] args) {
    Scanner mik = new Scanner(System.in);
    System.out.print("Enter Your Name:");
    String name = mik.nextLine();
    System.out.print("Enter Your Age:");
    int age = mik.nextInt();
    System.out.print("Enter Your Address: ");
    String address = mik.next();
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Address: " + address);
  }
}