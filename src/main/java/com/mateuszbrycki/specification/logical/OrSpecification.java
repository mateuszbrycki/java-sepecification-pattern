package com.mateuszbrycki.specification.logical;

import com.mateuszbrycki.specification.AbstractSpecification;
import com.mateuszbrycki.specification.Specification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class OrSpecification<T> extends AbstractSpecification<T> {

    private Specification<T> first;
    private Specification<T> second;

    public OrSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    public Boolean isSatisfiedBy(T candidate) {
        return first.isSatisfiedBy(candidate) || second.isSatisfiedBy(candidate);
    }
}
