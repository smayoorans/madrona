package org.madrona.effective.java.chapter2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private static Map<String, String> serviceProviders = new ConcurrentHashMap<>();

    public static void register(String name, String providerService) {
        serviceProviders.put(name, providerService);
    }

    public static String newInstance(String name) {
        String providerService = serviceProviders.get(name);
        return providerService;
    }
}
