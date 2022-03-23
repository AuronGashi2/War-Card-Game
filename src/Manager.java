import javax.swing.*;

public class Manager {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        Controller controller;
        String play = JOptionPane.showInputDialog("Do you want to play the game ?").toUpperCase();
        if (play.equals("OK") || play.equals("YES") || play.equals("") || play.equals("PO")) {
            String s = JOptionPane.showInputDialog("Type the player name : ");
            View view = new View(s);
            controller = new Controller(s, deck, view);
            controller.game();
        } else {
            System.exit(0);
        }
    }

}


