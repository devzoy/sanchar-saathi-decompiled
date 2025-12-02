package com.google.gson;

import D2.b;
import D2.c;
import com.google.gson.internal.bind.a;
import java.io.IOException;

public abstract class TypeAdapter {
    public final Object a(h hVar) {
        try {
            return c(new a(hVar));
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        }
    }

    public final TypeAdapter b() {
        return new TypeAdapter() {
            public Object c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return TypeAdapter.this.c(aVar);
                }
                aVar.z();
                return null;
            }

            public void e(c cVar, Object obj) {
                if (obj == null) {
                    cVar.r();
                } else {
                    TypeAdapter.this.e(cVar, obj);
                }
            }
        };
    }

    public abstract Object c(D2.a aVar);

    public final h d(Object obj) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            e(bVar, obj);
            return bVar.N();
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        }
    }

    public abstract void e(c cVar, Object obj);
}
