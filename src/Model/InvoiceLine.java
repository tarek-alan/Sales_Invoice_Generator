package Model;

import Model.InvoiceHead;

public class InvoiceLine {

    private String product;
    private double price;
    private int count;
    private double lineTotal;
    private InvoiceHead invoice;

    public InvoiceLine(String product, double price, int count, InvoiceHead invoice) {
        this.product = product;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
        this.setLineTotal(this.count*this.price);
    }

    public InvoiceHead getInvoice() {return invoice;}

    public void setInvoice(InvoiceHead invoice) {this.invoice = invoice;}

    public String getProduct() {return product;}

    public void setProduct(String product) {this.product = product;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public int getCount() {return count;}

    public void setCount(int count) {this.count = count;}

    public double getLineTotal() {return lineTotal;}

    public void setLineTotal(double lineTotal) {this.lineTotal = lineTotal;}

}
