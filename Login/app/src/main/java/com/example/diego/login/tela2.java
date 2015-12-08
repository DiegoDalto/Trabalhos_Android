package com.example.diego.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Diego on 10/11/2015.
 */
public class tela2 extends Activity{
    EditText username1, senha1;
    String username, senha;
    TextView erro2;
    Button logar, voltar;
    Intent j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();

        username = i.getStringExtra("usename");
        senha = i.getStringExtra("senha");

        username1 = (EditText) findViewById(R.id.editText2);
        senha1 = (EditText) findViewById(R.id.editText);

        erro2 = (TextView) findViewById(R.id.textView4);

        logar = (Button) findViewById(R.id.button3);
        voltar = (Button) findViewById(R.id.button2);

    }

    public void voltarCadastrar(View view){
        j = new Intent(getBaseContext(),MainActivity.class);
        startActivity(j);
    }

    public void botaoLogar(View view){

        if((!username1.getText().toString().equals(username))&&(!senha1.getText().toString().equals(senha))){
            erro2.setVisibility(View.VISIBLE);
        }else {
            erro2.setVisibility(View.INVISIBLE);
            j = new Intent(getBaseContext(),tela3.class);
            startActivity(j);
        }
    }
}
