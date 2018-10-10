package com.ju57man.testandroid.model.interactor;

import com.ju57man.testandroid.model.repository.MainRepository;

public class MainInteractor {

    MainRepository repository;

    public MainInteractor(MainRepository repository) {
        this.repository = repository;
    }
}
