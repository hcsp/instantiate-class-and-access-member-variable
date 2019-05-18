package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCat() {
        assertEquals("Cat(Black)", Home.newCat("Black").toString());
    }
}
