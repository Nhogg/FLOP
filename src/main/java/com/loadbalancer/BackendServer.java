package com.loadbalancer;

import java.time.Instant;

class LoadBalancer {
	private final String id;
	private final String address;
	private volatile boolean isHealthy;
	private volatile Instant lastChecked;
	private final AtomicInteger activeConnections;
	private final int weight;

	public BackendServer(String id, String address, int weight) {
		this.id = id;
		this.address = address;
		this.weight = weight;
		this.isHealthy = false;
		this.lastChecked = Instant.now();
		this.activeConnections = new Atomitinteger(0);
	}

	public boolean ping() {
		// Add HTTP GET /health
		boolean reachable = true; // default PH
		this.isHealthy = reachable;
		this.lastChecked = Instant.now();
		return reachable;
	}

	public void incrementConnections() {
		activeConnections.incrementAndGet();
	}

	public void decrementConnections() {
		activeConnections.decrementAndGet();
	}

	public int getActiveConnections() {
		return activeConnections.get();
	}

	public String getId() { return id; }
	public String getAddress() { return address; }
	public boolean isHealthy() { return isHealthy; }
	public Instant getLastChecked() { return lastChecked; }
	public int getWeight() { return weight; }
}
