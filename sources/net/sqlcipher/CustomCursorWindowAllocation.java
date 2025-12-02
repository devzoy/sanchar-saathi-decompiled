package net.sqlcipher;

public class CustomCursorWindowAllocation implements CursorWindowAllocation {
    private long growthPaddingSize;
    private long initialAllocationSize;
    private long maxAllocationSize;

    public CustomCursorWindowAllocation(long j4, long j5, long j6) {
        this.initialAllocationSize = j4;
        this.growthPaddingSize = j5;
        this.maxAllocationSize = j6;
    }

    public long getGrowthPaddingSize() {
        return this.growthPaddingSize;
    }

    public long getInitialAllocationSize() {
        return this.initialAllocationSize;
    }

    public long getMaxAllocationSize() {
        return this.maxAllocationSize;
    }
}
