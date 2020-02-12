package com.example.gitce.ui.noticias;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NoticiasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NoticiasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estas son las noticias");
    }

    public LiveData<String> getText() {
        return mText;
    }
}