package h1;

import java.util.Map;

/* renamed from: h1.f  reason: case insensitive filesystem */
public class C0658f {

    /* renamed from: a  reason: collision with root package name */
    public final String f9620a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f9621b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f9622c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f9623d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f9624e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f9625f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f9626g;

    public C0658f(String str, Integer num, Integer num2, Long l4, Boolean bool, Integer num3, Integer num4) {
        this.f9620a = str;
        this.f9621b = num;
        this.f9622c = num2;
        this.f9623d = l4;
        this.f9624e = bool;
        this.f9625f = num3;
        this.f9626g = num4;
    }

    public static C0658f a(Map map) {
        return new C0658f((String) map.get("key"), (Integer) map.get("scanType"), (Integer) map.get("cameraFace"), (Long) map.get("delayMillis"), (Boolean) map.get("continuous"), (Integer) map.get("scannerWidth"), (Integer) map.get("scannerHeight"));
    }

    public Integer b() {
        return this.f9626g;
    }

    public Integer c() {
        return this.f9625f;
    }
}
