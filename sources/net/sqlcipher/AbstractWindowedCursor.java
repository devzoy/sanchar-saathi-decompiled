package net.sqlcipher;

import android.database.CharArrayBuffer;

public abstract class AbstractWindowedCursor extends AbstractCursor {
    protected CursorWindow mWindow;

    public void checkPosition() {
        super.checkPosition();
        if (this.mWindow == null) {
            throw new StaleDataException("Access closed cursor");
        }
    }

    public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (isFieldUpdated(i4)) {
                    super.copyStringToBuffer(i4, charArrayBuffer);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.mWindow.copyStringToBuffer(this.mPos, i4, charArrayBuffer);
    }

    public byte[] getBlob(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getBlob(this.mPos, i4);
                }
                byte[] bArr = (byte[]) getUpdatedField(i4);
                return bArr;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public double getDouble(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getDouble(this.mPos, i4);
                }
                double doubleValue = ((Number) getUpdatedField(i4)).doubleValue();
                return doubleValue;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public float getFloat(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getFloat(this.mPos, i4);
                }
                float floatValue = ((Number) getUpdatedField(i4)).floatValue();
                return floatValue;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public int getInt(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getInt(this.mPos, i4);
                }
                int intValue = ((Number) getUpdatedField(i4)).intValue();
                return intValue;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public long getLong(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getLong(this.mPos, i4);
                }
                long longValue = ((Number) getUpdatedField(i4)).longValue();
                return longValue;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public short getShort(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getShort(this.mPos, i4);
                }
                short shortValue = ((Number) getUpdatedField(i4)).shortValue();
                return shortValue;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public String getString(int i4) {
        checkPosition();
        synchronized (this.mUpdatedRows) {
            try {
                if (!isFieldUpdated(i4)) {
                    return this.mWindow.getString(this.mPos, i4);
                }
                String str = (String) getUpdatedField(i4);
                return str;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public int getType(int i4) {
        checkPosition();
        return this.mWindow.getType(this.mPos, i4);
    }

    public boolean hasWindow() {
        return this.mWindow != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isBlob(int r3) {
        /*
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3 instanceof byte[]     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r3 = 0
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x0028
        L_0x001b:
            r3 = 1
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isBlob(r1, r3)
            return r3
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractWindowedCursor.isBlob(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isFloat(int r3) {
        /*
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x001f
            boolean r1 = r3 instanceof java.lang.Float     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x001d
            boolean r3 = r3 instanceof java.lang.Double     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x001f
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x002c
        L_0x001d:
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return r3
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isFloat(r1, r3)
            return r3
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractWindowedCursor.isFloat(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLong(int r3) {
        /*
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch:{ all -> 0x001b }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x001f
            boolean r1 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x001d
            boolean r3 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x001f
            goto L_0x001d
        L_0x001b:
            r3 = move-exception
            goto L_0x002c
        L_0x001d:
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return r3
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isLong(r1, r3)
            return r3
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractWindowedCursor.isLong(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isNull(int r3) {
        /*
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x0019
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isNull(r1, r3)
            return r3
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractWindowedCursor.isNull(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isString(int r3) {
        /*
            r2 = this;
            r2.checkPosition()
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            boolean r1 = r2.isFieldUpdated(r3)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001e
            java.lang.Object r3 = r2.getUpdatedField(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            goto L_0x001b
        L_0x0017:
            r3 = 0
            goto L_0x001c
        L_0x0019:
            r3 = move-exception
            goto L_0x0028
        L_0x001b:
            r3 = 1
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            net.sqlcipher.CursorWindow r0 = r2.mWindow
            int r1 = r2.mPos
            boolean r3 = r0.isString(r1, r3)
            return r3
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.AbstractWindowedCursor.isString(int):boolean");
    }

    public void setWindow(CursorWindow cursorWindow) {
        CursorWindow cursorWindow2 = this.mWindow;
        if (cursorWindow2 != null) {
            cursorWindow2.close();
        }
        this.mWindow = cursorWindow;
    }

    public CursorWindow getWindow() {
        return this.mWindow;
    }
}
