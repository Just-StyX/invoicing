package org.jbdev.proxy;

import org.jbdev.entities.Invoice;

public interface CustomerEmail {
    public void sendEmail(Invoice invoice);
}
