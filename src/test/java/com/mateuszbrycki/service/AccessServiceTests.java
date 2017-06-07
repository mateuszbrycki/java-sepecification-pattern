package com.mateuszbrycki.service;

import com.mateuszbrycki.model.Role;
import com.mateuszbrycki.model.User;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Mateusz Brycki on 07/06/2017.
 */
public class AccessServiceTests {

    private AccessService service = new AccessService();

    @Test
    public void testRegularUserWithAgeAbove18() {
        User user = new User(Role.REGULAR, 19L);

        assertTrue(service.isAllowed(user));
    }

    @Test
    public void testRegularUserWithAgeUnder18() {
        User user = new User(Role.REGULAR, 17L);

        assertFalse(service.isAllowed(user));
    }

    @Test
    public void testAdministratorUserWithAgeUnder18() {
        User user = new User(Role.ADMINISTRATOR, 17L);

        assertTrue(service.isAllowed(user));
    }


    @Test
    public void testAdministratorUserWithAgeAbove18() {
        User user = new User(Role.ADMINISTRATOR, 19L);

        assertTrue(service.isAllowed(user));
    }
}
