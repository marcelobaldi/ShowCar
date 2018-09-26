package br.com.baldi.showcar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.baldi.showcar.fragments.ListFragment;
import br.com.baldi.showcar.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.main_activity);

        //Chamar o Fragment Manager
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, new LoginFragment())
                .commit();


    }
}
