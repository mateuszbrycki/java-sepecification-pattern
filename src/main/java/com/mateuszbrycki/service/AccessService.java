package com.mateuszbrycki.service;

import com.mateuszbrycki.model.User;
import com.mateuszbrycki.service.specification.IsAllowed;
import com.mateuszbrycki.specification.Specification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class AccessService {

    private Specification<User> specification;

    public AccessService() {
        this.specification = new IsAllowed();
    }

    public Boolean isAllowed(User user) {
        return specification.isSatisfiedBy(user);
    }
}
