import java.util.Scanner;
public class Coding3{
  public static void main(String[] args){
    Scanner mik = new Scanner(System.in);
    String name = mik.nextLine();
    float score = mik.nextFloat();
    String department = mik.next();
    System.out.println("Score: " + score/10);
  }
}