public class PiggyBank {

  private int _dollars;
  private int _cents;

  /**
   * Constructing the object without any money.
   */
  public PiggyBank() {
    this._cents = 0;
    this._dollars = 0;
  }

  /**
   * Return the amount of dollars in the piggy bank.
   */
  public int getDollars() {
    return this._dollars;
  }

  /**
   * Set the amount of dollars.
   *
   * @param dollars
   *  The amount of dollars.
   */
  public void setDollars(int dollars) {
    this._dollars = dollars;
  }

  /**
   * Get the amount of cents.
   */
  public int getCents() {
    return this._cents;
  }

  /**
   * Set the amount of cents in the piggy bank.
   *
   * @param cents
   *  The amount of cents.
   */
  public void setCents(int cents) {
    this._cents = cents;
  }

  /**
   * Constructing the object with known amount of money.
   *
   * @param dollars
   *  Amount of money.
   * @param cents
   *  Amount of cents.
   */
  public PiggyBank(int dollars, int cents) {
    this._cents = cents;
    this._dollars = dollars;
  }

  /**
   * Add money to the piggy bank.
   *
   * @param dollars
   *  The amount of dollars.
   * @param cents
   *  The amount of cents.
   */
  public PiggyBank addMoney(int dollars, int cents) {
    int newDollars = this._dollars + dollars;
    int newCents = this._cents + cents;

    if (newCents > 99) {
      newDollars += newDollars / 100;
      newCents += newCents % 100;
    }

    if (newCents < 0) {
      newDollars--;
      newCents = 100 + newCents;
    }

    if (newDollars < 0) {
      System.out.println("Error: No money");
      return new PiggyBank(this._dollars, this._cents);
    }

    return new PiggyBank(newDollars, newCents);
  }

  /**
   * Draw money from the piggy bank.
   *
   * @param dollars
   *  Number of dollars to draw from the piggy bank.
   * @param cents
   *  Number of cents to draw from the piggy bank.
   *
   * @return PiggyBank
   *  The amount
   */
  public PiggyBank withDrawhMoney(int dollars, int cents) {
    return this.addMoney(-dollars, -cents);
  }

  /**
   * Print to the user the amount of money he have in the piggy bank.
   */
  public void printStatus() {
    System.out.println("You have " + this._dollars + " dollars and " + this._cents + " cents.");
  }
}
