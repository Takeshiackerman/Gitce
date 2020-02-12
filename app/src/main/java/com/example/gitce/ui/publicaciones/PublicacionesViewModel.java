package com.example.gitce.ui.publicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PublicacionesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PublicacionesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estas son las publicaciones");
    }

    public LiveData<String> getText() {
        return mText;
    }
}