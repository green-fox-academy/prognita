import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] Box = new int[][]{{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] GreenFox = new int[][]{{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};

        ConnectDots(graphics, Box);
        ConnectDots(graphics, GreenFox);
    }


    public static void ConnectDots(Graphics graphics, int[][] dot) {

        graphics.setColor(Color.GREEN);
        for (int i = 0; i < dot.length - 1; i++) {
            //drawLine(kezdő x, kezdő y, befejező x, befejező y)
            graphics.drawLine(dot[i][0], dot[i][1], dot[i + 1][0], dot[i + 1][1]);
        }
        graphics.drawLine(dot[0][0], dot[0][1], dot[dot.length - 1][0], dot[dot.length - 1][1]);
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


