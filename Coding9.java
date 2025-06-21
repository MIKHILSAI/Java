import java.util.Scanner;
public class Coding9{
  public static void main(String [] args){
    Scanner mik = new Scanner(System.in);
    System.out.print("Enter Maths Mark:");
    int maths = mik.nextInt();
    System.out.print("Enter Science Mark:");  
    int science = mik.nextInt();
    System.out.print("Enter English Mark:");
    int english = mik.nextInt();
    System.out.print("Enter Social Mark:");
    int social = mik.nextInt();
    System.out.print("Enter Computer Mark:");
    int computer = mik.nextInt();
    int total = maths + science + english + social + computer;
    double average = total / 5.0;
    System.out.println("Total Marks: " + total);
    System.out.println("Average Marks: " + average);
    if(average <= 35 ){
      System.out.println("Additional Support Needed");
    }
    else{
      System.out.println("You are good to go");
    }
  }
}