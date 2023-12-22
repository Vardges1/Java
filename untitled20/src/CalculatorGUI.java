import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JTextField inputField;
    private JButton[] digitButtons;
    private JButton[] operatorButtons;
    private JButton calculateButton;
    private JButton resetButton;
    private JLabel resultLabel;

    public CalculatorGUI() {
        frame = new JFrame("RPN Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField(15);
        resultLabel = new JLabel("Result:");

        createDigitButtons();
        createOperatorButtons();
        createCalculateButton();
        createResetButton(); // Added reset button

        frame.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4)); // Increased rows to accommodate the new button

        for (JButton button : digitButtons) {
            buttonPanel.add(button);
        }

        for (JButton button : operatorButtons) {
            buttonPanel.add(button);
        }

        buttonPanel.add(calculateButton);
        buttonPanel.add(resetButton); // Added reset button

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createDigitButtons() {
        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(Integer.toString(i));
            digitButtons[i].addActionListener(new DigitButtonActionListener(Integer.toString(i)));
        }
    }

    private void createOperatorButtons() {
        operatorButtons = new JButton[4];
        String[] operators = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            operatorButtons[i].addActionListener(new OperatorButtonActionListener(operators[i]));
        }
    }

    private void createCalculateButton() {
        calculateButton = new JButton("=");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private void createResetButton() {
        resetButton = new JButton("C");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
    }

    private void calculate() {
        String expression = inputField.getText();
        try {
            double result = RPNCalculator.evaluateRPN(expression);
            resultLabel.setText("Result: " + result);
        } catch (Exception ex) {
            resultLabel.setText("Error");
            ex.printStackTrace();
        }
    }

    private class DigitButtonActionListener implements ActionListener {
        private String digit;

        public DigitButtonActionListener(String digit) {
            this.digit = digit;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText(inputField.getText() + digit);
        }
    }

    private class OperatorButtonActionListener implements ActionListener {
        private String operator;

        public OperatorButtonActionListener(String operator) {
            this.operator = operator;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            inputField.setText(inputField.getText() + " " + operator + " ");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI());
    }
}
