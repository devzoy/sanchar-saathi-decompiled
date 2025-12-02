package net.sqlcipher;

import android.database.CharArrayBuffer;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class CursorWindow extends android.database.CursorWindow implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR = new Parcelable.Creator<CursorWindow>() {
        public CursorWindow createFromParcel(Parcel parcel) {
            return new CursorWindow(parcel, 0);
        }

        public CursorWindow[] newArray(int i4) {
            return new CursorWindow[i4];
        }
    };
    private static CursorWindowAllocation allocation = new DefaultCursorWindowAllocation();
    private int mRequiredPos;
    private int mStartPos;
    private long nWindow;

    public CursorWindow(boolean z4) {
        super(z4);
        this.mStartPos = 0;
        if (allocation == null) {
            allocation = new DefaultCursorWindowAllocation();
        }
        native_init(z4, allocation.getInitialAllocationSize(), allocation.getGrowthPaddingSize(), allocation.getMaxAllocationSize());
    }

    private native boolean allocRow_native();

    private native void close_native();

    private native char[] copyStringToBuffer_native(int i4, int i5, int i6, CharArrayBuffer charArrayBuffer);

    private native void freeLastRow_native();

    private native byte[] getBlob_native(int i4, int i5);

    public static CursorWindowAllocation getCursorWindowAllocation() {
        return allocation;
    }

    private native double getDouble_native(int i4, int i5);

    private native long getLong_native(int i4, int i5);

    private native int getNumRows_native();

    private native String getString_native(int i4, int i5);

    private native int getType_native(int i4, int i5);

    private native boolean isBlob_native(int i4, int i5);

    private native boolean isFloat_native(int i4, int i5);

    private native boolean isInteger_native(int i4, int i5);

    private native boolean isNull_native(int i4, int i5);

    private native boolean isString_native(int i4, int i5);

    private native void native_clear();

    private native IBinder native_getBinder();

    private native void native_init(IBinder iBinder);

    private native void native_init(boolean z4, long j4, long j5, long j6);

    public static CursorWindow newFromParcel(Parcel parcel) {
        return CREATOR.createFromParcel(parcel);
    }

    private native boolean putBlob_native(byte[] bArr, int i4, int i5);

    private native boolean putDouble_native(double d4, int i4, int i5);

    private native boolean putLong_native(long j4, int i4, int i5);

    private native boolean putNull_native(int i4, int i5);

    private native boolean putString_native(String str, int i4, int i5);

    public static void setCursorWindowAllocation(CursorWindowAllocation cursorWindowAllocation) {
        allocation = cursorWindowAllocation;
    }

    private native boolean setNumColumns_native(int i4);

    public boolean allocRow() {
        acquireReference();
        try {
            return allocRow_native();
        } finally {
            releaseReference();
        }
    }

    public void clear() {
        acquireReference();
        try {
            this.mStartPos = 0;
            native_clear();
        } finally {
            releaseReference();
        }
    }

    public void close() {
        releaseReference();
    }

    public void copyStringToBuffer(int i4, int i5, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            if (charArrayBuffer.data == null) {
                charArrayBuffer.data = new char[64];
            }
            acquireReference();
            try {
                char[] copyStringToBuffer_native = copyStringToBuffer_native(i4 - this.mStartPos, i5, charArrayBuffer.data.length, charArrayBuffer);
                if (copyStringToBuffer_native != null) {
                    charArrayBuffer.data = copyStringToBuffer_native;
                }
            } finally {
                releaseReference();
            }
        } else {
            throw new IllegalArgumentException("CharArrayBuffer should not be null");
        }
    }

    public int describeContents() {
        return 0;
    }

    public void finalize() {
        if (this.nWindow != 0) {
            close_native();
        }
    }

    public void freeLastRow() {
        acquireReference();
        try {
            freeLastRow_native();
        } finally {
            releaseReference();
        }
    }

    public byte[] getBlob(int i4, int i5) {
        acquireReference();
        try {
            return getBlob_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public double getDouble(int i4, int i5) {
        acquireReference();
        try {
            return getDouble_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public float getFloat(int i4, int i5) {
        acquireReference();
        try {
            return (float) getDouble_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public int getInt(int i4, int i5) {
        acquireReference();
        try {
            return (int) getLong_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public long getLong(int i4, int i5) {
        acquireReference();
        try {
            return getLong_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public int getNumRows() {
        acquireReference();
        try {
            return getNumRows_native();
        } finally {
            releaseReference();
        }
    }

    public int getRequiredPosition() {
        return this.mRequiredPos;
    }

    public short getShort(int i4, int i5) {
        acquireReference();
        try {
            return (short) ((int) getLong_native(i4 - this.mStartPos, i5));
        } finally {
            releaseReference();
        }
    }

    public int getStartPosition() {
        return this.mStartPos;
    }

    public String getString(int i4, int i5) {
        acquireReference();
        try {
            return getString_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public int getType(int i4, int i5) {
        acquireReference();
        try {
            return getType_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean isBlob(int i4, int i5) {
        acquireReference();
        try {
            return isBlob_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean isFloat(int i4, int i5) {
        acquireReference();
        try {
            return isFloat_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean isLong(int i4, int i5) {
        acquireReference();
        try {
            return isInteger_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean isNull(int i4, int i5) {
        acquireReference();
        try {
            return isNull_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean isString(int i4, int i5) {
        acquireReference();
        try {
            return isString_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public void onAllReferencesReleased() {
        close_native();
        super.onAllReferencesReleased();
    }

    public boolean putBlob(byte[] bArr, int i4, int i5) {
        acquireReference();
        try {
            return putBlob_native(bArr, i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean putDouble(double d4, int i4, int i5) {
        acquireReference();
        try {
            return putDouble_native(d4, i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean putLong(long j4, int i4, int i5) {
        acquireReference();
        try {
            return putLong_native(j4, i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean putNull(int i4, int i5) {
        acquireReference();
        try {
            return putNull_native(i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean putString(String str, int i4, int i5) {
        acquireReference();
        try {
            return putString_native(str, i4 - this.mStartPos, i5);
        } finally {
            releaseReference();
        }
    }

    public boolean setNumColumns(int i4) {
        acquireReference();
        try {
            return setNumColumns_native(i4);
        } finally {
            releaseReference();
        }
    }

    public void setRequiredPosition(int i4) {
        this.mRequiredPos = i4;
    }

    public void setStartPosition(int i4) {
        this.mStartPos = i4;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStrongBinder(native_getBinder());
        parcel.writeInt(this.mStartPos);
    }

    public CursorWindow(Parcel parcel, int i4) {
        super(true);
        IBinder readStrongBinder = parcel.readStrongBinder();
        this.mStartPos = parcel.readInt();
        native_init(readStrongBinder);
    }
}
