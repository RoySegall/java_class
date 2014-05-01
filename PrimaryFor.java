import java.util.Scanner;

public class PrimaryFor {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int number;

    System.out.println("Please enter a number");
    number = scan.nextInt();

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        System.out.println("Not prime");
        return;
      }
    }

    System.out.println("The number is prime");
  }
}
