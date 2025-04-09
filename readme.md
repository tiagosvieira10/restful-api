# RESTful API com Java

Este projeto é uma API RESTful desenvolvida em Java, com foco em boas práticas, estrutura limpa e extensível. Ideal para estudos, testes ou como base para aplicações mais robustas.

---

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +Card card
        +List~News~ news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +String limit
    }

    class News {
        +String icon
        +String description
    }

    User --> Account
    User --> Card
    User --> Feature
    User --> News

```
---

## 📦 Tecnologias utilizadas

- **Java 17+**
- **Spring Boot** 
- **Gradle**
- **Lombok**
- **JPA / Hibernate**
- **Banco de Dados:** H2, PostgreSQL
- **Postman** (para testes de endpoints)
