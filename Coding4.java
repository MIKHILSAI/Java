import java.util.Scanner;
public class Coding4{
  public static void main(String [] args){
    System.out.print("Enter Mark: ");
    Scanner mik = new Scanner(System.in);
    int mark = mik.nextInt();
    if(mark>35){
      System.out.println("Pass");
    }
    else{
      System.out.println("Fail");
    }
  }
}