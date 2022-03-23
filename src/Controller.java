import javax.swing.*;

public class Controller {
    private String name = "";
    public CardDeck cards;
    private int letra1, letra2;
    private String suit1, suit2;
    private int pile1, pile2 = 0;
    public Card c1, c2;
    public View view;
    private int x = 2;


    public Controller(String n, CardDeck deck, View v) {
        name = n;
        cards = deck;
        view = v;
    }

    public void game() {
        String winner = "Computer";
        boolean result = true;
        while (result) {

            String round = JOptionPane.showInputDialog("Play next round , press the ok button");
            if (round == null || round.equals("no") || round.equals("jo")) {
                result = false;
            }

            if (cards.moreCards()) {

                c1 = cards.newCard();
                c2 = cards.newCard();
                letra1 = c1.getCount();
                letra2 = c2.getCount();
                suit1 = c1.getSuit();
                suit2 = c2.getSuit();
                view.paintString1(getCard1());
                view.paintString2(getCard2());


                if (letra1 == letra2) {
                    JOptionPane.showMessageDialog(null, "WAR");
                    x += 2;
                    game();
                } else if (letra1 == 1) {
                    pile1 = pile1 + x;
                    x = 2;
                    view.paintpile1(name + " has " + pile1 + " cards");
                } else if (letra2 == 1) {
                    pile2 = pile2 + x;
                    x = 2;
                    view.paintpile2("Computer has " + pile2 + " cards");
                } else if (letra1 < letra2) {
                    pile2 = pile2 + x;
                    x = 2;
                    view.paintpile2("Computer has " + pile2 + " cards");
                } else if (letra2 < letra1) {
                    pile1 = pile1 + x;
                    x = 2;
                    view.paintpile1(name + " has " + pile1 + " cards");
                }

                if (pile1 > pile2) {
                    winner = name;
                }
            } else if (pile1 == pile2) {
                view.paintwinner("This game is a draw");
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);
            } else {

                view.paintwinner("The winner is " + winner);
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);

            }
        }

    }

     public String getCard1() {
        String player1 = c1.countOf() + " " + suit1;
        return player1;
    }

    public String getCard2() {
        return c2.countOf() + " " + suit2;
    }


}