package com.example.gitce.ui.proyectos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.gitce.R;

public class ProyectosFragment extends Fragment {

    private ProyectosViewModel proyectosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        proyectosViewModel =
                ViewModelProviders.of(this).get(ProyectosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_proyectos, container, false);
        return root;
    }
}