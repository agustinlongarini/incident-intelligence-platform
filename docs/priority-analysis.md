# Priority Analysis

## Purpose

This document defines **how incident priority is determined from a business-domain perspective**. It intentionally avoids technical implementation details, frameworks, or AI-specific solutions.

The goal is to establish a **clear, explainable, and extensible priority model** that can evolve over time without requiring a redesign of the core domain.

---

## What Is Incident Priority?

Incident priority represents **how quickly and with what level of attention an incident must be addressed**, based on its current and potential impact on the system and its users.

Priority is a **business decision**, not a purely technical or automated outcome.

---

## Priority Influencing Factors

### 1. Impact

Impact describes the **severity of the consequences** caused by the incident.

Examples:

- Number of affected users
- Degree of system unavailability
- Data loss or corruption
- Security exposure

Typical scenarios:

- Full system outage → High impact
- Minor UI defect → Low impact

---

### 2. Urgency

Urgency reflects **how quickly the incident must be resolved** to prevent escalation.

Examples:

- Active production incident
- Issue that will worsen if unattended
- Problem that can wait for a maintenance window

---

### 3. Incident Type

Certain incident types inherently carry higher priority.

Examples:

- Security
- Availability
- Performance
- Functional or usability issues

For instance, a security incident usually has higher priority than a functional defect with similar impact.

---

### 4. Temporal Context

The time and context in which an incident occurs may affect its priority.

Examples:

- Peak business hours
- Critical business periods (events, financial closing)
- Weekends or holidays

---

### 5. History and Recurrence

Recurring or previously unresolved incidents may increase priority.

Examples:

- Same incident reported multiple times in a short period
- Known issue without a definitive fix

---

## Business Rules (Examples)

These rules represent **explicit business decisions**, not technical constraints:

- If impact is HIGH and urgency is HIGH → Priority = CRITICAL
- If incident type is SECURITY → Minimum priority = HIGH
- If more than X% of users are affected → Increase priority
- If incident occurs outside business hours and has no active impact → Decrease priority

Rules may be combined and evaluated together.

---

## Priority Explainability

Every assigned priority must be able to answer the question:

> Why does this incident have this priority?

Therefore, priority decisions must be traceable to:

- Applied business rules
- Relevant influencing factors
- Considered context

---

## Future Evolution

The priority model must support:

- Introduction of new influencing factors
- Modification or replacement of business rules
- Integration of automated or AI-based analysis

Without requiring changes to existing domain concepts.

---

## Relationship With AI

Automated analysis or AI systems may:

- Analyze incident data
- Provide signals or scores
- Suggest values

However, **AI does not make the final decision**.

Priority assignment is always a **domain-level decision**, governed by explicit business rules.

---

## Conclusion

Incident priority is the result of evaluating multiple factors under clear and explainable business rules. This analysis forms the core decision-making mechanism of the system and defines its real operational value.
