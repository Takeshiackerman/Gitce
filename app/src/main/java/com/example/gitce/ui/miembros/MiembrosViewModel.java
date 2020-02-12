package com.example.gitce.ui.miembros;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MiembrosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MiembrosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estos son los miembros");
    }

    public LiveData<String> getText() {
        return mText;
    }
}