package br.com.baldi.showcar.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.baldi.showcar.MainActivity;
import br.com.baldi.showcar.Models.MainModel;
import br.com.baldi.showcar.R;
import br.com.baldi.showcar.controllers.MainController;
import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    public abstract int getLayoutResource();

    public void initComponents(View rootView){

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(getLayoutResource(), container, false);
        initComponents( rootView );
        ButterKnife.bind(rootView);
        return rootView;
    }

    public MainController getController(){
        return ((MainActivity) getActivity()).getMainController();
    }

    public MainModel getModel(){
        return getController().getModel();
    }

}