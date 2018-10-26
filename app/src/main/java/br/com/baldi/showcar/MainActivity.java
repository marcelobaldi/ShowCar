package br.com.baldi.showcar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import br.com.baldi.showcar.Models.MainModel;
import br.com.baldi.showcar.controllers.MainController;
import br.com.baldi.showcar.fragments.ListFragment;
import br.com.baldi.showcar.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {
    private MainController mController;
    private MainModel mModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.main_activity);

        //Instanciar Classes
        mModel = new MainModel();
        mController = new MainController( mModel );

        //Verificar Se Usuário Esta Logado
        boolean isLogged = false;
        Fragment currentFragment = isLogged ? new ListFragment() : new LoginFragment();

        //Chamar o Fragment Manager
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, currentFragment)
                .commit();
    }

    public MainController getMainController() {
        return mController;
    }

    public MainModel getMainModel() {
        return mModel;
    }
}