public class Triangle {

  public static int triangle(int n) {
    if (n == 1) {
      return 1;
    }

    return n + triangle(n-1);
  }

  public static long factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return n * factorial(n - 1);
  }

  public static int plus(int number, int times) {
    if (times == 1) {
      return number;
    }

    return number + plus(number, times - 1);
  }

  public static void main(String[] args) {
    System.out.println(triangle(10));
    System.out.println(factorial(6));
    System.out.println(plus(5, 5));
  }
}
