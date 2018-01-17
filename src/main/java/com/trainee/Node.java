package com.trainee;

import java.time.LocalTime;

/**
 * Created by Vadim_ on 16.01.2018.
 */
public class Node {
    private Station station;
    private LocalTime arrivalTime;
    private LocalTime departureTime;

    public Node() {
    }

    public Node(Station station, LocalTime arrivalTime, LocalTime departureTime) {
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
}
