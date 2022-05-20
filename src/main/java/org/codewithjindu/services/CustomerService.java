package org.codewithjindu.services;

import org.codewithjindu.models.Product;
import org.codewithjindu.models.Store;

public interface CustomerService {
    String addToCart(Store store, Product product, int quantityToBuy);

    String payForPurchase();

}
