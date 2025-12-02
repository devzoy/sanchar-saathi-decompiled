package Q0;

import i3.C0723G;
import java.util.Set;
import java.util.UUID;
import v3.g;
import v3.l;

public abstract class u {

    /* renamed from: d  reason: collision with root package name */
    public static final b f2409d = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final UUID f2410a;

    /* renamed from: b  reason: collision with root package name */
    public final Z0.u f2411b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f2412c;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final Class f2413a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2414b;

        /* renamed from: c  reason: collision with root package name */
        public UUID f2415c;

        /* renamed from: d  reason: collision with root package name */
        public Z0.u f2416d;

        /* renamed from: e  reason: collision with root package name */
        public final Set f2417e;

        public a(Class cls) {
            l.e(cls, "workerClass");
            this.f2413a = cls;
            UUID randomUUID = UUID.randomUUID();
            l.d(randomUUID, "randomUUID()");
            this.f2415c = randomUUID;
            String uuid = this.f2415c.toString();
            l.d(uuid, "id.toString()");
            String name = cls.getName();
            l.d(name, "workerClass.name");
            this.f2416d = new Z0.u(uuid, name);
            String name2 = cls.getName();
            l.d(name2, "workerClass.name");
            this.f2417e = C0723G.e(name2);
        }

        public final u a() {
            u b4 = b();
            b bVar = this.f2416d.f3843j;
            boolean z4 = bVar.e() || bVar.f() || bVar.g() || bVar.h();
            Z0.u uVar = this.f2416d;
            if (uVar.f3850q) {
                if (z4) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (uVar.f3840g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            l.d(randomUUID, "randomUUID()");
            i(randomUUID);
            return b4;
        }

        public abstract u b();

        public final boolean c() {
            return this.f2414b;
        }

        public final UUID d() {
            return this.f2415c;
        }

        public final Set e() {
            return this.f2417e;
        }

        public abstract a f();

        public final Z0.u g() {
            return this.f2416d;
        }

        public final a h(b bVar) {
            l.e(bVar, "constraints");
            this.f2416d.f3843j = bVar;
            return f();
        }

        public final a i(UUID uuid) {
            l.e(uuid, "id");
            this.f2415c = uuid;
            String uuid2 = uuid.toString();
            l.d(uuid2, "id.toString()");
            this.f2416d = new Z0.u(uuid2, this.f2416d);
            return f();
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public b() {
        }
    }

    public u(UUID uuid, Z0.u uVar, Set set) {
        l.e(uuid, "id");
        l.e(uVar, "workSpec");
        l.e(set, "tags");
        this.f2410a = uuid;
        this.f2411b = uVar;
        this.f2412c = set;
    }

    public UUID a() {
        return this.f2410a;
    }

    public final String b() {
        String uuid = a().toString();
        l.d(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f2412c;
    }

    public final Z0.u d() {
        return this.f2411b;
    }
}
