import java.util.Scanner;;
public class Coding8{
  public static void main(String [] args){
    Scanner mik = new Scanner(System.in);
    System.out.print("Enter Your Mark:");
    int mark = mik.nextInt();
    if(mark<50){
      System.out.println("You need to improve your score.");
    }
    else if(mark>50 && mark<70){
      System.out.println("Good job, you passed!");
    }
    else{
      System.out.println("Excellent work, you scored high!");
    }
  }
}