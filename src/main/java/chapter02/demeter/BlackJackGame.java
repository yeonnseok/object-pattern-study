package chapter02.demeter;

public class BlackJackGame {

    public void run() {
        Player player = new Player();

        for (Card card : player.getCards()) {
            System.out.println(card.getName());
        }
    }
}
