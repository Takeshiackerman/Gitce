package com.example.gitce.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.gitce.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiliaFragment extends Fragment {
    WebView lilia;
    public LiliaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_lilia, container, false);
        lilia=(WebView)root.findViewById(R.id.lilia_docs);
        lilia.getSettings().setJavaScriptEnabled(true);
        lilia.setWebViewClient(new WebViewClient());
        lilia.loadUrl("https://scholar.google.com/citations?user=QALZFgMAAAAJ&hl=es");
        return root;
    }
}
