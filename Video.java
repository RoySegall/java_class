/**
 * Created by Roysegall on 5/15/14.
 */
public class Video {

  String _title;
  int _length;
  boolean _avail;

  public Video(String title) {
    this._title = title;
    this._length = 90;
    this._avail = true;
  }

  public Video(String title, int length) {
    this._title = title;
    this._length = length;
    this._avail = true;
  }

  public Video() {

  }

  public void show() {
    System.out.println(this._title + " " + this._length + " minutes " + this._avail);
  }
}
