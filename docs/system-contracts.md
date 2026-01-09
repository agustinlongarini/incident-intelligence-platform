# System Contracts

## Incident Submission Contract

### Purpose

Allow external systems to submit incidents for analysis.

### Input

- Incident description (free text)
- Optional metadata (source, reference id)

### Expected Behavior

- The system accepts the incident
- Validation errors are detected early
- The incident is registered and scheduled for analysis

### Output

- Unique incident identifier
- Acknowledgement of successful submission

### Failure Scenarios

- Invalid or empty description
- Unsupported input format

---

## Incident Analysis Result Contract

### Purpose

Expose the results of incident analysis.

### Input

- Incident identifier

### Output

- Incident category
- Urgency score
- Priority level
- Similar incidents (if any)
- Suggested actions

### Guarantees

- Returned data corresponds to the latest analysis
- Partial results may be returned if analysis is still in progress

---

## Incident Query Contract

### Purpose

Allow querying incidents and their state.

### Input

- Filtering criteria (status, priority, date range)

### Output

- List of incidents with summary information

---

## AI Analysis Service Contract

### Purpose

Delegate text analysis to an external service.

### Input

- Incident text
- Contextual hints (optional)

### Output

- Classified category
- Urgency score
- Similarity matches
- Suggested actions

### Guarantees

- Deterministic output for the same input (within model constraints)
- Graceful failure reporting

### Failure Scenarios

- AI service unavailable
- Analysis timeout
