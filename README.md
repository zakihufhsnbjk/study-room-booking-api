# Study Room Booking API

A REST API for booking study rooms built with Spring Boot and PostgreSQL.

## Live API
https://YOUR-RAILWAY-URL.up.railway.app

## Features
- JWT authentication (register/login)
- Prevents overlapping bookings
- Layered architecture (Controller → Service → Repository)
- Input validation and correct HTTP error codes (400, 409, 403)
- Dockerised with docker-compose
- Deployed on Railway

## Tech Stack
Java 21, Spring Boot 4, PostgreSQL, JWT, Docker, Maven

## Endpoints

### Auth (public)
POST /auth/register — create account, returns JWT token
POST /auth/login    — login, returns JWT token

### Bookings (requires Authorization: Bearer token)
GET  /bookings — list all bookings
POST /bookings — create a booking

## Run Locally with Docker
docker compose up --build

## Run Locally without Docker
./mvnw spring-boot:run
Requires PostgreSQL on localhost:5432/studyroom
