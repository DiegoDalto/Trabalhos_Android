package com.example.admin.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView campo1, campo2, operador, resul;
    Button botao7, botao0,botao1, botao2, botao3, botao4, botao5,
           botao6, botao8, botao9, botaoMais, botaoMenos, botaoDiv, botaoMult,botaoIgual;
    String resultado1="", resultado2="";
    double res=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo1= (TextView) findViewById(R.id.tvResultado);
        campo2 = (TextView) findViewById(R.id.textView3);
        operador = (TextView) findViewById(R.id.textView2);
        resul = (TextView) findViewById(R.id.textView4);

        botao0 = (Button) findViewById(R.id.button11);
        botao1 = (Button) findViewById(R.id.button7);
        botao2 = (Button) findViewById(R.id.button8);
        botao3 = (Button) findViewById(R.id.button9);
        botao4 = (Button) findViewById(R.id.button4);
        botao5 = (Button) findViewById(R.id.button5);
        botao6 = (Button) findViewById(R.id.button6);
        botao7 = (Button) findViewById(R.id.button);
        botao8 = (Button) findViewById(R.id.button2);
        botao9 = (Button) findViewById(R.id.button3);

        botaoMais = (Button) findViewById(R.id.button13);
        botaoMenos = (Button) findViewById(R.id.button14);
        botaoMult = (Button) findViewById(R.id.button15);
        botaoDiv = (Button) findViewById(R.id.button16);
        botaoIgual = (Button)findViewById(R.id.button12);



        campo1.setText("");
        campo2.setText("");
        resultado1="";
        resultado2="";
        operador.setText("");
    }

    public void ClickIgual(View view) {
        resul.setText("");
        if(campo1.getText().toString() == "" || campo2.getText().toString() == ""){
            resul.setText("Operação Inválida");

            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);
        }
       else{


               if ( operador.getText().toString() == "+"){
            res = Double.parseDouble(campo1.getText().toString()) + Double.parseDouble(campo2.getText().toString());
            resul.setText(""+res);
            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);

        }else if ( operador.getText().toString() == "-"){

            res = Double.parseDouble(campo1.getText().toString()) - Double.parseDouble(campo2.getText().toString());
            resul.setText(""+res);
            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);

        }else if ( operador.getText().toString() == "/"){

            res = Double.parseDouble(campo1.getText().toString()) / Double.parseDouble(campo2.getText().toString());
            resul.setText(""+res);
            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);

        }else if ( operador.getText().toString() == "*"){

            res = Double.parseDouble(campo1.getText().toString()) * Double.parseDouble(campo2.getText().toString());
            resul.setText(""+res);
            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);

        }else {
            if(campo1 == null || campo2 == null){
                resul.setText("Operação Inválida");
            }

            botao0.setEnabled(false);
            botao1.setEnabled(false);
            botao2.setEnabled(false);
            botao3.setEnabled(false);
            botao4.setEnabled(false);
            botao5.setEnabled(false);
            botao6.setEnabled(false);
            botao7.setEnabled(false);
            botao8.setEnabled(false);
            botao9.setEnabled(false);

            botaoMais.setEnabled(false);
            botaoMenos.setEnabled(false);
            botaoMult.setEnabled(false);
            botaoDiv.setEnabled(false);
            botaoIgual.setEnabled(false);
        }
        }
    }

    public void ClickMais(View view) {
        operador.setText("+");
    }
    public void ClickMenos(View view) {
        operador.setText("-");
    }
    public void ClickDividir(View view) {
        operador.setText("/");
    }
    public void ClickVezes(View view) {
        operador.setText("*");
 }

    public void Click0(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"0";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"0";
            campo2.setText(resultado2);
        }
    }
    public void Click7(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"7";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"7";
            campo2.setText(resultado2);
        }
    }
    public void Click8(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"8";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"8";
            campo2.setText(resultado2);
        }
    }
    public void Click9(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"9";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"9";
            campo2.setText(resultado2);
        }
    }
    public void Click4(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"4";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"4";
            campo2.setText(resultado2);
        }
    }
    public void Click5(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"5";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"5";
            campo2.setText(resultado2);
        }
    }
    public void Click6(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"6";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"6";
            campo2.setText(resultado2);
        }
    }
    public void Click1(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"1";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"1";
            campo2.setText(resultado2);
        }
    }
    public void Click2(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"2";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"2";
            campo2.setText(resultado2);
        }
    }
    public void Click3(View view) {
        if(operador.getText() == ""){
            resultado1 = resultado1+"3";
            campo1.setText(resultado1);
        }else{
            resultado2 = resultado2+"3";
            campo2.setText(resultado2);
        }
    }
    public void ClickC(View view) {
        campo1.setText("");
        campo2.setText("");
        resultado1="";
        resultado2="";
        operador.setText("");
        resul.setText("");

        botao0.setEnabled(true);
        botao1.setEnabled(true);
        botao2.setEnabled(true);
        botao3.setEnabled(true);
        botao4.setEnabled(true);
        botao5.setEnabled(true);
        botao6.setEnabled(true);
        botao7.setEnabled(true);
        botao8.setEnabled(true);
        botao9.setEnabled(true);

        botaoMais.setEnabled(true);
        botaoMenos.setEnabled(true);
        botaoMult.setEnabled(true);
        botaoDiv.setEnabled(true);
        botaoIgual.setEnabled(true);
    }
}
