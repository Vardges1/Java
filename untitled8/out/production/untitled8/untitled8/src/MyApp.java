import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame {
    public MyApp() {
        setTitle("Random Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new RandomShapes());

        AnimationDisplay animationDisplay = new AnimationDisplay();
        add(animationDisplay.createAndShowGUI());

        JButton startAnimationButton = new JButton("Start Animation");
        startAnimationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                animationDisplay.startAnimation();
            }
        });
        add(startAnimationButton, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyApp();
            }
        });
    }
}
