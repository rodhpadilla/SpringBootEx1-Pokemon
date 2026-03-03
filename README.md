# Spring Boot Pokemon API

A simple REST API built with Spring Boot 4.0.3 for managing Pokemon data.

## Technologies

- Java 21
- Spring Boot 4.0.3
- Maven

## Features

- Get all Pokemon
- Get Pokemon by ID
- Create new Pokemon
- Delete Pokemon by ID

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/pokemon` | Get all Pokemon |
| GET | `/api/pokemon/{id}` | Get Pokemon by ID |
| POST | `/api/pokemon` | Create a new Pokemon |
| DELETE | `/api/pokemon/{id}` | Delete Pokemon by ID |

## Running the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## Example Usage

### Get all Pokemon
```bash
curl http://localhost:8080/api/pokemon
```

### Create a Pokemon
```bash
curl -X POST http://localhost:8080/api/pokemon \
  -H "Content-Type: application/json" \
  -d '{"name":"Squirtle","type":"Water","level":10}'
```

### Get Pokemon by ID
```bash
curl http://localhost:8080/api/pokemon/1
```

### Delete Pokemon
```bash
curl -X DELETE http://localhost:8080/api/pokemon/1
```

## Initial Data

The application comes pre-loaded with:
- Pikachu (Electric, Level 25)
- Charizard (Fire, Level 36)
- Bulbasaur (Grass, Level 12)
