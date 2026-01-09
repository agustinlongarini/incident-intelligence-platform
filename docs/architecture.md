# System Architecture

## Architectural Style

The system follows a layered architecture inspired by Clean Architecture principles.

Core business logic is isolated from infrastructure and external services.

## Layers Overview

### Domain Layer

Contains the core domain concepts and business rules.

Responsibilities:

- Incident entity
- Analysis result representation
- Priority calculation rules
- Domain invariants

This layer has no dependencies on external systems or frameworks.

---

### Application Layer

Coordinates use cases and orchestrates workflows.

Responsibilities:

- Incident registration flow
- Triggering analysis
- Applying prioritization strategies
- Managing application-level rules

This layer depends on the Domain layer only.

---

### Infrastructure Layer

Provides technical implementations.

Responsibilities:

- Persistence mechanisms
- External service communication (AI service)
- Logging and monitoring
- API exposure

This layer depends on Application and Domain layers.

---

## AI Service as a Separate Component

The AI analysis service is treated as an external dependency.

Responsibilities:

- Text processing
- Classification
- Similarity detection
- Urgency scoring

The core system communicates with it via well-defined interfaces.

This allows:

- Replacing AI models
- Scaling independently
- Avoiding core refactoring

---

## Dependency Direction

Dependencies always point inward:

Infrastructure → Application → Domain
