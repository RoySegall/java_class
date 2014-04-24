import java.util.Scanner;

public class Password {

  public static void main(String args[]) {
    final String PASSWORD = "querty";
    String userPassword;
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a your password");
    String pass = scan.next();

    while (!pass.equals(PASSWORD)) {
      System.out.println("The password not match to the correct password.");
      pass = scan.next();
    }

    System.out.print("Correct! you are in.");
  }
}
