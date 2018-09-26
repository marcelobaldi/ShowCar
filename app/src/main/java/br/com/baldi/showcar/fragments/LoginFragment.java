package br.com.baldi.showcar.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import br.com.baldi.showcar.R;

public class LoginFragment extends Fragment {


    protected Button btnLogin;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.login_fragment, container, false);
        initComponents( rootView );
        return rootView;
    }

    private void initComponents(View view){
        btnLogin = view.findViewById( R.id.btn_login );
        btnLogin.setOnClickListener( onClick );
    }

    View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getContext(), "LOGIN OK", Toast.LENGTH_SHORT).show();

            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace( R.id.fragment_container, new ListFragment() )
                    .commit();  //excecutando a operação (chamando);


        }
    };
}
