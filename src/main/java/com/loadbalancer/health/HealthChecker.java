package com.loadbalancer.health;

import com.loadbalancer.BackendServer;

import java.util.concurrent.ConcurrentHashMap;

public class HealthChecker {
    private final ConcurrentHashMap<BackendServer, Boolean> serverList;
    private final long checkInterval;

    public HealthChecker(ConcurrentHashMap<BackendServer, Boolean> serverList, long checkInterval) {
        this.serverList = serverList;
    }

    public void run() {
        for (BackendServer server : serverList.keySet()) {
            boolean isHealthy = ping(server);
            serverList.put(server, isHealthy);
        }
    }

    public void checkOnce() {
        // Called on initial startup
        // Should call healthChecker.checkHealth() to retrieve the health status of each server
        // Should update serverList with the health status
        // Should route the request to a healthy server
        for (BackendServer server : serverList.keySet()) {
            boolean isHealthy = ping(server);
            serverList.put(server, isHealthy);
        }
    }


}
