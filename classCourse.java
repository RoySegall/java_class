/**
 * Created by Roysegall on 5/21/14.
 */
abstract public class classCourse {

  protected String title;
  protected int semester;
  protected final int BASE_PRICE = 1700;

  public classCourse(String title, int semester) {
    this.title = title;
    this.semester = semester;
  }

  public abstract int calculatePrice();
}
