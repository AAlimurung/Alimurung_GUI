package SimpleCalculator;
import javax.swing.*;

public class SimCalcu extends JFrame{
    private JPanel panel1;
    private JButton btnCompute;
    private JTextField tfNum1;
    private JComboBox cbOperations;
    private JTextField tfNum2;
    private JTextArea textArea1;
    private JLabel lblRes;

    public SimCalcu(){
        SimCalcu am = this;
        btnCompute.addActionListener(e -> {
            String n1, n2;
            n1 = tfNum1.getText();
            n2 = tfNum2.getText();
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            int res = 0;

            if(cbOperations.getSelectedIndex() == 0){
                res = num1 + num2;
                textArea1.append(String.valueOf(res) + "\n");
            } else if (cbOperations.getSelectedIndex() == 1) {
                res = num1 - num2;
                textArea1.append(String.valueOf(res) + "\n");
            } else if (cbOperations.getSelectedIndex() == 2) {
                res = num1 * num2;
                textArea1.append(String.valueOf(res) + "\n");
            } else if (cbOperations.getSelectedIndex() == 3) {
                res = num1 / num2;
                textArea1.append(String.valueOf(res) + "\n");
            }
        });
    }
    public static void main(String[] args) {
        SimCalcu sm = new SimCalcu();
        sm.setContentPane(sm.panel1);
        sm.setSize(680, 280);
        sm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sm.setVisible(true);
        sm.setTitle("Simple Calculator");
    }
}
