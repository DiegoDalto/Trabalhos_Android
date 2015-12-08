package com.example.diego.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Diego on 10/11/2015.
 */
public class tela3 extends Activity{

    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ok);

        voltar = (Button) findViewById(R.id.button);

    }

    public void voltarLogin(View view){
        Intent i = new Intent(getBaseContext(),tela2.class);
        startActivity(i);
    }

}
