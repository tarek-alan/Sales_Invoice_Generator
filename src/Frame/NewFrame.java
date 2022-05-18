package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Control.Head;
import Model.InvoiceHead;
import Model.InvoiceLine;
import Control.Line;

public class NewFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private ArrayList<InvoiceHead> invoices = new ArrayList<>();
    private ArrayList<InvoiceLine> invoiceLines = new ArrayList<>();
    private Head headerTabelModel;
    private Line linesTabelModel;
    private NewItem newInvDialog;
    private NewLine newInLineDialog;

    public NewFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        createNewInvoice = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateNewItem = new javax.swing.JButton();
        delItem = new javax.swing.JButton();
        InvDatetextF = new javax.swing.JTextField();
        InvCustomerNameTestF = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        LineTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "No.", "Date", "Customer", "Total"
                }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        createNewInvoice.setBackground(new java.awt.Color(51, 51, 51));
        createNewInvoice.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        createNewInvoice.setForeground(new java.awt.Color(0, 51, 255));
        createNewInvoice.setText("Create New Invoice");
        createNewInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewInvoiceActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 255));
        jButton2.setText("Delete Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Invoices Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addGap(12, 12, 12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(142, 142, 142)
                                                .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(createNewInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(114, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel2.setText("Invoice Number");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel3.setText("Invoice Date");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel4.setText("Customer Name");

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        jLabel6.setText("Invoice Total");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 153, 255));
        jLabel8.setText("Invoice Line");

        CreateNewItem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        CreateNewItem.setForeground(new java.awt.Color(0, 51, 102));
        CreateNewItem.setText("Save");
        CreateNewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateNewItemActionPerformed(evt);
            }
        });

        delItem.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        delItem.setForeground(new java.awt.Color(0, 51, 102));
        delItem.setText("Cancel");
        delItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delItemActionPerformed(evt);
            }
        });

        InvDatetextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDatetextFActionPerformed(evt);
            }
        });

        LineTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String [] {
                        "No.", "Item Name", "Item Price", "Count", "Item Total"
                }
        ));
        LineTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(LineTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addGap(80, 80, 80)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5)
                                                        .addComponent(InvDatetextF, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                                                        .addComponent(InvCustomerNameTestF))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(CreateNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delItem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(InvDatetextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(InvCustomerNameTestF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addGap(52, 52, 52)
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                                .addGap(185, 185, 185))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(CreateNewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(delItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(109, 109, 109))))
        );

        jMenu1.setText("File");

        loadFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK));
        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFileMenuItem.setText("Save File");
        saveFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {deleteInv();}

    private void InvDatetextFActionPerformed(java.awt.event.ActionEvent evt) {}

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            loadfile();
        } catch (Exception ex) {
            Logger.getLogger(NewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadfile() throws Exception {
        invoices.clear();
        invoiceLines.clear();

        JOptionPane.showMessageDialog(this, "Select Invoices header file", "Invoice Head", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        File selectFile;
        if (option == JFileChooser.APPROVE_OPTION) {
            selectFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerLine = line.split(",");
                int invNum = Integer.parseInt(headerLine[0]);
                Date invdate = df.parse(headerLine[1]);
                String custName = headerLine[2];
                InvoiceHead header = new InvoiceHead(invNum, invdate, custName);
                invoices.add(header);
            }
            br.close();
            fr.close();
        }

        JOptionPane.showMessageDialog(this, " Select Invoice Lines file", "Inv Lines", JOptionPane.WARNING_MESSAGE);
        option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            selectFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] InvoiceLines = line.split(",");
                int invNum = Integer.parseInt(InvoiceLines[0]);
                String CustomerName = InvoiceLines[1];
                double price = Double.parseDouble(InvoiceLines[2]);
                int count = Integer.parseInt(InvoiceLines[3]);
                InvoiceHead header = findByNumHeader(invNum);
                InvoiceLine Invline = new InvoiceLine(CustomerName, price, count, header);
                header.addLine(Invline);
            }
            br.close();
            fr.close();
            System.out.println("check line");
            headerTabelModel = new Head(invoices);
            headerTabelModel = new Head(invoices);
            headerTable.setModel(headerTabelModel);
            headerTable.validate();
        }
    }
    private InvoiceHead findByNumHeader(int headerNum) {

        for (InvoiceHead header : invoices) {
            if (header.getNum() == headerNum) {
                return header;
            }
        }

        return null;
    }
    private void createNewInvoiceActionPerformed(java.awt.event.ActionEvent evt) {createNewINv();}
    private void saveFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            savefile();
        } catch (Exception ex) {
            Logger.getLogger(NewFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CreateNewItemActionPerformed(java.awt.event.ActionEvent evt) {createNewItems();}

    private void delItemActionPerformed(java.awt.event.ActionEvent evt) {deleteItem();}

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton CreateNewItem;
    private javax.swing.JTextField InvCustomerNameTestF;
    private javax.swing.JTextField InvDatetextF;
    private javax.swing.JTable LineTable;
    private javax.swing.JButton createNewInvoice;
    private javax.swing.JButton delItem;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerRowSelect();
    }

    private void headerRowSelect() {
        int indexrow = headerTable.getSelectedRow();
        if (indexrow >= 0) {
            InvoiceHead rowselect = headerTabelModel.getInvoices().get(indexrow);
            InvCustomerNameTestF.setText(rowselect.getCustomerName());
            InvDatetextF.setText(rowselect.getDate().toString());
            jLabel5.setText("" + rowselect.getNum());
            jLabel7.setText("" + rowselect.getInvTotal());
            ArrayList<InvoiceLine> lines = rowselect.getLines();
            linesTabelModel = new Line(lines);
            LineTable.setModel(linesTabelModel);
            linesTabelModel.fireTableDataChanged();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("createOk")) {
            createOkInv();
        } else if (e.getActionCommand().equals("createCancel")) {
            createcancelInv();
        } else if (e.getActionCommand().equals("createItemOk")) {
            createOkItem();
        } else if (e.getActionCommand().equals("createItemCancel")) {
            createcancelItem();
        }

    }
    private void createNewINv() {

        newInvDialog = new NewItem(this);
        newInvDialog.setVisible(true);

    }
    private void createNewItems() {
        newInLineDialog = new NewLine(this);
        newInLineDialog.setVisible(true);
    }
    private void createOkInv() {
        String customername = newInvDialog.getCustomerNameTF().getText();
        String invdateString = newInvDialog.getInvoiceDateTF().getText();
        Date invdate = new Date();
        try {
            Date inDate = df.parse(invdateString);
        } catch (ParseException ex) {
        }
        newInvDialog.setVisible(false);

        int newNumber = getMaxNumber();
        InvoiceHead headerNew = new InvoiceHead(newNumber, invdate, customername);
        invoices.add(headerNew);
        headerTabelModel.fireTableDataChanged();

    }

    private void createcancelInv() {
        newInvDialog.setVisible(false);
    }

    private int getMaxNumber() {
        int num = 0;
        for (InvoiceHead header : invoices) {

            if (header.getNum() > num) {
                num = header.getNum();
            }
        }

        return num + 1;
    }

    private void createcancelItem() {
        newInLineDialog.setVisible(false);
    }

    private void deleteInv() {
        int indexrow = headerTable.getSelectedRow();
        headerTabelModel.removeRow(indexrow);
        headerTabelModel.fireTableDataChanged();
        linesTabelModel.fireTableDataChanged();

    }

    private void savefile() throws Exception {
        //for Header Tabel
        JOptionPane.showMessageDialog(this, "Please Chosce File Header to Save", "Invooice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fileChoosers = new JFileChooser();
        int option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfile = fileChoosers.getSelectedFile();
            PrintWriter out = new PrintWriter(Csvfile);

            for (InvoiceHead header : invoices) {
                out.printf("%d,%s,%s",header.getNum(),header.getDate().toString(),header.getCustomerName());
                out.println();
            }
            out.close();
            JOptionPane.showMessageDialog(this, "Successfully Header Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "Please Chosce File Line to Save", "Invooice Line", JOptionPane.WARNING_MESSAGE);
        fileChoosers = new JFileChooser();
        option = fileChoosers.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File Csvfilee = fileChoosers.getSelectedFile();
            PrintWriter outt = new PrintWriter(Csvfilee);


            for (InvoiceHead header : invoices) {
                for(InvoiceLine Lines :header.getLines()){
                    outt.printf("%s ,%s,%d",Lines.getProduct(),""+Lines.getPrice(),Lines.getCount());
                    outt.println();
                }}
            outt.close();
            JOptionPane.showMessageDialog(this, "Successfully Lines Saved", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void deleteItem() {
        int indexrow = LineTable.getSelectedRow();
        linesTabelModel.removeRow(indexrow);
        linesTabelModel.fireTableDataChanged();

    }

    private void createOkItem() {
        String itemNameS = newInLineDialog.getItemNameTF().getText();
        String itemCountS = newInLineDialog.getItemCountTF().getText();
        String itemPriceS = newInLineDialog.getItemPriceTF().getText();
        int itemCount = Integer.parseInt(itemCountS);
        double itemPrice = Double.parseDouble(itemPriceS);

        newInLineDialog.setVisible(false);

        int row = headerTable.getSelectedRow();
        if (row >= 0) {
            InvoiceHead header = invoices.get(row);
            InvoiceLine li = new InvoiceLine(itemNameS, itemPrice, itemCount, header);
            header.addLine(li);

            linesTabelModel.fireTableDataChanged();
            headerTabelModel.fireTableDataChanged();
        }
    }
}
