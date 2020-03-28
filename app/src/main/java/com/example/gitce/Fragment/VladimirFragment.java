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
public class VladimirFragment extends Fragment {
    WebView vladimir;
    public VladimirFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_vladimir, container, false);
        vladimir=(WebView)root.findViewById(R.id.vladi_docs);
        vladimir.getSettings().setJavaScriptEnabled(true);
        vladimir.setWebViewClient(new WebViewClient());
        vladimir.loadUrl("https://scholar.google.com/citations?hl=en&view_op=list_works&gmla=AJsN-F4SnMzqh4O2i8sBloUPKQmH_WlywUsHx-4AjwVFKoWJdSSjYVo6Ibdvo0OSr679-CVBNCdJJ9Xp1_L-rwCsnD7JSUg1tQ&user=52pqkbwAAAAJ");
        return root;
    }
}
