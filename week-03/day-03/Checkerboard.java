import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int Y = 0;
        int X = 0;

        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                Y = i * 40;
                X = j * 40;
                if ((j % 2) == (i % 2))
                    squareDraw(graphics, X, Y);
            }
        }
    }

    private static void squareDraw(Graphics graphics, int X, int Y) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(X, Y, 40, 40);
        return;
    }


    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

