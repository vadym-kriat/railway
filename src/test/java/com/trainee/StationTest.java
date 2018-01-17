package com.trainee;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;


public class StationTest {

    @Test
    public void testSetNameStation() throws NoSuchFieldException, IllegalAccessException {
        final String name = "Some";
        final Station station = new Station();
        station.setName(name);

        final Field field = station.getClass().getDeclaredField("name");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(station), name);
    }

    @Test
    public void testGetNameStation() throws NoSuchFieldException, IllegalAccessException {
        final String name = "Some";
        final Station station = new Station();

        final Field field = station.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(station, name);

        assertEquals("Field wasn't retrieved properly", station.getName(), name);
    }

    @Test
    public void testSetIdStation() throws NoSuchFieldException, IllegalAccessException {
        final Long id = 1L;
        final Station station = new Station();
        station.setId(id);

        final Field field = station.getClass().getDeclaredField("id");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(station), id);
    }

    @Test
    public void testGetIdStation() throws NoSuchFieldException, IllegalAccessException {
        final Long id = 1L;
        final Station station = new Station();

        final Field field = station.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(station, id);

        assertEquals("Field wasn't retrieved properly", station.getId(), id);
    }
}
