public class MACourse extends classCourse {

  final private int EXTRA = 500;

  public MACourse(String title, int semester) {
    super(title, semester);
  }

  public int calculatePrice() {
    return BASE_PRICE + EXTRA;
  }
}
