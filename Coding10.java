import java.util.Scanner;
public class Coding10{
  public static void main(String [] args){
    Scanner mik = new Scanner(System.in);
    String color = mik.nextLine();
    if(color.equals("Red")){
      System.out.println("Stop");
    }
    else if(color.equals("Yellow")){
      System.out.println("Ready");
    }
    else if(color.equals("Green")){
      System.out.println("Go");
    }
    else{
      System.out.println("Invalid Color");
    }
  }
}