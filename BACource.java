public class BACource extends classCourse {

  final private int EXTRA = 300;
  final private int SUMMER_SEMESTER = 3;

  public BACource(String title, int semester) {
    super(title, semester);
  }

  public int calculatePrice() {
    return this.semester == SUMMER_SEMESTER ? BASE_PRICE + EXTRA : BASE_PRICE;
  }
}
