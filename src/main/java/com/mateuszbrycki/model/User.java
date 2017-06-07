package com.mateuszbrycki.model;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class User {

    private Role role;
    private Long age;

    public User(Role role, Long age) {
        this.role = role;
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public Long getAge() {
        return age;
    }
}
