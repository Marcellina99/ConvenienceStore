package org.codewithjindu.services;

import org.codewithjindu.models.Applicant;
import org.codewithjindu.models.Cashier;
import org.codewithjindu.models.Product;
import org.codewithjindu.models.Store;

public interface ManagerService {

//    Manager should be able to hire, sack and pay employees(cashiers) salaries...
    String hireCashier(Store store, Applicant applicant);

    String sackStaff(Store store, Cashier cashier);
    String restockProducts(Store store, Product products);
}
