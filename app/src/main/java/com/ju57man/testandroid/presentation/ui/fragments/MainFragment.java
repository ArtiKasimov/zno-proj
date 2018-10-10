package com.ju57man.testandroid.presentation.ui.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ju57man.testandroid.R;
import com.ju57man.testandroid.model.interactor.MainInteractor;
import com.ju57man.testandroid.model.repository.MainRepository;
import com.ju57man.testandroid.presentation.presenter.MainPresenter;
import com.ju57man.testandroid.view.MainView;

public class MainFragment extends Fragment  implements MainView{

    // architecture
    private MainPresenter presenter;

    // TODO declared global variables


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new MainPresenter(this,
                new MainInteractor(new MainRepository())
        );
        // TODO get Bundle data
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mainFragment = inflater.inflate(R.layout.fragment_main, container, false);
        // TODO define view components
        return mainFragment;
    }
}
