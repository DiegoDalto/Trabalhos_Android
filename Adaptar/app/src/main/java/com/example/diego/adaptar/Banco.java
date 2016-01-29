package com.example.diego.adaptar;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dalto .
 */
public class Banco extends SQLiteOpenHelper {

    public Banco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE pessoa(_id integer primary key autoincrement,nome TEXT, telefone TEXT, imagem INTEGER)";
        db.execSQL(sql);
        /*
        sql = "INSERT INTO pessoa VALUES('1','dsad','9913-2931',"+R.drawable.images+")";
        db.execSQL(sql);
        sql = "INSERT INTO pessoa VALUES('2','Andressa','9831-2341',"+R.drawable.imagen3+")";;
        db.execSQL(sql);
        sql = "INSERT INTO pessoa VALUES('3','Mariana','9987-3412',"+R.drawable.imagens2+")";;
        db.execSQL(sql);
        sql = "INSERT INTO pessoa VALUES('4','Heloisa','9813-2200',"+R.drawable.imagem4+")";
        db.execSQL(sql);
        sql = "INSERT INTO pessoa VALUES('5','Momo','9734-2134',"+R.drawable.imagem5 +")";
        db.execSQL(sql);
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS pessoa";
        db.execSQL(sql);

    }

    public Cursor buscar(String sql) {
        return getWritableDatabase().rawQuery(sql, null);
    }



}
