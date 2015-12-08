package com.example.diego.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Diego on 10/11/2015.
 */
public class CadSucesso extends Activity{

    Button voltar;
    TextView nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sucesso);
        Intent i = new Intent();
        i = getIntent();

        String usuario = i.getStringExtra("usuario");

        nome = (TextView) findViewById(R.id.textView);

        nome.setText("Bem vindo " + usuario);


        voltar = (Button) findViewById(R.id.button);

    }

    public void voltarLogin(View view){
        Intent i = new Intent(getBaseContext(),Login.class);
        startActivity(i);
    }

}
