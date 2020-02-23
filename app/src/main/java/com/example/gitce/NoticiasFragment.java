package com.example.gitce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gitce.R;

public class NoticiasFragment extends Fragment {
    WebView noti;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_noticias, container, false);
        noti=(WebView)root.findViewById(R.id.noticias);
        noti.getSettings().setJavaScriptEnabled(true);
        noti.setWebViewClient(new WebViewClient());
        noti.loadUrl("http://www.gitce.utp.ac.pa/vernot");
        return root;

    }
}