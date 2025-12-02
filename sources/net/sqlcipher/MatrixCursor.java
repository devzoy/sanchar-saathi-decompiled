package net.sqlcipher;

import java.util.ArrayList;

public class MatrixCursor extends AbstractCursor {
    private final int columnCount;
    private final String[] columnNames;
    /* access modifiers changed from: private */
    public Object[] data;
    private int rowCount;

    public class RowBuilder {
        private final int endIndex;
        private int index;

        public RowBuilder(int i4, int i5) {
            this.index = i4;
            this.endIndex = i5;
        }

        public RowBuilder add(Object obj) {
            if (this.index != this.endIndex) {
                Object[] access$000 = MatrixCursor.this.data;
                int i4 = this.index;
                this.index = i4 + 1;
                access$000[i4] = obj;
                return this;
            }
            throw new CursorIndexOutOfBoundsException("No more columns left.");
        }
    }

    public MatrixCursor(String[] strArr, int i4) {
        this.rowCount = 0;
        this.columnNames = strArr;
        int length = strArr.length;
        this.columnCount = length;
        this.data = new Object[(length * (i4 < 1 ? 1 : i4))];
    }

    private void ensureCapacity(int i4) {
        Object[] objArr = this.data;
        if (i4 > objArr.length) {
            int length = objArr.length * 2;
            if (length >= i4) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            this.data = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private Object get(int i4) {
        int i5;
        if (i4 < 0 || i4 >= (i5 = this.columnCount)) {
            throw new CursorIndexOutOfBoundsException("Requested column: " + i4 + ", # of columns: " + this.columnCount);
        }
        int i6 = this.mPos;
        if (i6 < 0) {
            throw new CursorIndexOutOfBoundsException("Before first row.");
        } else if (i6 < this.rowCount) {
            return this.data[(i6 * i5) + i4];
        } else {
            throw new CursorIndexOutOfBoundsException("After last row.");
        }
    }

    public void addRow(Object[] objArr) {
        int length = objArr.length;
        int i4 = this.columnCount;
        if (length == i4) {
            int i5 = this.rowCount;
            this.rowCount = i5 + 1;
            int i6 = i5 * i4;
            ensureCapacity(i4 + i6);
            System.arraycopy(objArr, 0, this.data, i6, this.columnCount);
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + objArr.length);
    }

    public String[] getColumnNames() {
        return this.columnNames;
    }

    public int getCount() {
        return this.rowCount;
    }

    public double getDouble(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return 0.0d;
        }
        return obj instanceof Number ? ((Number) obj).doubleValue() : Double.parseDouble(obj.toString());
    }

    public float getFloat(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return 0.0f;
        }
        return obj instanceof Number ? ((Number) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int getInt(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).intValue() : Integer.parseInt(obj.toString());
    }

    public long getLong(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).longValue() : Long.parseLong(obj.toString());
    }

    public short getShort(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return 0;
        }
        return obj instanceof Number ? ((Number) obj).shortValue() : Short.parseShort(obj.toString());
    }

    public String getString(int i4) {
        Object obj = get(i4);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public int getType(int i4) {
        return DatabaseUtils.getTypeOfObject(get(i4));
    }

    public boolean isNull(int i4) {
        return get(i4) == null;
    }

    public RowBuilder newRow() {
        int i4 = this.rowCount + 1;
        this.rowCount = i4;
        int i5 = i4 * this.columnCount;
        ensureCapacity(i5);
        return new RowBuilder(i5 - this.columnCount, i5);
    }

    public MatrixCursor(String[] strArr) {
        this(strArr, 16);
    }

    public void addRow(Iterable<?> iterable) {
        int i4 = this.rowCount;
        int i5 = this.columnCount;
        int i6 = i4 * i5;
        int i7 = i5 + i6;
        ensureCapacity(i7);
        if (iterable instanceof ArrayList) {
            addRow((ArrayList) iterable, i6);
            return;
        }
        Object[] objArr = this.data;
        for (Object next : iterable) {
            if (i6 != i7) {
                objArr[i6] = next;
                i6++;
            } else {
                throw new IllegalArgumentException("columnValues.size() > columnNames.length");
            }
        }
        if (i6 == i7) {
            this.rowCount++;
            return;
        }
        throw new IllegalArgumentException("columnValues.size() < columnNames.length");
    }

    private void addRow(ArrayList<?> arrayList, int i4) {
        int size = arrayList.size();
        if (size == this.columnCount) {
            this.rowCount++;
            Object[] objArr = this.data;
            for (int i5 = 0; i5 < size; i5++) {
                objArr[i4 + i5] = arrayList.get(i5);
            }
            return;
        }
        throw new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + size);
    }
}
