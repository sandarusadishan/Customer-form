import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Scanner;

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
        lblTitle.setFont(new Font("", 1, 25));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        // button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnAdd = new JButton("Add");
        btnAdd.setFont(new Font("", 1, 20));
        buttonPanel.add(btnAdd);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("", 1, 20));
        buttonPanel.add(btnCancel);

        add("South", buttonPanel);
        // label
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

        // text
        JPanel textPanel = new JPanel(new GridLayout(4, 1));

        JPanel idTextJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtId = new JTextField(5);
        txtId.setFont(new Font("", 1, 20));
        idTextJPanel.add(txtId);
        textPanel.add(idTextJPanel);

        JPanel nameTextJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtName = new JTextField(10);
        txtName.setFont(new Font("", 1, 20));
        nameTextJPanel.add(txtName);
        textPanel.add(nameTextJPanel);

        JPanel addreesTextJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtAddress = new JTextField(13);
        txtAddress.setFont(new Font("", 1, 20));
        addreesTextJPanel.add(txtAddress);
        textPanel.add(addreesTextJPanel);

        JPanel salaryTextJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtSalary = new JTextField(6);
        txtSalary.setFont(new Font("", 1, 20));
        salaryTextJPanel.add(txtSalary);
        textPanel.add(salaryTextJPanel);

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

class ViewCustomerForm extends JFrame {

    private JLabel lblTitle;
    private JTable tblCustomer;
    private DefaultTableModel dtm;
    private JButton btnReload;

    ViewCustomerForm() {
        setSize(400, 300);
        setTitle("View Customer Form");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitle = new JLabel("View Customer Form");
        lblTitle.setFont(new Font("", 1, 25));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add("North", lblTitle);

        String[] columnName = { "Customer ID", "Name", "Address", "Salary" };
        dtm = new DefaultTableModel(columnName, 0);
        tblCustomer = new JTable(dtm);
        JScrollPane tablePane = new JScrollPane(tblCustomer);
        add("Center", tablePane);

        Object[] rowData = { "C001", "Niroth", "Panadura", "50000" };
        dtm.addRow(rowData);

        btnReload = new JButton("Reload");
        btnReload.setFont(new Font("", 1, 20));
        JPanel buttoPanel = new JPanel();
        buttoPanel.add(btnReload);
        btnReload.addActionListener(new ActionListener() {
            public void actionPerformed(ActiveEvent evt) {
                Scanner input = new Scanner(System.in);
                System.out.println("Input Customer ID : ");
                String id = input.nextLine();

                System.out.println("Input Customer Name : ");
                String name = input.nextLine();

                System.out.println("Input Customer Address : ");
                String address = input.nextLine();

                System.out.println("Input Customer Salary : ");
                double salary = input.nextDouble();

            Object[] rowData = {id,name ,address,salary};
            dtm.addRow(rowData);

            }
        });
        add("South", buttoPanel);
    }
}

public class Demo {
    public static void main(String[] args) {
        new AddCustomerForm().setVisible(true);
        new ViewCustomerForm().setVisible(true);
    }
}
  