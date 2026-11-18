

//This program generates random numbers between 1 and 6 and passes the values to RollingDice so simulate one roll of dice

public class Die
{
    private int dieNum;

    public Die()
    {
        //no args constructor
    }

    //simulate one roll of a die
    public void roll()
    {
       dieNum = (int)(1+Math.random()*6);
    }

    //acessor method that returns value of dieNum
    public int getNumDots()
    {
        return dieNum;
    }
}