package com.trainee;

import org.junit.*;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vadim_ on 16.01.2018.
 */
public class RouteTest {
    private Route route;
    private static Node testNode;

    @BeforeClass
    public static void setUpTestNode() {
        testNode = new Node();
        testNode.setStation(new Station("Dao"));
        testNode.setArrivalTime(LocalTime.of(10, 8));
        testNode.setDepartureTime(LocalTime.of(15, 23));
    }

    @AfterClass
    public static void tearDownTestNode() {
        testNode = null;
    }

    @Before
    public void setUp() {
        route = new Route();
        route.addNode(testNode);
    }

    @After
    public void tearDown() {
        route = null;
    }

    @Test
    public void testAddNodeToRoute() {
        final Node node = new Node();
        assertEquals(1, route.length());
        route.addNode(node);
        assertEquals(2, route.length());
        assertEquals(node, route.getNode(route.length() - 1));
    }

    @Test
    public void testReplaceNodeToRoute() {
        final Node node = new Node();
        assertEquals(1, route.length());
        route.replaceNode(0, node);
        assertEquals(1, route.length());
        assertEquals(node, route.getNode(0));
    }

    @Test
    public void testRemoveNodeFromRouteByObject() {
        assertEquals(1, route.length());
        route.removeNode(testNode);
        assertEquals(0, route.length());
    }

    @Test
    public void testRemoveNodeFromRouteByPosition() {
        assertEquals(1, route.length());
        route.removeNode(0);
        assertEquals(0, route.length());
    }

    @Test
    public void testGetFirsNodeFromRoute() {
        assertEquals(1, route.length());
        assertEquals(testNode, route.getFirstNode());
    }

    @Test
    public void testGetLastNodeFromRoute() {
        assertEquals(1, route.length());
        assertEquals(testNode, route.getLastNode());
    }
}
