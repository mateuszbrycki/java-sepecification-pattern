package com.mateuszbrycki.service.specification;

import com.mateuszbrycki.model.User;
import com.mateuszbrycki.specification.AbstractSpecification;
import com.mateuszbrycki.specification.Specification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class IsAllowed extends AbstractSpecification<User> {

    private Specification<User> isAdministrator;
    private Specification<User> isRegular;
    private Specification<User> isAbove18;

    public IsAllowed() {
        this.isAdministrator = new IsAdministrator();
        this.isRegular = new IsRegular();
        this.isAbove18 = new IsAbove18();
    }

    public Boolean isSatisfiedBy(User candidate) {
        return isAdministrator.or(isRegular.and(isAbove18)).isSatisfiedBy(candidate);
    }
}
