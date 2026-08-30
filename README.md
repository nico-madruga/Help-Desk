# Help-Desk# HelpDesk — Java JDBC

A terminal-based technical support ticket management system developed as a Java/JDBC practice project.

The project focuses on building a layered Java application that communicates with a MySQL database through JDBC, implementing the **Model → DAO → Service → View** architecture.

## 🎯 Objective

The goal of this project is to practice and improve:

* Java object-oriented programming
* JDBC and SQL
* DAO and Service patterns
* Exception handling
* Input validation
* `Optional`
* `LocalDateTime`
* `PreparedStatement`
* ResultSet mapping
* Generated database keys
* Layered architecture

## 🛠️ Technologies

* **Java**
* **Maven**
* **JDBC**
* **MySQL**
* **Git / GitHub**

## 📁 Architecture

```text
src/
└── main/
    └── java/
        └── ...
            ├── model/
            ├── dao/
            ├── service/
            ├── exception/
            ├── config/
            └── view/
```

The application follows the flow:

```text
View
 ↓
Service
 ↓
DAO
 ↓
JDBC
 ↓
MySQL
```

### Model

Contains the application's entities and their attributes.

### DAO

Responsible for database operations such as:

* `INSERT`
* `SELECT`
* `UPDATE`
* `DELETE`

### Service

Responsible for:

* Business rules
* Input validation
* Entity existence checks
* Coordinating operations between the View and DAO

### View

Provides the terminal-based user interface and application menu.

## 🗄️ Database

The system uses MySQL with the following main entities:

```text
Setor
  │
  └── Equipamento
          │
          └── Chamado
```

### `setores`

Stores the company's sectors.

### `equipamentos`

Stores devices belonging to each sector.

### `chamados`

Stores technical support tickets associated with equipment.

A ticket contains information such as:

* Title
* Description
* Priority
* Status
* Creation date
* Resolution date

## ⚙️ Features

### Setores

* Register sectors
* List sectors
* Search sectors by ID
* Delete sectors

### Equipamentos

* Register equipment
* List equipment
* Search equipment by ID
* List active equipment
* Filter equipment by sector
* Deactivate equipment

### Chamados

* Register support tickets
* List all tickets
* Search tickets by ID
* List open tickets
* Filter tickets by priority
* Resolve tickets

## 🔐 JDBC Practices

The project intentionally follows common JDBC practices:

* `PreparedStatement` for parameterized SQL
* `try-with-resources` for JDBC resources
* `ResultSet` mapping to Java objects
* Generated key retrieval after inserts
* `SQLException` conversion to application-specific exceptions
* No SQL parameter concatenation

## ▶️ Running the Project

### 1. Clone the repository

```bash
git clone <repository-url>
cd helpdesk
```

### 2. Configure MySQL

Create the database and execute the SQL script provided in the project.

Then configure the database connection in the application's connection configuration.

### 3. Build with Maven

```bash
mvn clean install
```

### 4. Run

Run the application's main class:

```text
Main.java
```

## 🧪 Testing

The project should be tested with multiple records to verify that:

* Lists return all database records
* Searching for an existing ID returns the correct entity
* Searching for a nonexistent ID is handled correctly
* Open tickets are filtered correctly
* Priority filtering works correctly
* Generated IDs are returned after insertion
* Resolving a nonexistent ticket returns the appropriate result
* Invalid input is rejected by the Service layer

## 📚 Purpose

This project was created as a **Java/JDBC skill-building exercise**, with particular emphasis on writing complete database operations and correctly separating responsibilities between application layers.

The project is intentionally small so that the focus remains on **Java, JDBC, SQL, architecture, validation, and debugging** rather than framework complexity.

## 👤 Author

**Nicolas**

Built as part of my ongoing Java and backend development practice.

