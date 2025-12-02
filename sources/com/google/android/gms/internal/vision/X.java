package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class X implements C0546t1 {
    protected int zza = 0;

    public static void f(Iterable iterable, List list) {
        R0.d(iterable);
        if (iterable instanceof C0497d1) {
            List e4 = ((C0497d1) iterable).e();
            C0497d1 d1Var = (C0497d1) list;
            int size = list.size();
            for (Object next : e4) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(d1Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = d1Var.size() - 1; size2 >= size; size2--) {
                        d1Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof C0507g0) {
                    d1Var.n((C0507g0) next);
                } else {
                    d1Var.add((String) next);
                }
            }
        } else if (iterable instanceof D1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    public abstract void i(int i4);

    public final byte[] j() {
        try {
            byte[] bArr = new byte[g()];
            C0551v0 d4 = C0551v0.d(bArr);
            b(d4);
            d4.J();
            return bArr;
        } catch (IOException e4) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e4);
        }
    }

    public abstract int k();
}
