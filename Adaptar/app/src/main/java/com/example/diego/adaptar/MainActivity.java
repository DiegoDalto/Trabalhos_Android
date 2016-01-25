package com.example.diego.adaptar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private ArrayList<Item> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listItens);
        itens=new ArrayList<Item>();
        Popula();
        CustonAdapter custonAdapter = new CustonAdapter(itens,getApplicationContext());
        listView.setAdapter(custonAdapter);
    }

    private void Popula(){
        itens.add(new Item("Amanda","9913-2931",R.drawable.images ));
        itens.add(new Item("Andressa","9831-2341", R.drawable.imagen3 ));
        itens.add(new Item("Mariana", "9987-3412", R.drawable.imagens2));
        itens.add(new Item("Heloisa", "9813-2200", R.drawable.imagem4 ));

    }
}