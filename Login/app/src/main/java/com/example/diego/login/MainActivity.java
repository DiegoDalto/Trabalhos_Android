package com.example.diego.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cadastrar;
    EditText username, senha, confirmaSenha;
    TextView erro1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        username = (EditText) findViewById(R.id.editText3);
        senha = (EditText) findViewById(R.id.editText4);
        confirmaSenha = (EditText) findViewById(R.id.editText5);
        erro1 = (TextView) findViewById(R.id.textView9);
        cadastrar = (Button) findViewById(R.id.button4);
    }


    public void Cadastrar(View view){
        Bundle b = new Bundle();
        if(!senha.getText().toString().equals(confirmaSenha.getText().toString())){
            erro1.setVisibility(View.VISIBLE);
        }else {
            erro1.setVisibility(View.INVISIBLE);
            b.putString("username", username.getText().toString());
            b.putString("senha", senha.getText().toString());
            Intent i = new Intent(getBaseContext(),tela2.class);
            i.putExtras(b);
            startActivity(i);
        }
    }
}
