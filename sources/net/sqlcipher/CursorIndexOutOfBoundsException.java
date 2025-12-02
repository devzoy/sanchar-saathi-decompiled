package net.sqlcipher;

public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(int i4, int i5) {
        super("Index " + i4 + " requested, with a size of " + i5);
    }

    public CursorIndexOutOfBoundsException(String str) {
        super(str);
    }
}
