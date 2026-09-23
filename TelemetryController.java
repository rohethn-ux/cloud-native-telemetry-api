package com.roheth.infrastructure.telemetry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/telemetry")
public class TelemetryController {

    @GetMapping("/status")
    public Map<String, Object> getClusterStatus() {
        Map<String, Object> metrics = new HashMap<>();
        metrics.put("status", "HEALTHY");
        metrics.put("clusterNode", "ap-south-1a-mumbai");
        metrics.put("cpuUsage", "24.5%");
        metrics.put("memoryAllocated", "512MB");
        metrics.put("activeContainers", 2);
        metrics.put("message", "Telemetry collection fully active.");
        return metrics;
    }
}
