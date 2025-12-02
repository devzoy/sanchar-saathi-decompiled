package androidx.work;

import Q0.f;
import Q0.o;
import Q0.v;
import android.net.Network;
import c1.C0403b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f6084a;

    /* renamed from: b  reason: collision with root package name */
    public b f6085b;

    /* renamed from: c  reason: collision with root package name */
    public Set f6086c;

    /* renamed from: d  reason: collision with root package name */
    public a f6087d;

    /* renamed from: e  reason: collision with root package name */
    public int f6088e;

    /* renamed from: f  reason: collision with root package name */
    public Executor f6089f;

    /* renamed from: g  reason: collision with root package name */
    public C0403b f6090g;

    /* renamed from: h  reason: collision with root package name */
    public v f6091h;

    /* renamed from: i  reason: collision with root package name */
    public o f6092i;

    /* renamed from: j  reason: collision with root package name */
    public f f6093j;

    /* renamed from: k  reason: collision with root package name */
    public int f6094k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List f6095a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List f6096b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f6097c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i4, int i5, Executor executor, C0403b bVar2, v vVar, o oVar, f fVar) {
        this.f6084a = uuid;
        this.f6085b = bVar;
        this.f6086c = new HashSet(collection);
        this.f6087d = aVar;
        this.f6088e = i4;
        this.f6094k = i5;
        this.f6089f = executor;
        this.f6090g = bVar2;
        this.f6091h = vVar;
        this.f6092i = oVar;
        this.f6093j = fVar;
    }

    public Executor a() {
        return this.f6089f;
    }

    public f b() {
        return this.f6093j;
    }

    public UUID c() {
        return this.f6084a;
    }

    public b d() {
        return this.f6085b;
    }

    public v e() {
        return this.f6091h;
    }
}
