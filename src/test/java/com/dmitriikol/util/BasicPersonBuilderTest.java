package com.dmitriikol.util;

import com.dmitriikol.BasicPerson;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BasicPersonBuilderTest {

    Names names;

    @Before
    public void init() {
        names = new Names();
    }

    @Test
    public void testCreateBasicPersons() {
        List<BasicPerson> list = BasicPersonBuilder.createBasicPersons(5);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testCreateBasicPersons1ParRegion() {
        List<BasicPerson> list = BasicPersonBuilder.createBasicPersons(5, Region.RUSSIA);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testCreateBasicPersons1ParGender() {
        List<BasicPerson> list = BasicPersonBuilder.createBasicPersons(5, Gender.MALE);
        assertTrue(list.size() > 0);
    }

    @Test
    public void testCreateBasicPersons2Par() {
        List<BasicPerson> list = BasicPersonBuilder.createBasicPersons(5, Region.RUSSIA, Gender.FEMALE);
        assertTrue(list.size() > 0);
    }

}