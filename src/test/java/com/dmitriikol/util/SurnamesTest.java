package com.dmitriikol.util;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class SurnamesTest {

    @Test
    public void getSurnames() {
        Surnames sur = new Surnames();
        assertNotNull(sur.getSurnames(Region.RUSSIA));
        assertNotNull(sur.getSurnames(Region.USA));
        assertNotNull(sur.getSurnames(Region.FRANCE));
        assertNotNull(sur.getSurnames(Region.GERMANY));
        assertNotNull(sur.getSurnames(Region.POLAND));
    }
}