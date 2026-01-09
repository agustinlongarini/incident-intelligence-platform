# Domain Definition

## Incident

An Incident represents an unexpected event or problem that requires attention
and potential resolution.

An incident is characterized by:

- A free-text description written by a human or external system
- A moment in time when it was reported
- An implicit impact on operations, users, or systems

An incident does NOT imply:

- A known root cause
- A confirmed solution
- A predefined priority

## Incident Analysis

Incident Analysis is the process of extracting structured information
from an unstructured incident description.

This process may infer:

- The category or type of the incident
- The urgency level
- Potential impact
- Similar previously reported incidents

Analysis results are probabilistic, not absolute.

## Priority vs Urgency

Urgency represents how quickly an incident should be addressed based on its content.

Priority represents the final ordering decision used by the system to determine
handling order.

Priority is derived from urgency combined with business rules.

## Similarity

Two incidents are considered similar if they describe the same or closely related
underlying issue, even if the wording is different.

Similarity does not require exact textual matching.

## Suggested Action

A Suggested Action is a non-binding recommendation that may help initiate
the resolution process.

The system suggests actions but does not execute them.

## System Boundaries

The system:

- Analyzes incident data
- Produces structured insights
- Supports decision-making

The system does NOT:

- Automatically resolve incidents
- Modify external systems
- Replace human judgment
