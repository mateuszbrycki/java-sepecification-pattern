package com.mateuszbrycki.service;

import com.mateuszbrycki.model.Role;
import com.mateuszbrycki.model.User;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class AccessService {

    public Boolean isAllowed(User user) {
        Role role = user.getRole();

        return role.equals(Role.ADMINISTRATOR) || (role.equals(Role.REGULAR) && user.getAge() > 18);
    }
}
