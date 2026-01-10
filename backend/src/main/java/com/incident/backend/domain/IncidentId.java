package com.incident.backend.domain;

import java.util.Objects;
import java.util.UUID;

public final class IncidentId {

    private final UUID value;

    private IncidentId(UUID value) {
        this.value = value;
    }

    public static IncidentId generate() {
        return new IncidentId(UUID.randomUUID());
    }

    public UUID value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IncidentId)) return false;
        IncidentId that = (IncidentId) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
