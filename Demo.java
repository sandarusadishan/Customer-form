import javax.swing.*;
import java.awt.*;

class AddCustomerForm extends JFrame {

    private JLabel lblTitle;

    AddCustomerForm() {
        setSize(400, 300);
        setTitle("Add Customer Form"); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitle = new JLabel("Add Cutomer Form");
        lblTitle.setFont(new Font("", 1, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

    }
}
/*class DeleteCustomerForm extends JFrame {
    private JLabel lblTitle;
    DeleteCustomerForm() {
        setSize(400, 300);
        setTitle("Delete Customer Form"); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitle = new JLabel("Delete Cutomer Form");
        lblTitle.setFont(new Font("", 1, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);
    }
}
*/
public class Demo {

    public static void main(String[] args) {
        new AddCustomerForm().setVisible(true);
      //  new DeleteCustomerForm().setVisible(true);
    }
}