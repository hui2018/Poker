import java.util.Scanner;

public class Main extends Deck {
    public static void main(String[] args) {
        Deck player1 = new Deck();
        Deck player2 = new Deck();
        int counter = 1;
        int player1Value = 0;
        int player2Value = 0;
        while(counter < 3) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Player"+counter+ " new card? (y/n)");
            if(counter == 1)
            {
                player1Value = player1.newValue();
                System.out.println("total value: "+player1Value);
                char check = reader.next().charAt(0);
                while (check == 'y')
                {
                    player1Value+=player1.newValue();
                    System.out.println("total value: "+player1Value);
                    Scanner reader1 = new Scanner(System.in);
                    System.out.println("Another card? (y/n)");
                    if(player1Value >21)
                    {
                        System.out.println("Player2 wins!");
                        System.exit(1);
                    }
                    check = reader1.next().charAt(0);
                }
            }
            else
            {
                player2Value = player2.newValue();
                System.out.println("total value: "+player2Value);
                char check = reader.next().charAt(0);
                while (check == 'y')
                {
                    player2Value+=player2.newValue();
                    System.out.println("total value: "+player2Value);
                    Scanner reader1 = new Scanner(System.in);
                    System.out.println("Another card? (y/n)");

                    if(player2Value >21)
                    {
                        System.out.println("Player1 wins!");
                        System.exit(1);
                    }
                    check = reader1.next().charAt(0);
                }
            }

            counter++;
        }
        if(player1Value > player2Value)
        {
            System.out.println("Player1 wins!");
        }
        else if(player1Value == player2Value)
            System.out.println("Tie!");
        else
            System.out.println("Player2 wins!");
    }
}
