package com.incident.backend.domain;

import java.time.Instant;
import java.util.Objects;

public class Incident {

    private final IncidentId id;
    private final String description;
    private final Instant reportedAt;

    private IncidentStatus status;
    private Priority priority;

    public Incident(IncidentId id, String description, Instant reportedAt) {
        validateDescription(description);

        this.id = id;
        this.description = description;
        this.reportedAt = reportedAt;
        this.status = IncidentStatus.NEW;
    }

    private void validateDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Incident description cannot be empty");
        }
    }

    public void markAnalyzed() {
        if (status != IncidentStatus.NEW) {
            throw new IllegalStateException("Incident can only be analyzed once");
        }
        this.status = IncidentStatus.ANALYZED;
    }

    public void assignPriority(Priority priority) {
        if (status != IncidentStatus.ANALYZED) {
            throw new IllegalStateException("Incident must be analyzed before assigning priority");
        }
        this.priority = priority;
        this.status = IncidentStatus.PRIORITIZED;
    }

    public IncidentId id() {
        return id;
    }

    public String description() {
        return description;
    }

    public IncidentStatus status() {
        return status;
    }

    public Priority priority() {
        return priority;
    }
}

