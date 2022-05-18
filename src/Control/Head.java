package Control;

import Model.InvoiceHead;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Head extends DefaultTableModel {

    private String[] cloNames = {"No.", "Customer Name", "Inv Date", "Total"};
    private ArrayList<InvoiceHead> invoices;

    public Head(ArrayList<InvoiceHead> invoices) {
        this.cloNames = cloNames;
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        if(this.invoices ==null){
            invoices=new  ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public int getColumnCount() {return cloNames.length;}
    @Override
    public void removeRow(int row) {invoices.remove(row);}

    @Override
    public Object getValueAt(int row, int cloume) {

        InvoiceHead inv = invoices.get(row);
        switch (cloume) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCustomerName();
            case 2:
                return inv.getDate();
            case 3:
                return inv.getInvTotal();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {return cloNames[column];}

    public ArrayList<InvoiceHead> getInvoices() {return invoices;}
}
