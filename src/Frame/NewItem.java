package Frame;

import Frame.NewFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewItem extends JDialog {
    private JTextField CustomerNameTF;
    private JTextField InvoiceDateTF;
    private JLabel CustomerNameLabel;
    private JLabel InvoiceDateLabel;
    private JButton SaveBtn;
    private JButton CancelBtn;

    public NewItem(NewFrame frame) {
        CustomerNameLabel = new JLabel("Customer Name : ");
        CustomerNameTF = new JTextField(20);
        InvoiceDateLabel = new JLabel("Inv Date : ");
        InvoiceDateTF = new JTextField(20);
        SaveBtn = new JButton("Save");
        CancelBtn = new JButton("Cancel");

        SaveBtn.setActionCommand("createOk");
        CancelBtn.setActionCommand("createCancel");

        SaveBtn.addActionListener(frame);
        CancelBtn.addActionListener(frame);

        setLayout(new GridLayout(3, 2));
        setSize(200, 200);
        setLocation(200, 300);

        add(CustomerNameLabel);
        add(CustomerNameTF);
        add(InvoiceDateLabel);
        add(InvoiceDateTF);
        add(SaveBtn);
        add(CancelBtn);

        pack();
    }
    public JTextField getCustomerNameTF() {return CustomerNameTF;}

    public JTextField getInvoiceDateTF() {return InvoiceDateTF;}
}