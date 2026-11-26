import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {
    Font font;
    Color darkGrayColor;
    Color lightGrayColor;
    Color backgroundColor;

    public DrawShapes() {
        font = new Font("Arial", Font.ITALIC, 18);
        darkGrayColor = Color.darkGray;
        backgroundColor = Color.white;
        lightGrayColor = Color.lightGray;
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph);
        graph.setFont(font);
        graph.setColor(Color.black);
        graph.drawString("Draw Shapes", 90, 20);
        graph.setColor(lightGrayColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);
        graph.setColor(darkGrayColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
        graph.setColor(Color.gray);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 300);
        frame.add(new DrawShapes());
        frame.setVisible(true);
    }
}