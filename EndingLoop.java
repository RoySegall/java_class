import java.util.Scanner;

public class EndingLoop {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double[] numbers = new double[13];

    System.out.println("Enter ten numbers");

    for (int i = 0; i < 10; i++) {
      numbers[i] = scan.nextDouble();
    }

    System.out.println(numbers[9]);
  }
}
