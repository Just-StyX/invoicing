package org.jbdev.entities;

import java.util.Date;

public class Invoice {
    private String customer;
    private Date datePurchased;
    private String itemPurchased;
    private int quantityPurchased;
    private double priceOfItem;
    static public final double TAX = 0.05;

    public Invoice() {
        this.datePurchased = new Date();
    }
    public Invoice(String customer, String itemPurchased, int quantityPurchased, double priceOfItem) {
        this.customer = customer;
        this.itemPurchased = itemPurchased;
        this.quantityPurchased = quantityPurchased;
        this.priceOfItem = priceOfItem;
        this.datePurchased = new Date();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(Date datePurchased) {
        this.datePurchased = datePurchased;
    }

    public String getItemPurchased() {
        return itemPurchased;
    }

    public void setItemPurchased(String itemPurchased) {
        this.itemPurchased = itemPurchased;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = priceOfItem;
    }
    public double totalPrice() {
        double priceAndQuantity = this.priceOfItem * this.quantityPurchased;
        double taxes = priceAndQuantity * TAX;
        return priceAndQuantity + taxes;
    }

    public double subTotal() {
        return this.quantityPurchased * this.priceOfItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customer='" + customer + '\'' +
                ", datePurchased=" + datePurchased +
                ", itemPurchased='" + itemPurchased + '\'' +
                ", quantityPurchased=" + quantityPurchased +
                ", priceOfItem=" + priceOfItem +
                ", totalPrice=" + totalPrice() +
                '}';
    }
}
