import javax.swing.*;
import java.awt.*;

class AddCustomerForm extends JFrame {

    private JLabel lblTitle;
    private JButton btnAdd;
    private JButton btnCancel;

    private JLabel lblId;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;

    private JTextField txtId;
    private JTextField txtName;
    private JTextField txtAddress;
    private JTextField txtSalary;

    AddCustomerForm() {
        setSize(400, 300);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitle = new JLabel("Add Cutomer Form");
        lblTitle.setFont(new Font("", 1, 30));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        //button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnAdd = new JButton("Add Custometr");
        btnAdd.setFont(new Font("", 1, 20));
        buttonPanel.add(btnAdd);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 20));
        buttonPanel.add(btnCancel);

        add("South", buttonPanel);
//label
        JPanel labelPanel = new JPanel(new GridLayout(4, 1));
        lblId = new JLabel("Customer ID : ");
        lblId.setFont(new Font("", 1, 20));
        labelPanel.add(lblId);

        lblName = new JLabel("Name : ");
        lblName.setFont(new Font("", 1, 20));
        labelPanel.add(lblName);

        lblAddress = new JLabel("Address : ");
        lblAddress.setFont(new Font("", 1, 20));
        labelPanel.add(lblAddress);

        lblSalary = new JLabel("Salary : ");
        lblSalary.setFont(new Font("", 1, 20));
        labelPanel.add(lblSalary);

        add("West", labelPanel);


        //text
        JPanel textPanel = new JPanel(new GridLayout(4, 1));

        txtId = new JTextField(5);
        txtId.setFont(new Font("", 1, 20));
        textPanel.add(txtId);

        txtName = new JTextField(13);
        textPanel.setFont(new Font("", 1, 20));
        textPanel.add(txtName);

        txtAddress = new JTextField(13);
        txtAddress.setFont(new Font("", 1, 20));
        textPanel.add(txtAddress);

        txtSalary = new JTextField(6);
        txtSalary.setFont(new Font("", 1, 20));
        textPanel.add(txtSalary);

        add("East", textPanel);

    }
}

/*
 * class DeleteCustomerForm extends JFrame {
 * private JLabel lblTitle;
 * DeleteCustomerForm() {
 * setSize(400, 300);
 * setTitle("Delete Customer Form");
 * setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 * setLocationRelativeTo(null);
 * 
 * lblTitle = new JLabel("Delete Cutomer Form");
 * lblTitle.setFont(new Font("", 1, 30));
 * lblTitle.setHorizontalAlignment(JLabel.CENTER);
 * add("North", lblTitle);
 * }
 * }
 */
public class Demo {

    public static void main(String[] args) {
        new AddCustomerForm().setVisible(true);
        // new DeleteCustomerForm().setVisible(true);
    }
}