import java.awt.*;
import javax.swing.*;

public class View extends JPanel {
    private int width = 400;
    private int pos;
    private String cards1 = "";
    private String cards2 = "";
    private String pile1 = "";
    private String pile2 = "";
    private String winner = "";
    private String name = "";

    //the constructor
    public View(String n) {

        pos = 20;
        name = n.toUpperCase();//player1 name
        JFrame frame = new JFrame("War Game");
        frame.setVisible(true);
        frame.setSize(3 * width / 2, width);//frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit game
        frame.getContentPane().add(this);

    }

    /*paintComponent prints each method of these class in a graphical window
     *@param g, the pen to draw
     */
    public void paintComponent(Graphics g) {
        //paint background with white color
        g.setColor(Color.white);
        g.fillRect(0, 0, 3 * width / 2, width);
        //paint players names
        g.setColor(Color.black);
        g.drawString(name, pos, pos);
        g.drawString("COMPUTER", width - 4 * pos, pos);
        //paint cards
        g.setColor(Color.green);
        g.drawString(cards1, pos, 2 * pos);
        g.drawString(cards2, width - 4 * pos, 2 * pos);
        //paint amounts of each pile
        g.setColor(Color.BLUE);
        g.drawString(pile1, pos, 5 * pos);
        g.drawString(pile2, width - 4 * pos, 5 * pos);
        //paint winners' name
        g.setColor(Color.red);
        g.drawString(winner, width - 9 * pos, width - 4 * pos);

    }


    //this method gets player1's card - repaint for each
    public void paintString1(String message) {
        cards1 = message;
        this.repaint();
    }

    //this method gets computer's card
    public void paintString2(String message) {
        cards2 = message;
        this.repaint();
    }

    //paintwinner gets the name of the winner
    public void paintwinner(String message) {
        winner = message;
        this.repaint();
    }

    //paintpile1 gets the amount of cards player1 has won
    public void paintpile1(String p1) {
        pile1 = p1;
        this.repaint();
    }

    //paintpile1 gets the amount of cards computer has won
    public void paintpile2(String p2) {
        pile2 = p2;
        this.repaint();
    }

}