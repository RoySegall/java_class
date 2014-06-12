public class OrderMission {

  /**
   * Check if x is a.
   * @param a
   *  The two-dimensional array.
   * @param x
   *  The element we need to find.
   *
   * @return
   *  True/False if we found the x.
   */
  public static boolean find(int[][] a, int x) {

    return true;
  }

  public static void main(String[] args) {
    int[][] a = {
      {1,2,3,4,5},
      {2,6,7,7,9},
      {10,11,12,13,14},
      {15,16,17,18,19},
      {20,21,22,23,23},
    };

    if (find(a, 2)) {
      System.out.println("Fond!");
    }
  }
}
