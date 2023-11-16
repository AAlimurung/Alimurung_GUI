package FoodOrderSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame{

    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;

    public FoodOrder(){
        FoodOrder am = this;

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
