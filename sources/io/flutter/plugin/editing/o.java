package io.flutter.plugin.editing;

import M2.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f10459a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f10460b;

    /* renamed from: c  reason: collision with root package name */
    public int f10461c;

    /* renamed from: d  reason: collision with root package name */
    public int f10462d;

    /* renamed from: e  reason: collision with root package name */
    public int f10463e;

    /* renamed from: f  reason: collision with root package name */
    public int f10464f;

    /* renamed from: g  reason: collision with root package name */
    public int f10465g;

    /* renamed from: h  reason: collision with root package name */
    public int f10466h;

    public o(CharSequence charSequence, int i4, int i5, CharSequence charSequence2, int i6, int i7, int i8, int i9) {
        this.f10463e = i6;
        this.f10464f = i7;
        this.f10465g = i8;
        this.f10466h = i9;
        a(charSequence, charSequence2.toString(), i4, i5);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i4, int i5) {
        this.f10459a = charSequence;
        this.f10460b = charSequence2;
        this.f10461c = i4;
        this.f10462d = i5;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f10459a.toString());
            jSONObject.put("deltaText", this.f10460b.toString());
            jSONObject.put("deltaStart", this.f10461c);
            jSONObject.put("deltaEnd", this.f10462d);
            jSONObject.put("selectionBase", this.f10463e);
            jSONObject.put("selectionExtent", this.f10464f);
            jSONObject.put("composingBase", this.f10465g);
            jSONObject.put("composingExtent", this.f10466h);
        } catch (JSONException e4) {
            b.b("TextEditingDelta", "unable to create JSONObject: " + e4);
        }
        return jSONObject;
    }

    public o(CharSequence charSequence, int i4, int i5, int i6, int i7) {
        this.f10463e = i4;
        this.f10464f = i5;
        this.f10465g = i6;
        this.f10466h = i7;
        a(charSequence, "", -1, -1);
    }
}
