import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;
    SnakeGame(){
        board=new Board();
        setTitle("Snake Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(board);
        pack();
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        //initialize SnakeGame
        SnakeGame snakeGame=new SnakeGame();
    }

}
