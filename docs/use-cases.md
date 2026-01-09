# Use Cases

## UC-01: Register Incident

### Description

An external system submits a new incident to be analyzed.

### Primary Actor

External System

### Preconditions

- The incident description is provided in free text.

### Main Flow

1. The system receives the incident data.
2. The system validates the input.
3. The incident is registered for analysis.
4. The system triggers the analysis process.

### Postconditions

- The incident is stored.
- The incident is marked as "Analyzed".

---

## UC-02: Analyze Incident

### Description

The system analyzes the incident description to extract structured insights.

### Primary Actor

System

### Main Flow

1. The system processes the incident text.
2. The system determines the incident category.
3. The system estimates urgency.
4. The system detects similar incidents.
5. The system generates suggested actions.

### Postconditions

- Analysis results are associated with the incident.

---

## UC-03: Prioritize Incident

### Description

The system determines the final priority of an incident.

### Primary Actor

System

### Main Flow

1. The system evaluates urgency.
2. The system applies prioritization rules.
3. The system assigns a priority level.

### Postconditions

- The incident has a defined priority.

---

## UC-04: Query Incident Insights

### Description

An administrator retrieves analyzed incident information.

### Primary Actor

Administrator

### Main Flow

1. The administrator requests incident data.
2. The system returns analysis results and metadata.

### Postconditions

- No system state is modified.
