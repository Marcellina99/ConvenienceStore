package org.codewithjindu.services;

import org.codewithjindu.models.Customer;

public interface CashierService {
    String sellProducts(Customer customer);
    String dispenseReceipts(Customer customer);
}
