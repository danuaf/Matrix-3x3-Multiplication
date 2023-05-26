import javax.swing.*;
public class Main {
    private JPanel jpA1;
    private JTextField a2;
    private JTextField a3;
    private JTextField a1;
    private JTextField a4;
    private JTextField a5;
    private JTextField a6;
    private JTextField a7;
    private JTextField a8;
    private JTextField a9;
    private JTextField b1;
    private JTextField b2;
    private JTextField b3;
    private JTextField b4;
    private JTextField b5;
    private JTextField b6;
    private JTextField b7;
    private JTextField b8;
    private JTextField b9;
    private JTextField c1;
    private JTextField c2;
    private JTextField c3;
    private JTextField c6;
    private JTextField c5;
    private JTextField c4;
    private JTextField c9;
    private JTextField c8;
    private JTextField c7;
    private JButton btnHasil;
    private JButton btnClear;

    private final JTextField[][] matrikA = {
            {a1, a2, a3},
            {a4, a5, a6},
            {a7, a8, a9}
    };

    private final JTextField[][] matrikB = {
            {b1, b2, b3},
            {b4, b5, b6},
            {b7, b8, b9}
    };

    private final JTextField[][] matrikC = {
            {c1, c2, c3},
            {c4, c5, c6},
            {c7, c8, c9}
    };


    private final MatrikCalculator calculator = new MatrikCalculator(matrikA, matrikB, matrikC);

    public Main() {
        btnHasil.addActionListener(actionEvent -> calculator.calculate());
        btnClear.addActionListener(actionEvent -> calculator.clear());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().jpA1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}