import java.lang.String;import java.lang.System;import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    int number, max = 0;
    Scanner scan = new Scanner(System.in);

    do {
      System.out.println("Enter number, -1 to quit");
      number = scan.nextInt();

      if (number > max) {
        max = number;
      }

    } while (number != -1);

    System.out.println("The bigger number you enter is: " + max);
  }
}
