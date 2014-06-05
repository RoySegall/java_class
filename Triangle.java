public class Triangle {

  public static int triangle(int n) {
    if (n == 1) {
      return 1;
    }

    return n + triangle(n-1);
  }

  public static void main(String[] args) {
    System.out.println(triangle(10));
  }
}
