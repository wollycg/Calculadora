package com.facisa.oliver.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnZero, btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis, btnSete, btnOito,
            btnNove, btnIgual, btnSoma, btnSubtrai, btnMultiplica, btnDivide, btnLimpa;
    TextView etProceso, etconcatenar;
    double numero1, numero2, resultado;
    String operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpa = (Button)findViewById(R.id.btnLimpa);
        btnZero = (Button)findViewById(R.id.btnZero);
        btnUm = (Button)findViewById(R.id.btnUm);
        btnDois = (Button)findViewById(R.id.btnDois);
        btnTres = (Button)findViewById(R.id.btnTres);
        btnQuatro = (Button)findViewById(R.id.btnQuatro);
        btnCinco = (Button)findViewById(R.id.btnCinco);
        btnSeis = (Button)findViewById(R.id.btnSeis);
        btnSete = (Button)findViewById(R.id.btnSete);
        btnOito = (Button)findViewById(R.id.btnOito);
        btnNove = (Button)findViewById(R.id.btnNove);
        btnIgual = (Button)findViewById(R.id.btnIgual);
        btnSoma = (Button)findViewById(R.id.btnSoma);
        btnSubtrai = (Button)findViewById(R.id.btnSubtrai);
        btnMultiplica = (Button)findViewById(R.id.btnMultiplica);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        etProceso = (TextView) findViewById(R.id.etProceso);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        });
        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");

            }
        });
        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        });
        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        });
        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        });
        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        });
        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (TextView)findViewById(R.id.etProceso);
                numero2 = Double.parseDouble(etconcatenar.getText().toString());
                if(operador.equals("+")){
                    etProceso.setText("");
                    resultado = numero1 + numero2;
                }
                if(operador.equals("-")){
                    etProceso.setText("");
                    resultado = numero1 - numero2;
                }
                if(operador.equals("*")){
                    etProceso.setText("");
                    resultado = numero1 * numero2;
                }
                if(operador.equals("/")){
                    etProceso.setText("");
                    if(numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        etProceso.setText("Infinito");
                    }
                }
                etProceso.setText(String.valueOf(resultado));
            }
        });
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                etconcatenar = (TextView)findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                etconcatenar = (TextView) findViewById(R.id.etProceso);
                numero1 = Double.parseDouble(etconcatenar.getText().toString());
                etProceso.setText("");
            }
        });
        btnLimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                etProceso.setText("");
            }
        });
    }
}
