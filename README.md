# Cloud-Native Telemetry & Infrastructure Metrics API

A high-throughput enterprise microservice engineered for cloud infrastructure observability, system cluster tracking, and real-time environment validation.

## 🛠️ Tech Stack & Microservice Architecture
* **Core Framework:** Spring Boot 3.3.4 (Java 17 runtime)
* **Data Abstraction Layer:** Spring Data JPA / Hibernate ORM
* **Database Target Engine:** MySQL 8.0 Relational Instance
* **Containerization Engine:** Docker (Advanced Multi-Stage Builds)
* **System Orchestration:** Docker Compose (Decoupled multi-service network)

## 🚀 Key Engineering & DevOps Features
* **Multi-Stage Container Optimization:** Utilizes distinct build-cache pipelines to isolate heavy Maven compilation tools from the final execution layer, creating an immutable, lightweight runtime image.
* **Automated Network Orchestration:** Implements Docker Compose health check assertions ensuring the Spring Boot application server initiates only after the underlying MySQL container signals a completely healthy state.
* **Infrastructure Observability:** Exposes stateless REST endpoints (`/api/v1/telemetry/status`) that serialize active hardware metrics hashes cleanly into non-blocking JSON web payloads.
