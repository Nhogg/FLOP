package com.loadbalancer;

import com.loadbalancer.health.HealthChecker;

import java.util.concurrent.ConcurrentHashMap;

public class LoadBalancer {
    private final ConcurrentHashMap<BackendServer, Boolean> serverList = new ConcurrentHashMap<>();
    private HealthChecker healthChecker;

    public void start() {
        // Needs to call checkHealth immediately
        // Needs to initialize serverList from config/servers.json
        // Needs to awaken both threads
    }

    private void checkHealth() {
        // Should call healthChecker.checkOnce() to retrieve the health status of each server
        // Should update serverList with the health status
        if (healthChecker != null) {
            healthChecker.checkOnce();
        }
    }


    private Boolean route(Request request) {


        return routeToHealthyServer(request);
    }




}

// Removed Implementations
// Removed due to concerns about thread safety and concurrency issues
//    private ConcurrentHashMap<BackendServer, Boolean> checkHealth() {
//        // Should call healthChecker.checkHealth() to retrieve the health status of each server
//        // Should update serverList with the health status
//        //
//    }
