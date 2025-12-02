package net.sqlcipher.database;

import y0.h;

public class SupportFactory implements h.c {
    private final boolean clearPassphrase;
    private final SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SupportFactory(byte[] bArr) {
        this(bArr, (SQLiteDatabaseHook) null);
    }

    public h create(h.b bVar) {
        return new SupportHelper(bVar, this.passphrase, this.hook, this.clearPassphrase);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(bArr, sQLiteDatabaseHook, true);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z4) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.clearPassphrase = z4;
    }
}
