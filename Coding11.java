import java.util.Scanner;

public class Coding11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (salary >= 20000 || age <= 25) {
            System.out.print("Enter required loan amount: ");
            int loanAmount = input.nextInt();

            if (loanAmount <= 50000) {
                System.out.println("You are eligible for loan.");
            } else {
                System.out.println("Maximum loan amount is 50000.");
            }
        } else {
            System.out.println("You are not eligible for loan.");
        }

        input.close();
    }
}
