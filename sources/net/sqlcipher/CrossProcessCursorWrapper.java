package net.sqlcipher;

import android.database.CrossProcessCursor;
import android.database.CursorWindow;

public class CrossProcessCursorWrapper extends CursorWrapper implements CrossProcessCursor {
    public CrossProcessCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public void fillWindow(int i4, CursorWindow cursorWindow) {
        DatabaseUtils.cursorFillWindow(this, i4, cursorWindow);
    }

    public CursorWindow getWindow() {
        return null;
    }

    public boolean onMove(int i4, int i5) {
        return true;
    }
}
