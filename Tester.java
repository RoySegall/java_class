public class Tester {

  public static void main(String args[]) {
    PiggyBank piggy = new PiggyBank(12, 66);

    // Print how much money we have.
    piggy.printStatus();

    // Adding money to the piggy bank.
    piggy = piggy.addMoney(6, 8);
  }
}
