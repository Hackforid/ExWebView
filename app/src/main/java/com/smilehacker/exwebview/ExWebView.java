package com.smilehacker.exwebview;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by zhouquan on 17/1/2.
 */

public class ExWebView extends WebView {
    public ExWebView(Context context) {
        super(context);
        init();
    }

    public ExWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setBackgroundColor(Color.WHITE);

        WebSettings settings = getSettings();
        settings.setAppCacheEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
        }
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(getContext().getExternalCacheDir().getPath());
    }

    @Override
    public void loadUrl(String url) {
        super.loadUrl(url);
    }
}
