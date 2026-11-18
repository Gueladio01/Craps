

public class DieTest
{
  public static void main(String[] args)
  {
    Die die1 = new Die();  //No constructor is actually needed
    Die die2 = new Die();

    die1.roll();
    die2.roll();

    int sum = die1.getNumDots() + die2.getNumDots();
    System.out.println(sum);
  }
}
