package org.jbdev.proxy;

import org.jbdev.entities.Invoice;
import org.springframework.stereotype.Component;

@Component
public class CustomerEmailImpl implements CustomerEmail{
    @Override
    public void sendEmail(Invoice invoice) {

        System.out.println(
                "Customer: " + invoice.getCustomer() +
                        "\nItem Purchased: " + invoice.getItemPurchased() +
                        "\nTotal Quantity: " + invoice.getQuantityPurchased() +
                        "\n---------------------------------------" +
                        "\nSub Total: " + invoice.subTotal() +
                        "\n---------------------------------------" +
                        "\nTotal Tax: " + Invoice.TAX * invoice.subTotal() +
                        "\nTotal Amount Due: " + invoice.totalPrice()
        );
        System.out.println("-------------------------------");
    }
}
