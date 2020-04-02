package com.ps.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HeroTest {

    @Test
    void testMessionProfession() {
        assertThrows(IllegalArgumentException.class, () -> new Hero.Builder("Sir without a job", null));
    }

}