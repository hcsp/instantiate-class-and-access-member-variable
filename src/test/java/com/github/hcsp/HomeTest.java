package com.github.hcsp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void testNewCat() {
        Assertions.assertEquals("Cat(Black)", Home.newCat("Black").toString());
    }
}
