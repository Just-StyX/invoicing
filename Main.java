package org.jbdev;

import org.jbdev.config.SecurityConfig;
import org.jbdev.entities.Invoice;
import org.jbdev.services.InvoiceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Customer Name: ");
            String customer = input.nextLine();

            System.out.print("Enter Item Name: ");
            String itemPurchased = input.nextLine();

            System.out.print("Enter price of item purchased: ");
            double priceOfItem = input.nextDouble();

            System.out.print("Enter number of quantities purchased: ");
            int quantityPurchased = input.nextInt();

            Invoice invoice = new Invoice(customer, itemPurchased, quantityPurchased, priceOfItem);

            var context = new AnnotationConfigApplicationContext(SecurityConfig.class);
            var invoiceService = context.getBean(InvoiceService.class);

            invoiceService.sendNotification(invoice);
        }
    }
}