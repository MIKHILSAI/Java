import java.util.Scanner;
public class WinLoose{
  public static void main(String [] args){
    Scanner mik = new Scanner(System.in);
    String Enter = mik.nextLine();
    if(Enter.equals("Win")){
      System.out.println("You Win");
    }
    else{
      System.out.println("You Loose");
    }
  }
}