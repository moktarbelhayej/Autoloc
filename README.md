# AutoLoc API

Spring Boot and Maven project for the AutoLoc car rental application.

## Technology

- Java 17
- Spring Boot 4.1.1
- Maven
- Spring Data JPA / Hibernate
- MySQL
- Lombok

## Project structure

```text
src/main/java/tn/esprit/autolocapi
|-- AutolocApiApplication.java
`-- domain
	|-- Agence
	|-- Client
	|-- Contrat
	|-- Employe
	|-- Equipement
	|-- Maintenance
	|-- Paiement
	|-- Reservation
	`-- Vehicule
```

The domain package also contains the enums used by the entities:
`CategorieVehicule`, `ModePaiement`, `RoleEmploye`, `StatutReservation`, and
`StatutVehicule`.

## Database configuration

The application expects a MySQL server on `localhost:3306` and uses the
`autoloc_db` database. The database is created automatically when necessary.
Update `src/main/resources/application.properties` with the correct username
and password for your local MySQL installation.

Hibernate is configured with `ddl-auto=update` for development, so the entity
tables are created or updated when the application starts. Use migrations and
a stricter setting such as `validate` for production.

## Run the application

Make sure MySQL is running, then execute:

```powershell
./mvnw.cmd spring-boot:run
```

The application runs on port `9091` by default.

## Run tests

```powershell
./mvnw.cmd test
```

The current test verifies that the Spring application context and JPA schema
load successfully.

## Current scope

The nine domain entities and their database tables are currently defined
without associations. Relationships, repositories, services, DTOs, and REST
controllers will be added in the following project stages.
