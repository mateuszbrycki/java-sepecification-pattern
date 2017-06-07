package com.mateuszbrycki.specification;

import com.mateuszbrycki.specification.logical.AndSpecification;
import com.mateuszbrycki.specification.logical.OrSpecification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public abstract class AbstractSpecification<T> implements Specification<T> {

    public final Specification<T> and(Specification<T> other) {

        return new AndSpecification<T>(this, other);

    }

    public final Specification<T> or(Specification<T> other) {

        return new OrSpecification<T>(this, other);

    }
}