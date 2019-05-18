package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testNewCat() {
        assertEquals("Cat(Black)", Main.newCat("Black").toString());
    }
}
