import java.util.Scanner;

public class Password {

  public static void main(String args[]) {
    final String PASSWORD = "qwerty";
    Scanner scan = new Scanner(System.in);
    String userPassword;

    do {
      System.out.println("Please enter password");
      userPassword = scan.next();
    } while (!userPassword.equals(PASSWORD));

    System.out.println("You are in");
  }
}
