import java.util.Scanner;
public class Coding5{
  public static void main(String [] args){
    System.out.print("Enter Income: ");
    Scanner mik = new Scanner(System.in);
    int income = mik.nextInt();
    if(income>7000){
      System.out.println("Scholarship Granted");
    }
    else{
      System.out.println("Scholarship Not Granted");
    }
  }
}