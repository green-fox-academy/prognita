import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        int y = 0;
        int x = 0;


        for (int i = 0; i < WIDTH / 20; i++) {
            drawLine(graphics, 0, x);
            drawLine(graphics, WIDTH, x);
            x += 20;
        }


        for (int j = 0; j < HEIGHT / 20; j++) {

            drawLine(graphics, y, 0);
            drawLine(graphics, y, HEIGHT);
            y += 20;
        }


    }

    public static void drawLine(Graphics graphics, int x, int y) {

        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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