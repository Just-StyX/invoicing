package org.jbdev.services;

import org.jbdev.entities.Invoice;
import org.jbdev.proxy.CustomerEmail;
import org.jbdev.repositories.ThankYouMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private final CustomerEmail customerEmail;

    private final ThankYouMessage thankYouMessage;

    @Autowired
    public InvoiceService(CustomerEmail customerEmail, ThankYouMessage thankYouMessage) {
        this.customerEmail = customerEmail;
        this.thankYouMessage = thankYouMessage;
    }

    public void sendNotification(Invoice invoice) {
        customerEmail.sendEmail(invoice);
        thankYouMessage.thankYou(invoice);
    }
}
