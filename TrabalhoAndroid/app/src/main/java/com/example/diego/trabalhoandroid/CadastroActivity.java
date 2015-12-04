package com.example.diego.trabalhoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {
    EditText nome;
    TextView codigo;
    EditText preco;
    EditText recheio;
    Button cadastrar;
    Button voltar;
    TextView erro;
    int cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if(b != null){
            cod = (int) b.get("count");
        }

        codigo = (TextView) findViewById(R.id.textView18);
        nome = (EditText) findViewById(R.id.editText2);
        preco = (EditText) findViewById(R.id.editText4);
        recheio = (EditText) findViewById(R.id.editText5);

        cadastrar = (Button) findViewById(R.id.button2);
        voltar = (Button) findViewById(R.id.button);

        erro = (TextView) findViewById(R.id.textView13);


        codigo.setText(cod+"");
    }
    public void Cadastrar(View view){

        Lanche lanche = new Lanche();

        lanche.setNome(nome.getText().toString());
        lanche.setPreco(preco.getText().toString());
        lanche.setRecheio(recheio.getText().toString());
        lanche.setCodigo(cod);
        MainActivity.lanches[cod] = lanche;
        cod++;
        Intent i = new Intent(getBaseContext(),MainActivity.class);
        i.putExtra("lancheCadastrado", lanche);

        startActivity(i);
    }

    public void Voltar(View view){
        Intent i = new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
    }

  }
