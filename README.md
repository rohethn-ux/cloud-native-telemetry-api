# Cloud-Native Telemetry API

A small Spring Boot REST API that simulates a cloud infrastructure telemetry
endpoint. Built as a hands-on project to learn Docker multi-stage builds,
Docker Compose service orchestration, and Spring Boot fundamentals.

## What it does

Exposes a single endpoint, `GET /api/v1/telemetry/status`, that returns a
JSON snapshot of mock infrastructure metrics (CPU usage, memory allocation,
active containers, etc.). The values are currently hardcoded — this is a
starting point for a real telemetry service, not a live metrics collector.

## Tech stack

- Java 17 / Spring Boot 3.3.4
- Maven (multi-stage Docker build)
- Docker Compose (API + MySQL, orchestrated together)
- MySQL 8.0 (configured and running, not yet wired into the API logic)

## Running it locally

```bash
docker compose up --build
curl http://localhost:8080/api/v1/telemetry/status
```

## What's next / known limitations

- MySQL is running via Compose but the app doesn't use it yet — no
  entities or repositories are defined. Next step is adding real
  persistence (e.g. storing metric snapshots over time).
- The DB password is currently hardcoded in `application.properties` for
  local development. Moving this to an environment variable is planned.
- No automated tests yet.

## What I learned building this

Fixed a broken Maven project structure (files weren't in the standard
`src/main/java/...` layout the build expected), resolved a Docker Compose
port conflict, and worked through a git history divergence between local
and remote after pushing the structural fix.
