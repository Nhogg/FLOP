package com.loadbalancer.routers;

public interface RequestRouter {
    BackendServer chooseServer(List<BackendServer> healthyServers);


}
