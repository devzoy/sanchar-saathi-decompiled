package net.sqlcipher.database;

public class DatabaseObjectNotClosedException extends RuntimeException {

    /* renamed from: s  reason: collision with root package name */
    private static final String f11278s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(f11278s);
    }
}
