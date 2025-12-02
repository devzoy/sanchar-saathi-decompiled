package Q0;

public enum s {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean f() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
