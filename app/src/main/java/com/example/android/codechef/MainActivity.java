package com.example.android.codechef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String htmlAsString = getString(R.string.html);      // used by WebView
        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);


    }
}
