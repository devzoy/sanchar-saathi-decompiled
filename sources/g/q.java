package G;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f1232a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f1233b;

    /* renamed from: c  reason: collision with root package name */
    public String f1234c;

    /* renamed from: d  reason: collision with root package name */
    public String f1235d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1236e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1237f;

    public static class a {
        public static q a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.b(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(q qVar) {
            return new Person.Builder().setName(qVar.e()).setIcon(qVar.c() != null ? qVar.c().u() : null).setUri(qVar.f()).setKey(qVar.d()).setBot(qVar.g()).setImportant(qVar.h()).build();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f1238a;

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f1239b;

        /* renamed from: c  reason: collision with root package name */
        public String f1240c;

        /* renamed from: d  reason: collision with root package name */
        public String f1241d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1242e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1243f;

        public q a() {
            return new q(this);
        }

        public b b(boolean z4) {
            this.f1242e = z4;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f1239b = iconCompat;
            return this;
        }

        public b d(boolean z4) {
            this.f1243f = z4;
            return this;
        }

        public b e(String str) {
            this.f1241d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f1238a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f1240c = str;
            return this;
        }
    }

    public q(b bVar) {
        this.f1232a = bVar.f1238a;
        this.f1233b = bVar.f1239b;
        this.f1234c = bVar.f1240c;
        this.f1235d = bVar.f1241d;
        this.f1236e = bVar.f1242e;
        this.f1237f = bVar.f1243f;
    }

    public static q a(Person person) {
        return a.a(person);
    }

    public static q b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.a(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean("isBot")).d(bundle.getBoolean("isImportant")).a();
    }

    public IconCompat c() {
        return this.f1233b;
    }

    public String d() {
        return this.f1235d;
    }

    public CharSequence e() {
        return this.f1232a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String d4 = d();
        String d5 = qVar.d();
        return (d4 == null && d5 == null) ? Objects.equals(Objects.toString(e()), Objects.toString(qVar.e())) && Objects.equals(f(), qVar.f()) && Boolean.valueOf(g()).equals(Boolean.valueOf(qVar.g())) && Boolean.valueOf(h()).equals(Boolean.valueOf(qVar.h())) : Objects.equals(d4, d5);
    }

    public String f() {
        return this.f1234c;
    }

    public boolean g() {
        return this.f1236e;
    }

    public boolean h() {
        return this.f1237f;
    }

    public int hashCode() {
        String d4 = d();
        return d4 != null ? d4.hashCode() : Objects.hash(new Object[]{e(), f(), Boolean.valueOf(g()), Boolean.valueOf(h())});
    }

    public Person i() {
        return a.b(this);
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f1232a);
        IconCompat iconCompat = this.f1233b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.t() : null);
        bundle.putString("uri", this.f1234c);
        bundle.putString("key", this.f1235d);
        bundle.putBoolean("isBot", this.f1236e);
        bundle.putBoolean("isImportant", this.f1237f);
        return bundle;
    }
}
