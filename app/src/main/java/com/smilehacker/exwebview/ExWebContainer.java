package com.smilehacker.exwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;

/**
 * Created by zhouquan on 17/1/2.
 */

public class ExWebContainer extends FrameLayout  {
    public ExWebContainer(Context context) {
        super(context);
        init();
    }

    public ExWebContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExWebContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        WebView webView = new WebView(getContext());
        LayoutParams lp = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        addView(webView, lp);
    }
}
