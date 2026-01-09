# Data Model (Conceptual)

## Incident

Represents a reported problem or event.

Attributes:

- id: Unique identifier
- description: Original free-text description
- reportedAt: Timestamp when the incident was created
- status: Current lifecycle state (e.g. NEW, ANALYZED, PRIORITIZED)
- priority: Final priority assigned by the system

An Incident is immutable in its description once created.

---

## IncidentAnalysis

Represents the result of analyzing an incident.

Attributes:

- id: Unique identifier
- incidentId: Reference to the analyzed incident
- category: Classified incident type
- urgencyScore: Numeric urgency estimation
- similarityMatches: References to similar incidents
- suggestedActions: List of recommendations
- analyzedAt: Timestamp of analysis

An IncidentAnalysis is always linked to exactly one Incident.

---

## SimilarIncidentMatch

Represents a similarity relationship between incidents.

Attributes:

- sourceIncidentId
- targetIncidentId
- similarityScore

Similarity is directional and contextual.

---

## Priority

Represents the system-defined handling importance.

Attributes:

- level: Discrete level (e.g. LOW, MEDIUM, HIGH, CRITICAL)
- calculatedAt
- rationale: Explanation of why the priority was assigned

Priority is derived, not manually assigned.

---

## Lifecycle Considerations

- An Incident can exist without analysis temporarily
- An IncidentAnalysis cannot exist without an Incident
- Re-analysis may produce multiple IncidentAnalysis records over time
