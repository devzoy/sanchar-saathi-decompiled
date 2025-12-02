package io.flutter.plugin.editing;

import X2.v;
import Y2.j;
import Z2.a;
import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class n implements v.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final v f10455a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f10456b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f10457c;

    /* renamed from: d  reason: collision with root package name */
    public j.d f10458d;

    public n(TextServicesManager textServicesManager, v vVar) {
        this.f10456b = textServicesManager;
        this.f10455a = vVar;
        vVar.b(this);
    }

    public void a(String str, String str2, j.d dVar) {
        if (this.f10458d != null) {
            dVar.b("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f10458d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f10455a.b((v.b) null);
        SpellCheckerSession spellCheckerSession = this.f10457c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b4 = a.b(str);
        if (this.f10457c == null) {
            this.f10457c = this.f10456b.newSpellCheckerSession((Bundle) null, b4, this, true);
        }
        this.f10457c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f10458d.a(new ArrayList());
            this.f10458d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f10458d.a(new ArrayList());
            this.f10458d = null;
            return;
        }
        for (int i4 = 0; i4 < sentenceSuggestionsInfo.getSuggestionsCount(); i4++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i4);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i4);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i4) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = false;
                for (int i5 = 0; i5 < suggestionsCount; i5++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i5);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z4 = true;
                    }
                }
                if (z4) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f10458d.a(arrayList);
        this.f10458d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
