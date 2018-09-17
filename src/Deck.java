import java.util.Random;
public class Deck {
    Deck()
    {
    }
    public int newValue ()
    {
        int value = 0;
        Random rand = new Random();
        value = rand.nextInt(10);
        while(value == 0)
        {
            value = rand.nextInt(10);
        }
        return value;
    }
}
