package com.example.diego.trabalhoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    TextView codigo;
    TextView nome;
    TextView preco;
    TextView recheio;
    int cod;
    String nomeRecibido, precoRecibido, recheioRecibido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        if(b != null){
            cod = (int) b.get("id");
            nomeRecibido = (String) b.get("nome");
            precoRecibido = (String) b.get("preco");
            recheioRecibido = (String) b.get("recheio");
        }


        codigo = (TextView)findViewById(R.id.textView14);
        nome = (TextView)findViewById(R.id.textView15);
        preco = (TextView)findViewById(R.id.textView16);
        recheio = (TextView)findViewById(R.id.textView17);

        codigo.setText(cod+"");
        nome.setText(nomeRecibido);
        preco.setText(precoRecibido);
        recheio.setText(recheioRecibido);

    }

    public void Voltar(View view){
        Intent i = new Intent(getBaseContext(),MainActivity.class);
        startActivity(i);
    }
}
