package com.qu1etboy.basic.services.carnival;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CarnivalTest {

    private Carnival carnival;

    @Before
    public void setUp() {
        carnival = new Carnival();
    }

    @Test
    public void testJoin() {
        User alice = new User("Alice", 18);
        User bob = new User("Bob", 29);

        carnival.join(alice);
        carnival.join(bob);

        assertEquals(2, carnival.getUsers().size());
    }

    @Test
    public void testJoinUnder18() {
        User tom = new User("Tom", 17);

        assertThrows(IllegalArgumentException.class, () -> carnival.join(tom));
    }
}