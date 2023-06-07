package org.jbdev.repositories;

import org.jbdev.entities.Invoice;
import org.springframework.stereotype.Component;

@Component
public class ThankYouMessageImpl implements ThankYouMessage{
    @Override
    public void thankYou(Invoice invoice) {
        System.out.println("Than you " + invoice.getCustomer() + " for shopping with jbdev.");
    }
}
