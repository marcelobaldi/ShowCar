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
import br.com.baldi.showcar.network.RestClient;
import br.com.baldi.showcar.presenters.LoginPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends BaseFragment implements LoginPresenter {

    @BindView( R.id.edt_email )
    EditText edtEmail;

    @BindView( R.id.edt_password )
    EditText edtPassword;

    @Override
    public int getLayoutResource() {
        return R.layout.login_fragment;
    }

    @OnClick(R.id.btn_login)
    public void onClick(){
//              getActivity().getSupportFragmentManager().beginTransaction()
//                .replace( R.id.fragment_container, new ListFragment() )
//                .commit();  //excecutando a operação (chamando);

        if(true){
            getModel().setEmail( edtEmail.getText().toString() );
            getModel().setPassword( edtPassword.getText().toString() );
            getController().login( this );
        }else{
            //TAREFA -
            // A)  fazer checagem se e-mail e senha estão preenchidos
            //B) Mostrar SnackBar Com mensagem "E-mail e senha invalidos"
            //C) checar se o e-mail está cokm padrão certo (conferir @, ., etc) e a senha maior que 6 caracteres
        }
    }

    @Override
    public void onSucess() {
        Toast.makeText( getContext(), "Sucesso", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onError() {

    }
}