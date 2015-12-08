package com.example.diego.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class telaCadastro extends AppCompatActivity {

    Button cadastrar;
    EditText username, senha, confirmaSenha;
    TextView erro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        username = (EditText) findViewById(R.id.editText3);
        senha = (EditText) findViewById(R.id.editText4);
        erro1 = (TextView) findViewById(R.id.textView9);
        cadastrar = (Button) findViewById(R.id.button4);
    }


    public void Voltar(View view){
        finish();
    }

    public void Salvar(View view){

        String usuario = username.getText().toString();
        String password = senha.getText().toString();

        if(usuario.equals("") || password.equals("")){
            Toast.makeText(getApplicationContext(), "Campo Vazio", Toast.LENGTH_LONG).show();
        }else{

            User user = new User();

            user.setNome(usuario);
            user.setSenha(password);

            UserCollections.getInstance().getUsuarios().add(user);
            Toast.makeText(getApplicationContext(), "Cadastrado com sucesso", Toast.LENGTH_LONG).show();

            finish();
        }

    }
}
