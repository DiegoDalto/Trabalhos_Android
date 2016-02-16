package com.example.diego.adaptar;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dalto .
 */
public class Banco extends SQLiteOpenHelper {

    private SQLiteDatabase db;
    public Banco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE lanche(_id integer primary key autoincrement,nome TEXT, telefone TEXT, imagem INTEGER)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS lanche";
        db.execSQL(sql);

    }

    public Cursor buscar(String sql) {
        return getWritableDatabase().rawQuery(sql, null);
    }

    public int updateLanche(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("nome", item.getNome());
        values.put("telefone", item.getTelefone());
        // updating row
        return db.update("itens", values, "_id = ?", new String[]{String.valueOf(item.getId())});
    }

    public void deleteLanche(Item item) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("lanche", "_id = ?", new String[]{String.valueOf(item.getId())});
        db.close();

    }
}
