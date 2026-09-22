package com.roheth.infrastructure.telemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelemetryApplication {
    public static void main(String[] args) {
        System.out.println("⚡ Bootstrapping Cloud-Native Telemetry Engine...");
        SpringApplication.run(TelemetryApplication.class, args);
    }
}
