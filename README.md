# OneShop – Spring Boot E‑Commerce Backend

Ein leichtgewichtiger E‑Commerce Backend Dienst auf Basis von Spring Boot. Das Projekt zeigt eine saubere Schichtenarchitektur mit Fokus auf klaren Domänenmodellen, stabilen API‑Verträgen und praxistauglicher Sicherheit.

## Ziele

* Einfache und nachvollziehbare Referenz für ein E‑Commerce Backend schaffen
* Saubere Trennung von Web, Geschäftslogik und Persistenz
* Sichere Authentifizierung und Autorisierung mit Rollen
* Erweiterbare Architektur für Katalog, Warenkorb und Bestellung
* User authentication and authorization
* Product management
* Cart management
* Order management
* JWT-based authentication
* H2 in-memory database for development and testing

## Projektbeschreibung

OneShop stellt REST Endpunkte für Authentifizierung, Produktkatalog, Warenkorb und Bestellungen bereit. Die Anwendung verwendet Spring Boot, Spring Security mit JWT, Spring Data JPA für den Datenzugriff und H2 für lokale Entwicklung. Das Ziel ist ein klarer Codepfad vom HTTP Request über Controller und Services bis zur Datenbank.

## Technische Highlights

* Spring Boot mit klarer Layering Struktur: Controller, Service, Repository, Model
* Spring Security mit JWT für stateless Authentifizierung und Rollenprüfung
* Spring Data JPA mit abgeleiteten Methoden wie `findByEmail` und `existsByEmail`
* Domänenmodell mit JPA Beziehungen: One‑to‑One, One‑to‑Many, Many‑to‑Many
* EntityGraph und Lazy Loading zur Reduktion von N+1 Abfragen
* DTOs und Validierung für stabile API‑Verträge
* Transaktionsmanagement mit `@Transactional`
* H2 Datenbank für lokale Entwicklung und schnelle Tests

## Architektur


**Kern Domäne**

* Katalog mit Product und Category
* Warenkorb mit Cart und CartItem je User
* Bestellung mit Order und OrderItem
* Identität mit User und Role

## API Überblick

Beispiele für typische Endpunkte. Exakte Pfade können je nach Code leicht variieren.

* Auth: `POST /auth/register`, `POST /auth/login`
* Produkte: `GET /products`, `GET /products/{id}`
* Warenkorb: `GET /cart`, `POST /cart/items`, `DELETE /cart/items/{productId}`
* Bestellungen: `POST /orders`, `GET /orders`, `GET /orders/{id}`

## Sicherheit

* JWT Bearer Token in `Authorization` Header
* Rollenbasiert: `ROLE_USER`, `ROLE_ADMIN`
* Passwort Hashing mit BCrypt oder Argon2
* Method Security optional auf Service Ebene aktivierbar

## Datenmodell

Wesentliche JPA Entities

* `User` mit `email` als fachliche Kennung und Beziehungen zu `Cart`, `Order`, `Role`
* `Product` und `Category`
* `Cart` und `CartItem`
* `Order` und `OrderItem`

Beispiel Repositories mit Spring Data JPA

* `UserRepository extends JpaRepository<User, Long>`

  * `Optional<User> findByEmailIgnoreCase(String email)`
  * `boolean existsByEmail(String email)`
* `ProductRepository` mit Paging und Sortierung

## Best Practices im Projekt

* Eindeutige und indizierte E‑Mail in der Datenbank
* `Optional<T>` statt `null` in Repository Signaturen
* Pagination mit `Pageable` für Listenendpunkte
* EntityGraph oder Join Fetch für gezieltes Mitladen
* DTOs statt Entities in API Responses
* Transaktionen auf Service Ebene
* Konsistenzhelfer in Entities für bidirektionale Beziehungen

## Setup und Ausführung

Voraussetzungen

* JDK 17 oder höher
* Maven oder Gradle

Schritte

1. Repository klonen
2. Konfiguration in `application.properties` prüfen
3. Starten

   * Maven: `./mvnw spring-boot:run`
   * Gradle: `./gradlew bootRun`
4. API testen mit HTTP Client deiner Wahl

Standard Konfiguration

* H2 In Memory Datenbank für lokale Entwicklung
* H2 Console optional aktivierbar in `application.properties`

## Konfiguration

Wichtige Einstellungen in `application.properties`

* Datenquelle für `H2` oder produktive Datenbank wie Postgres
* JWT Eigenschaften wie Secret und Gültigkeitsdauer
* CORS Ursprünge für das Frontend

## Tests

* `@DataJpaTest` für Repositories und Constraints
* `@WebMvcTest` für Controller
* Service Unit Tests mit Mock Repositories

## Roadmap

* OpenAPI Dokumentation mit springdoc
* Upload von Produktbildern und Medienverwaltung
* Rabatt und Preisregeln sowie Steuerbehandlung
* Eventing für Order Ereignisse und Benachrichtigungen
* Migrationen mit Flyway für produktive Datenbanken

## Ergebnisse und Nutzen

* Arbeitsfähiges Referenzbackend für E‑Commerce Szenarien
* Klarer und erweiterbarer Code für neue Features
* Einfache lokale Inbetriebnahme und reproduzierbare Tests

## Screenshots und Beispiele

Füge hier Postman Collections, Beispiel Requests und Antworten sowie ER Diagramme ein

## Lizenz

MIT oder Apache 2.0 je nach Projektvorgabe
