import java.util.Scanner;

public class PrimaryFor {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int number;

    System.out.println("Please enter a number");
    number = scan.nextInt();
    boolean isPrime = true;

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println("The number is prime");
    }
    else {
      System.out.println("Not prime");
    }
  }
}
