package com.mateuszbrycki.specification;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public interface Specification<T> {
    Boolean isSatisfiedBy(T candidate);

    Specification<T> and(Specification<T> other);
    Specification<T> or(Specification<T> other);
}
