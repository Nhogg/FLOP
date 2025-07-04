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

    private ConcurrentHashMap<BackendServer, Boolean> checkHealth() {
        // Should call healthChecker.checkHealth() to retrieve the health status of each server
        // Should update serverList with the health status
        //
    }

    private void route(Request request) {
        // Should do other operations to route the request
    }




}
