package com.example.gitce.ui.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.gitce.R;

public class InicioViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public InicioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el Inicio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}