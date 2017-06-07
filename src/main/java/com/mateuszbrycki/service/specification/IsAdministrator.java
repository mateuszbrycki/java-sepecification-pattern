package com.mateuszbrycki.service.specification;

import com.mateuszbrycki.model.Role;
import com.mateuszbrycki.model.User;
import com.mateuszbrycki.specification.AbstractSpecification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class IsAdministrator  extends AbstractSpecification<User> {

    public Boolean isSatisfiedBy(User candidate) {
        return candidate.getRole().equals(Role.ADMINISTRATOR);
    }
}

