package com.traffic.simulator.engine;

import com.traffic.simulator.entity.vehicle.PriorityVehicle;
import com.traffic.simulator.entity.vehicle.Vehicle;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

public class Intersection {
    private final Semaphore semaphore;
    private final LinkedBlockingQueue<Vehicle> waitingQueue;
    private final int MAX_QUEUE_SIZE;

    private TrafficLight trafficLight;

    public Intersection(TrafficLight trafficLight, int MAX_QUEUE_SIZE, LinkedBlockingQueue<Vehicle> waitingQueue, Semaphore semaphore) {
        this.trafficLight = trafficLight;
        this.MAX_QUEUE_SIZE = MAX_QUEUE_SIZE;
        this.waitingQueue = waitingQueue;
        this.semaphore = semaphore;
    }

    public void enter(Vehicle vehicle) {



    }
}
