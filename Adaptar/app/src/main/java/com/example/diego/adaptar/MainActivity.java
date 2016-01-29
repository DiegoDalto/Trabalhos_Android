package com.example.diego.adaptar;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    private ArrayList<Item> itens;
    Banco b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = new Banco(getBaseContext(), "itens", null, 1);
        setContentView(R.layout.activity_main);

        listView =(ListView)findViewById(R.id.listItens);
        itens=new ArrayList<Item>();
        consultaBanco();
        CustonAdapter custonAdapter = new CustonAdapter(itens,getApplicationContext());
        listView.setAdapter(custonAdapter);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Item item = new Item();
                item.setNome("Jasane");
                item.setTelefone("9913-2931");
                item.setImagem(R.drawable.images);
                Insere(item);

            }
        });
    }


    private void consultaBanco() {
        String sql = "SELECT  nome,telefone, imagem FROM pessoa";
        itens = new ArrayList<Item>();
        Cursor cursor = b.buscar(sql);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            for (int i = 0; i < cursor.getCount(); i++) {
                Item l = new Item();
                l.setNome(cursor.getString(0));
                l.setTelefone(cursor.getString(1));
                l.setImagem(Integer.parseInt(cursor.getString(2)));
                itens.add(l);
                cursor.moveToNext();
            }
        }
    }

    private void Insere(Item item) {

        SQLiteDatabase base = b.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", item.getNome());
        values.put("telefone", item.getTelefone());
        values.put("imagem", item.getImagem());

        long resultado = base.insert("pessoa", null, values);

        if (resultado != -1) {
            consultaBanco();
            CustonAdapter custonAdapter = new CustonAdapter(itens, getApplicationContext());
            listView.setAdapter(custonAdapter);
            Toast.makeText(this, "Deu Certo", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show();
        }
    }

}