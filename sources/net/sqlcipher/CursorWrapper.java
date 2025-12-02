package net.sqlcipher;

public class CursorWrapper extends android.database.CursorWrapper implements Cursor {
    private final Cursor mCursor;

    public CursorWrapper(Cursor cursor) {
        super(cursor);
        this.mCursor = cursor;
    }

    public int getType(int i4) {
        return this.mCursor.getType(i4);
    }

    public Cursor getWrappedCursor() {
        return this.mCursor;
    }
}
