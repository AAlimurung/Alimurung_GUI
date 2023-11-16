package FoodOrderSystem;
import javax.swing.*;

public class FoodOrder extends JFrame{

    private JCheckBox pizzaCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox sundaeCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JPanel panel1;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton orderButton;

    public FoodOrder(){
        FoodOrder am = this;
        orderButton.addActionListener(e -> {
            float sum = 0.0F;
            float total;
            if(pizzaCheckBox.isSelected()){
                sum = sum + 100;
            }
            if(friesCheckBox.isSelected()){
                sum = sum + 65;
            }
            if(burgerCheckBox.isSelected()){
                sum = sum + 80;
            }
            if(softDrinksCheckBox.isSelected()){
                sum = sum + 55;
            }
            if(teaCheckBox.isSelected()){
                sum = sum + 50;
            }
            if(sundaeCheckBox.isSelected()){
                sum = sum + 40;
            }

            if(a5OffRadioButton.isSelected()){
                total = (float) (sum*0.05);
                sum = sum - total;
            } else if (a10OffRadioButton.isSelected()) {
                total = (float) (sum*0.10);
                sum = sum - total;
            }else if(a15OffRadioButton.isSelected()){
                total = (float) (sum*0.15);
                sum = sum - total;
            }
            JOptionPane.showMessageDialog(am, "The total price is Php " + sum);
        });
    }

    public static void main(String[] args) {
        FoodOrder fo = new FoodOrder();
        fo.setContentPane(fo.panel1);
        fo.setSize(680, 280);
        fo.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fo.setVisible(true);
        fo.setTitle("Food Order System");
    }
}
