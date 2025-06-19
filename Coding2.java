import java.util.Scanner;
public class Coding2{
  public static void main(String[] args){
    Scanner mik = new Scanner(System.in);
    float a = mik.nextFloat();
    float b = mik.nextFloat();
    float c = mik.nextFloat();
    float d = a * b * c;
    float e = a + b + c;
    System.out.println(d/e);
  }
}