package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WebViewActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public final BroadcastReceiver f10604c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final WebViewClient f10605d = new b();

    /* renamed from: e  reason: collision with root package name */
    public WebView f10606e;

    /* renamed from: f  reason: collision with root package name */
    public final IntentFilter f10607f = new IntentFilter("close action");

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }

    public class c extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f10606e.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f10606e.loadUrl(str);
                return true;
            }
        }

        public c() {
        }

        public boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f10606e.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z4, boolean z5, Bundle bundle) {
        return new Intent(context, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z4).putExtra("enableDomStorage", z5).putExtra("com.android.browser.headers", bundle);
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            hashMap.put(next, bundle.getString(next));
        }
        return hashMap;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f10606e = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f10606e.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f10606e.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f10606e.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f10606e.setWebViewClient(this.f10605d);
        this.f10606e.getSettings().setSupportMultipleWindows(true);
        this.f10606e.setWebChromeClient(new c());
        H.a.i(this, this.f10604c, this.f10607f, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f10604c);
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !this.f10606e.canGoBack()) {
            return super.onKeyDown(i4, keyEvent);
        }
        this.f10606e.goBack();
        return true;
    }
}
