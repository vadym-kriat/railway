package com.trainee;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vadim_ on 16.01.2018.
 */
public class TrainTest {

    @Test
    public void testSetNameTrain() throws NoSuchFieldException, IllegalAccessException {
        final String name = "623/623B";
        final Train train = new Train();
        train.setName(name);

        final Field field = train.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(train), name);
    }

    @Test
    public void testGetNameTrain() throws NoSuchFieldException, IllegalAccessException {
        final String name = "623/623B";
        final Train train = new Train();

        final Field field = train.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(train, name);

        assertEquals("Field wasn't retrieved properly", train.getName(), name);
    }

    @Test
    public void testSetIdTrain() throws NoSuchFieldException, IllegalAccessException {
        final Long id = 1L;
        final Train train = new Train();
        train.setId(id);

        final Field field = train.getClass().getDeclaredField("id");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(train), id);
    }

    @Test
    public void testGetIdTrain() throws NoSuchFieldException, IllegalAccessException {
        final Long id = 1L;
        final Train train = new Train();

        final Field field = train.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(train, id);

        assertEquals("Field wasn't retrieved properly", train.getId(), id);
    }
}