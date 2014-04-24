import java.lang.String;import java.lang.System;import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    int number;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number, -1 to quit.");
    number = scan.nextInt();
    int max = number;

    while (number != -1) {
      if (number > max) {
        max = number;
      }

      System.out.println("Enter number, -1 to quit");
      number = scan.nextInt();
    }

    System.out.println("The bigger number you enter is: " + max);
  }
}
