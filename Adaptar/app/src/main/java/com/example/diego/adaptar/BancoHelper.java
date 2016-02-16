package com.example.diego.adaptar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 04/02/2016.
 */
public class BancoHelper  extends SQLiteOpenHelper {


    // Vercao do Banco
    private static final int DATABASE_VERSION = 1;

    // Nome da Base de dados
    private static final String DATABASE_NAME = "lanchonete";

    // Nome da tabela
    private static final String TABLE_NAME = "lanche";



    public BancoHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Criando tabela
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE lanche(_id INTEGER PRIMARY KEY  AUTOINCREMENT,nome TEXT, telefone TEXT, imagem integer)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Deletando tabela existente
        db.execSQL("DROP TABLE IF EXISTS item" );
        // Criando nova tabela
        onCreate(db);
    }

    /**
     *  CRUD(Create, Read, Update, Delete)
     */

    // Adicionando novo Lanche
    public void addLanche(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", item.getNome());
        values.put("telefone", item.getTelefone());
        values.put("imagem", item.getImagem());

        // Inserindo valor
        db.insert(TABLE_NAME, null, values);
        //Fechando conexao
        db.close();
    }

    // Retorna um unico lanche
    public  Item getLanche(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "SELECT _id,  nome,telefone ,imagem FROM lanche where _id = ?";

        Cursor cursor = db.rawQuery(sql,new String[]{ String.valueOf(id)});

        if (cursor != null){
            cursor.moveToFirst();

            Item item = new Item();
            item.setId(cursor.getInt(0));
            item.setNome(cursor.getString(1));
            item.setTelefone(cursor.getString(2));
            item.setImagem(cursor.getInt(3));

            // return lanche
            return item;

        }
        return  null;

    }

    // Obtendo todos os lanches
    public List<Item> getAllLanches() {
        List<Item> itens = new ArrayList<Item>();
        // Sql da consulta da base de dados
        String sql = "SELECT _id,  nome,telefone,imagem FROM lanche";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        // looping Povoando a lista de Lanches
        if (cursor.moveToFirst()) {
            do {
                Item item = new Item();
                item.setId(cursor.getInt(0));
                item.setNome(cursor.getString(1));
                item.setTelefone(cursor.getString(2));
                item.setImagem(cursor.getInt(3));
                // Adicionando elemento a lista
                itens.add(item);
            } while (cursor.moveToNext());
        }
        return itens;
    }

    // Updating um unico lanche
    public int updateLanche(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", item.getNome());
        values.put("telefone", item.getTelefone());
        values.put("imagem",item.getImagem());

        // updating row
        return db.update(TABLE_NAME, values,  "_id = ?",
                new String[] { String.valueOf(item.getId()) });
    }

    // Delettando um item
    public void deleteLanche(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, " _id= ?",
                new String[] { String.valueOf(item.getId()) });
        db.close();
    }

    // Obter quantidade de Lanches
    public int getLanchesCount() {
        String countQuery = "SELECT  * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        // return count
        return cursor.getCount();
    }
}