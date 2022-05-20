package org.codewithjindu.services;

import org.codewithjindu.enums.Role;
import org.codewithjindu.models.Store;

public interface ApplicantService {
    String apply(Store store, Role role);
}
