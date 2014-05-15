public class Movie extends Video {

  private String _director;
  private String _rating;

  public Movie(String title, int length, String director, String rating) {
    super(title, length);
    this._director = director;
    this._rating = rating;
  }
}
