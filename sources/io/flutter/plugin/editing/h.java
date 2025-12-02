package io.flutter.plugin.editing;

import M2.b;
import X2.t;
import X2.x;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.i;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class h extends BaseInputConnection implements i.b {

    /* renamed from: a  reason: collision with root package name */
    public final View f10423a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10424b;

    /* renamed from: c  reason: collision with root package name */
    public final t f10425c;

    /* renamed from: d  reason: collision with root package name */
    public final x f10426d;

    /* renamed from: e  reason: collision with root package name */
    public final i f10427e;

    /* renamed from: f  reason: collision with root package name */
    public final EditorInfo f10428f;

    /* renamed from: g  reason: collision with root package name */
    public ExtractedTextRequest f10429g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10430h;

    /* renamed from: i  reason: collision with root package name */
    public CursorAnchorInfo.Builder f10431i;

    /* renamed from: j  reason: collision with root package name */
    public ExtractedText f10432j;

    /* renamed from: k  reason: collision with root package name */
    public InputMethodManager f10433k;

    /* renamed from: l  reason: collision with root package name */
    public final Layout f10434l;

    /* renamed from: m  reason: collision with root package name */
    public a f10435m;

    /* renamed from: n  reason: collision with root package name */
    public final a f10436n;

    /* renamed from: o  reason: collision with root package name */
    public int f10437o;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, int i4, x xVar, t tVar, a aVar, i iVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        i iVar2 = iVar;
        this.f10430h = false;
        this.f10432j = new ExtractedText();
        this.f10437o = 0;
        this.f10423a = view;
        this.f10424b = i4;
        this.f10426d = xVar;
        this.f10425c = tVar;
        this.f10427e = iVar2;
        iVar2.a(this);
        this.f10428f = editorInfo;
        this.f10436n = aVar;
        this.f10435m = new a(flutterJNI);
        this.f10434l = new DynamicLayout(iVar2, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10433k = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    public void a(boolean z4, boolean z5, boolean z6) {
        this.f10433k.updateSelection(this.f10423a, this.f10427e.i(), this.f10427e.h(), this.f10427e.g(), this.f10427e.f());
        ExtractedTextRequest extractedTextRequest = this.f10429g;
        if (extractedTextRequest != null) {
            this.f10433k.updateExtractedText(this.f10423a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f10430h) {
            this.f10433k.updateCursorAnchorInfo(this.f10423a, c());
        }
    }

    public final boolean b(int i4) {
        if (i4 == 16908319) {
            setSelection(0, this.f10427e.length());
            return true;
        } else if (i4 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f10427e);
            int selectionEnd = Selection.getSelectionEnd(this.f10427e);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f10423a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f10427e.subSequence(min, max)));
                this.f10427e.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i4 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f10427e);
            int selectionEnd2 = Selection.getSelectionEnd(this.f10427e);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f10423a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f10427e.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i4 != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f10423a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f10423a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f10427e));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f10427e));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f10427e.delete(min2, max4);
                }
                this.f10427e.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    public boolean beginBatchEdit() {
        this.f10427e.b();
        this.f10437o++;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f10431i;
        if (builder == null) {
            this.f10431i = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f10431i.setSelectionRange(this.f10427e.i(), this.f10427e.h());
        int g4 = this.f10427e.g();
        int f4 = this.f10427e.f();
        if (g4 < 0 || f4 <= g4) {
            this.f10431i.setComposingText(-1, "");
        } else {
            this.f10431i.setComposingText(g4, this.f10427e.toString().subSequence(g4, f4));
        }
        return this.f10431i.build();
    }

    public boolean clearMetaKeyStates(int i4) {
        return super.clearMetaKeyStates(i4);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f10427e.l(this);
        while (this.f10437o > 0) {
            endBatchEdit();
            this.f10437o--;
        }
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i4, Bundle bundle) {
        if ((i4 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f10423a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h4 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h4);
                                hashMap.put("uri", contentUri.toString());
                                this.f10426d.b(this.f10424b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public boolean commitText(CharSequence charSequence, int i4) {
        return super.commitText(charSequence, i4);
    }

    public final ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f10432j;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f10427e.i();
        this.f10432j.selectionEnd = this.f10427e.h();
        this.f10432j.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f10427e.toString() : this.f10427e;
        return this.f10432j;
    }

    public boolean deleteSurroundingText(int i4, int i5) {
        if (this.f10427e.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i4, i5);
    }

    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        return super.deleteSurroundingTextInCodePoints(i4, i5);
    }

    public final boolean e(boolean z4, boolean z5) {
        int selectionStart = Selection.getSelectionStart(this.f10427e);
        int selectionEnd = Selection.getSelectionEnd(this.f10427e);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z4 ? Math.max(this.f10435m.b(this.f10427e, selectionEnd), 0) : Math.min(this.f10435m.a(this.f10427e, selectionEnd), this.f10427e.length());
        if (selectionStart != selectionEnd || z5) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f10437o--;
        this.f10427e.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f10428f;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f10427e);
            int selectionEnd = Selection.getSelectionEnd(this.f10427e);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f10427e.delete(min, max);
                }
                this.f10427e.insert(min, String.valueOf((char) unicodeChar));
                int i4 = min + 1;
                setSelection(i4, i4);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean z4, boolean z5) {
        int selectionStart = Selection.getSelectionStart(this.f10427e);
        int selectionEnd = Selection.getSelectionEnd(this.f10427e);
        boolean z6 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z5) {
            z6 = true;
        }
        beginBatchEdit();
        if (z6) {
            if (z4) {
                Selection.moveUp(this.f10427e, this.f10434l);
            } else {
                Selection.moveDown(this.f10427e, this.f10434l);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f10427e);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z4) {
                Selection.extendUp(this.f10427e, this.f10434l);
            } else {
                Selection.extendDown(this.f10427e, this.f10434l);
            }
            setSelection(Selection.getSelectionStart(this.f10427e), Selection.getSelectionEnd(this.f10427e));
        }
        endBatchEdit();
        return true;
    }

    public Editable getEditable() {
        return this.f10427e;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i4) {
        boolean z4 = true;
        boolean z5 = (i4 & 1) != 0;
        if (this.f10429g != null) {
            z4 = false;
        }
        if (z5 == z4) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z5 ? "on" : "off");
            b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10429g = z5 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public final byte[] h(InputStream inputStream, int i4) {
        int i5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i4];
        while (true) {
            try {
                i5 = inputStream.read(bArr);
            } catch (IOException unused) {
                i5 = -1;
            }
            if (i5 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i5);
        }
    }

    public boolean performContextMenuAction(int i4) {
        beginBatchEdit();
        boolean b4 = b(i4);
        endBatchEdit();
        return b4;
    }

    public boolean performEditorAction(int i4) {
        if (i4 == 0) {
            this.f10426d.o(this.f10424b);
        } else if (i4 == 1) {
            this.f10426d.g(this.f10424b);
        } else if (i4 == 2) {
            this.f10426d.f(this.f10424b);
        } else if (i4 == 3) {
            this.f10426d.l(this.f10424b);
        } else if (i4 == 4) {
            this.f10426d.m(this.f10424b);
        } else if (i4 == 5) {
            this.f10426d.h(this.f10424b);
        } else if (i4 != 7) {
            this.f10426d.e(this.f10424b);
        } else {
            this.f10426d.j(this.f10424b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f10426d.i(this.f10424b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i4) {
        if ((i4 & 1) != 0) {
            this.f10433k.updateCursorAnchorInfo(this.f10423a, c());
        }
        boolean z4 = (i4 & 2) != 0;
        if (z4 != this.f10430h) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z4 ? "on" : "off");
            b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10430h = z4;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f10436n.b(keyEvent);
    }

    public boolean setComposingRegion(int i4, int i5) {
        return super.setComposingRegion(i4, i5);
    }

    public boolean setComposingText(CharSequence charSequence, int i4) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i4) : super.setComposingText(charSequence, i4);
        endBatchEdit();
        return commitText;
    }

    public boolean setSelection(int i4, int i5) {
        beginBatchEdit();
        boolean selection = super.setSelection(i4, i5);
        endBatchEdit();
        return selection;
    }

    public h(View view, int i4, x xVar, t tVar, a aVar, i iVar, EditorInfo editorInfo) {
        this(view, i4, xVar, tVar, aVar, iVar, editorInfo, new FlutterJNI());
    }
}
