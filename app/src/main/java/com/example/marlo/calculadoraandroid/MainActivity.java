package com.example.marlo.calculadoraandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected TextView entrada;
    protected TextView resultado;
    protected Button btn0;
    protected Button btn1;
    protected Button btn2;
    protected Button btn3;
    protected Button btn4;
    protected Button btn5;
    protected Button btn6;
    protected Button btn7;
    protected Button btn8;
    protected Button btn9;
    protected Button btnSomar;
    protected Button btnSubtracao;
    protected Button btnMultiplicacao;
    protected Button btnDivisao;
    protected Button btnResultado;
    protected  Button btnclear;


    String concatenacao = "";

    double aux ;

    String tipo = "",aux1;

    Integer primeiro ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (TextView) findViewById(R.id.campoValor1);
        resultado = (TextView) findViewById(R.id.campoResposta);

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSubtracao = (Button) findViewById(R.id.btnSubtrair);
        btnDivisao = (Button) findViewById(R.id.btnDivisao);
        btnMultiplicacao = (Button) findViewById(R.id.btnMultiplicacao);
        btnclear = (Button) findViewById(R.id.btnLimpar);




        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "0";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "0";
                    entrada.setText(primeiro + tipo + concatenacao);

                }

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "1";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "1";
                    entrada.setText(primeiro + tipo + concatenacao);

                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "2";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "2";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "3";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "3";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "4";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "4";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "5";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "5";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "6";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "6";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "7";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "7";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "8";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "8";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(primeiro == null) {
                    concatenacao += "9";
                    entrada.setText(concatenacao);
                }else{
                    concatenacao += "9";
                    entrada.setText(primeiro + tipo + concatenacao);

                }
            }
        });

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = "+";
                primeiro = Integer.parseInt(concatenacao);
                concatenacao  = "";
                entrada.setText(concatenacao + "+");
            }
        });

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = "-";
                primeiro = Integer.parseInt(concatenacao);
                concatenacao  = "";
                entrada.setText(concatenacao + "-");
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = "/";
                primeiro = Integer.parseInt(concatenacao);
                concatenacao  = "";
                entrada.setText(concatenacao + "/");
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tipo = "*";
                primeiro = Integer.parseInt(concatenacao);
                concatenacao  = "";
                entrada.setText(concatenacao + "*");
            }
        });


        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               primeiro = null;
               tipo = "";
               concatenacao = "";

               entrada.setText("");
               aux1 = "";
                resultado.setText(aux1);

            }
        });










    }

    public void RespostaValor(View view) {

        if(tipo.equals("+")) {
            aux = primeiro + (Double.parseDouble(concatenacao));
            // aux = Double.parseDouble(concatenacao);
            String aux1 = String.valueOf(aux);
            System.out.println(aux1);
            resultado.setText(aux1);
        }

        if(tipo.equals("-")) {
            aux = primeiro - (Double.parseDouble(concatenacao));
            // aux = Double.parseDouble(concatenacao);
            String aux1 = String.valueOf(aux);
            System.out.println(aux1);
            resultado.setText(aux1);
        }

        if(tipo.equals("/")) {
            aux = primeiro / (Double.parseDouble(concatenacao));
            // aux = Double.parseDouble(concatenacao);
            String aux1 = String.valueOf(aux);
            System.out.println(aux1);
            resultado.setText(aux1);
        }

        if(tipo.equals("*")) {
            aux = primeiro * (Double.parseDouble(concatenacao));
            // aux = Double.parseDouble(concatenacao);
             aux1 = String.valueOf(aux);
            System.out.println(aux1);
            resultado.setText(aux1);
        }
    }
}
