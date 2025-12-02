package net.sqlcipher.database;

public class SQLiteQueryStats {
    long largestIndividualRowSize;
    long totalQueryResultSize;

    public SQLiteQueryStats(long j4, long j5) {
        this.totalQueryResultSize = j4;
        this.largestIndividualRowSize = j5;
    }

    public long getLargestIndividualRowSize() {
        return this.largestIndividualRowSize;
    }

    public long getTotalQueryResultSize() {
        return this.totalQueryResultSize;
    }
}
