import java.util.Scanner;

public class FactorialFor {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number;
    int factorial = 1;

    System.out.println("Please enter a number");
    number = scan.nextInt();

    for (int j = 1; j <= number; j++) {
      factorial *= j;
    }

    System.out.println("The factorial is: " + factorial);
  }
}
