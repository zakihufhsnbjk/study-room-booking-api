# Study Room Booking API

A REST API for booking study rooms built with Spring Boot and PostgreSQL.

## Live API

https://study-room-booking-api-2b3x.onrender.com/swagger-ui/index.html

## Features

- JWT authentication (register/login)
- Prevents overlapping bookings
- Layered architecture (Controller → Service → Repository)
- Input validation and correct HTTP status codes (400, 409, 403)
- Deployed on Render with PostgreSQL

## Tech Stack

Java 21, Spring Boot 4, PostgreSQL, JWT, Maven

## Endpoints

### Auth (public)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/auth/register` | Create account, returns JWT token |
| POST | `/auth/login` | Login, returns JWT token |

### Bookings (requires `Authorization: Bearer <token>`)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/bookings` | List all bookings |
| POST | `/bookings` | Create a booking |

## Run Locally

```bash
./mvnw spring-boot:run
```

Requires PostgreSQL on `localhost:5432/studyroom`
