package Model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHead {

    private int Num;
    private Date date;
    private String CustomerName;
    private double InvoiceTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHead(int Num, Date date, String CustomerName) {
        this.Num = Num;
        this.date = date;
        this.CustomerName = CustomerName;
    }

    public String getCustomerName() {return CustomerName;}

    public void setCustomerName(String CustomerName) {this.CustomerName = CustomerName;}

    public int getNum() {return Num;}

    public void setNum(int Num) {this.Num = Num;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}

    public double getInvTotal() {return InvoiceTotal;}

    public void setInvTotal(double InvoiceTotal) {this.InvoiceTotal = InvoiceTotal;}

    public ArrayList<InvoiceLine> getLines() {
        if(lines ==null)
            lines=new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {this.lines = lines;}
    public void addLine(InvoiceLine Li){
        getLines().add(Li);
        setInvTotal(getInvTotal()+Li.getLineTotal());
    }
}
