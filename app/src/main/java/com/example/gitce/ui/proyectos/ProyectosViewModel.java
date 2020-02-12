package com.example.gitce.ui.proyectos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProyectosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProyectosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estos son los proyectos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}