package com.trainee;

import org.junit.Test;

import java.lang.reflect.Field;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vadim_ on 16.01.2018.
 */
public class NodeTest {

    @Test
    public void testSetStationNode() throws NoSuchFieldException, IllegalAccessException {
        final Station station = new Station();
        final Node node = new Node();
        node.setStation(station);

        final Field field = node.getClass().getDeclaredField("station");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(node), station);
    }

    @Test
    public void testGetStationNode() throws NoSuchFieldException, IllegalAccessException {
        final Station station = new Station();
        final Node node = new Node();

        final Field field = node.getClass().getDeclaredField("station");
        field.setAccessible(true);
        field.set(node, station);

        assertEquals("Field wasn't retrieved properly", node.getStation(), station);
    }

    @Test
    public void testSetArrivalTimeNode() throws NoSuchFieldException, IllegalAccessException {
        final LocalTime arrivalTime = LocalTime.of(12, 53);
        final Node node = new Node();
        node.setArrivalTime(arrivalTime);

        final Field field = node.getClass().getDeclaredField("arrivalTime");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(node), arrivalTime);
    }

    @Test
    public void testGetArrivalTimeNode() throws NoSuchFieldException, IllegalAccessException {
        final LocalTime arrivalTime = LocalTime.of(12, 53);
        final Node node = new Node();

        final Field field = node.getClass().getDeclaredField("arrivalTime");
        field.setAccessible(true);
        field.set(node, arrivalTime);

        assertEquals("Field wasn't retrieved properly", node.getArrivalTime(), arrivalTime);
    }

    @Test
    public void testSetDepartureTimeNode() throws NoSuchFieldException, IllegalAccessException {
        final LocalTime departureTime = LocalTime.of(12, 53);
        final Node node = new Node();
        node.setDepartureTime(departureTime);

        final Field field = node.getClass().getDeclaredField("departureTime");
        field.setAccessible(true);

        assertEquals("Fields didn't match", field.get(node), departureTime);
    }

    @Test
    public void testGetDepartureTimeNode() throws NoSuchFieldException, IllegalAccessException {
        final LocalTime departureTime = LocalTime.of(12, 53);
        final Node node = new Node();

        final Field field = node.getClass().getDeclaredField("departureTime");
        field.setAccessible(true);
        field.set(node, departureTime);

        assertEquals("Field wasn't retrieved properly", node.getDepartureTime(), departureTime);
    }
}
