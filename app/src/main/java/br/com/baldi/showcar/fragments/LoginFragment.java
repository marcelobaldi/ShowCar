package br.com.baldi.showcar.fragments;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import br.com.baldi.showcar.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends Fragment {

    @BindView( R.id.edt_email )
    EditText edtEmail;

    @BindView( R.id.edt_password )
    EditText edtPassword;

    protected Button btnLogin;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.login_fragment, container, false);
        ButterKnife.bind(rootView);
        return rootView;
    }

    @OnClick(R.id.btn_login)
    public void onClick(){
        Toast.makeText(getContext(), "LOGIN OK", Toast.LENGTH_SHORT).show();

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace( R.id.fragment_container, new ListFragment() )
                .commit();  //excecutando a operação (chamando);
    }
}