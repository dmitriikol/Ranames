package com.dmitriikol.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void genderIsValid() {
        assertTrue(Validator.genderIsValid("MALE"));
    }

    @Test
    public void regionIsValid() {
        assertTrue(Validator.regionIsValid("RUSSIA"));
    }
}