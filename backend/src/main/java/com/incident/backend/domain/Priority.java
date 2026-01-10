package com.incident.backend.domain;

import java.time.Instant;
import java.util.Objects;

public final class Priority {

    private final PriorityLevel level;
    private final Instant calculatedAt;
    private final String rationale;

    public Priority(PriorityLevel level, Instant calculatedAt, String rationale) {
        this.level = Objects.requireNonNull(level);
        this.calculatedAt = Objects.requireNonNull(calculatedAt);
        this.rationale = Objects.requireNonNull(rationale);
    }

    public PriorityLevel level() {
        return level;
    }

    public Instant calculatedAt() {
        return calculatedAt;
    }

    public String rationale() {
        return rationale;
    }
}
