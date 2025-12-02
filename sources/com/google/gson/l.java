package com.google.gson;

public class l extends RuntimeException {
    public l(String str) {
        super(str);
    }

    public l(String str, Throwable th) {
        super(str, th);
    }

    public l(Throwable th) {
        super(th);
    }
}
