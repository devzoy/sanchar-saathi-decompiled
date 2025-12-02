package net.sqlcipher.database;

public abstract class SQLiteClosable {
    private Object mLock = new Object();
    private int mReferenceCount = 1;

    private String getObjInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" (");
        if (this instanceof SQLiteDatabase) {
            sb.append("database = ");
            sb.append(((SQLiteDatabase) this).getPath());
        } else if ((this instanceof SQLiteProgram) || (this instanceof SQLiteStatement) || (this instanceof SQLiteQuery)) {
            sb.append("mSql = ");
            sb.append(((SQLiteProgram) this).mSql);
        }
        sb.append(") ");
        return sb.toString();
    }

    public void acquireReference() {
        synchronized (this.mLock) {
            try {
                int i4 = this.mReferenceCount;
                if (i4 > 0) {
                    this.mReferenceCount = i4 + 1;
                } else {
                    throw new IllegalStateException("attempt to re-open an already-closed object: " + getObjInfo());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void onAllReferencesReleased();

    public void onAllReferencesReleasedFromContainer() {
    }

    public void releaseReference() {
        synchronized (this.mLock) {
            try {
                int i4 = this.mReferenceCount - 1;
                this.mReferenceCount = i4;
                if (i4 == 0) {
                    onAllReferencesReleased();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseReferenceFromContainer() {
        synchronized (this.mLock) {
            try {
                int i4 = this.mReferenceCount - 1;
                this.mReferenceCount = i4;
                if (i4 == 0) {
                    onAllReferencesReleasedFromContainer();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
