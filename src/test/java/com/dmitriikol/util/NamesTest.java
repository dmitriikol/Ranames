package com.dmitriikol.util;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static org.junit.Assert.*;

public class NamesTest {

    Names names;

    @Before
    public void init() {
        names = new Names();
    }

    @Test
    public void testGetNamesNotPar() {
        Map<String, Gender> map = names.getNames();
        int size = map.size();
        assertTrue(size > 0);
    }

    @Test
    public void testGetNames1Par() {
        Map<String, Gender> map = names.getNames(Gender.FEMALE);
        int size = map.size();
        assertTrue(size > 0);
    }

    @Test
    public void testGetNames2Par() {
        Map<String, Gender> map = names.getNames(Region.RUSSIA, Gender.FEMALE);
        int size = map.size();
        assertTrue(size > 0);
    }

    @Test
    public void getRegion() {
        Region region = names.getRegion("Дмитрий");
        assertTrue(region == Region.RUSSIA);
    }

    @Test
    public void getRegion2() {
        Region region = names.getRegion("Paul");
        System.out.println(region.toString());
        assertTrue(region == Region.GERMANY);
    }
}