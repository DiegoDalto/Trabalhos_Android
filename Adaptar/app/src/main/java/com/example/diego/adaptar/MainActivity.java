package com.example.diego.adaptar;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BancoHelper bh;
    private ListView listView;
    private List<Item> itens;
    Banco b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listItens);

        bh = new BancoHelper(getBaseContext());

        itens = bh.getAllLanches();

        CustonAdapter custonAdapter = new CustonAdapter( itens, getApplicationContext());
        listView.setAdapter(custonAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Item item = new Item();
                item.setNome("Jasane" + itens.size());
                item.setTelefone("9913-2931");
                item.setImagem(R.drawable.images);
                bh.addLanche(item);

                itens.add(item);

                CustonAdapter custonAdapter = new CustonAdapter( itens, getApplicationContext());
                listView.setAdapter(custonAdapter);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                //função de delete
                itens.get(position).setImagem(R.drawable.images);
                //usando função de update
                bh.updateLanche(itens.get(position));
                atualizaLista();
            }
        });
    }
    private void atualizaLista(){
        itens = bh.getAllLanches();

        CustonAdapter custonAdapter = new CustonAdapter((ArrayList<Item>)itens, getApplicationContext());
        listView.setAdapter(custonAdapter);
    }
}