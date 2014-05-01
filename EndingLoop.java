import java.util.Scanner;

public class EndingLoop {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int grade;
    int gradeCounter = 0;
    int sum = 0;
    double average = 0;
    System.out.println("Enter the grades (Use ctrl z to stop)");

    while (scan.hasNext()) {
      grade = scan.nextInt();
      sum += grade;
      gradeCounter++;
    }

    if (gradeCounter > 0) {
      average = sum / gradeCounter;
    }

    System.out.println(average);
  }
}
