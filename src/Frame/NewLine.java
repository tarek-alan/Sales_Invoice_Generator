package Frame;

import Frame.NewFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewLine extends JDialog {

    private JTextField ItemNameTF;
    private JLabel ItemNameLabel;

    private JTextField ItemCountTF;
    private JLabel ItemCountLabel;

    private JTextField ItemPriceTF;
    private JLabel ItemPriceLabel;

    private JButton OkBtn;
    private JButton CancelBtn;

    public NewLine(NewFrame frame) {


        ItemNameLabel = new JLabel("Item Name : ");
        ItemNameTF = new JTextField(20);

        ItemCountLabel = new JLabel("Count : ");
        ItemCountTF = new JTextField(20);

        ItemPriceLabel = new JLabel("Item Price : ");
        ItemPriceTF = new JTextField(20);

        OkBtn = new JButton("Ok");
        CancelBtn = new JButton("Cancel");

        OkBtn.setActionCommand("createItemOk");
        CancelBtn.setActionCommand("createItemCancel");

        OkBtn.addActionListener(frame);
        CancelBtn.addActionListener(frame);

        setLayout(new GridLayout(4, 2));
        setSize(200, 200);
        setLocation(200, 300);

        add(ItemNameLabel);
        add(ItemNameTF);
        add(ItemCountLabel);
        add(ItemCountTF);
        add(ItemPriceLabel);
        add(ItemPriceTF);
        add(OkBtn);
        add(CancelBtn);

        pack();

    }

    public JTextField getItemNameTF() {return ItemNameTF;}

    public JTextField getItemCountTF() {return ItemCountTF;}

    public JTextField getItemPriceTF() {return ItemPriceTF;}
}