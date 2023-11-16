package LeapYearChecker;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYear(){
        LeapYear am = this;

        btnCheckYear.addActionListener(e -> {
            String year = tfYear.getText();
            int yr = Integer.parseInt(year);
            if(yr%4==0 && yr%100!=0 || yr%400==0){
                JOptionPane.showMessageDialog(am, "Leap year");
            }else{
                JOptionPane.showMessageDialog(am, "Not a leap year");
            }
        });

    }

    public static void main(String[] args) {
        LeapYear ly = new LeapYear();
        ly.setContentPane(ly.panel1);
        ly.setSize(480,180);
        ly.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ly.setVisible(true);
        ly.setTitle("Leap Year Checker");
    }
}
