public class Movie extends Video {

  private String _director;
  private String _rating;

  public Movie(String title, int length, String director, String rating) {
    super(title, length);
    this._director = director;
    this._rating = rating;
  }

  public Movie(String title, String director, String rating) {
    super(title);
    this._director = director;
    this._rating = rating;
  }

  public void show() {
    super.show();

    String str = " directed by " + this._director;
    str += " with a rating of " + this._rating;

    System.out.println(str);
  }
}
