package com.ju57man.testandroid.presentation.presenter;

import com.ju57man.testandroid.model.interactor.MainInteractor;
import com.ju57man.testandroid.view.MainView;

public class MainPresenter {

    private MainView view;
    private MainInteractor interactor;

    public MainPresenter(MainView view, MainInteractor interactor) {
        this.view = view;
        this.interactor = interactor;
    }


    public void detachView() {
        this.view = null;
    }
}
