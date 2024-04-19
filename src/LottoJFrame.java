import javax.swing.*;

public class LottoJFrame {
    private JButton pick01Button;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Currency Converter1");
        frame.setContentPane(new LottoJFrame().button2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
