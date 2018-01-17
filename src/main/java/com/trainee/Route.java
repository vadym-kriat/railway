package com.trainee;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vadim_ on 16.01.2018.
 */
public class Route {
    private Long id;
    private Train train;
    private List<Node> route;

    public Route() {
        route = new ArrayList<>();
    }

    public Route(Train train) {
        this();
        this.train = train;
    }

    public Route(Long id, Train train) {
        this();
        this.id = id;
        this.train = train;
    }

    public void addNode(Node node) {
        route.add(node);
    }

    public void replaceNode(int position, Node node) {
        route.set(position, node);
    }

    public void removeNode(Node node) {
        route.remove(node);
    }

    public void removeNode(int position) {
        route.remove(position);
    }

    public Node getFirstNode() {
        return route.get(0);
    }

    public Node getLastNode() {
        return route.get(route.size() - 1);
    }

    public LocalTime getArrivalTime() {
        return getLastNode().getArrivalTime();
    }

    public LocalTime getDepartureTime() {
        return getFirstNode().getDepartureTime();
    }

    public Node getNode(int position) {
        return route.get(position);
    }

    public int length() {
        return route.size();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route1 = (Route) o;

        if (id != null ? !id.equals(route1.id) : route1.id != null) return false;
        if (train != null ? !train.equals(route1.train) : route1.train != null) return false;
        return route != null ? route.equals(route1.route) : route1.route == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (train != null ? train.hashCode() : 0);
        result = 31 * result + (route != null ? route.hashCode() : 0);
        return result;
    }
}
