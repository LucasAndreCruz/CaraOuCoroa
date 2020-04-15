package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imagemResultado;
    private TextView textViewResultado;
    private Button botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemResultado = findViewById(R.id.imagemResultado);
        botaoVoltar = findViewById(R.id.BotaoVoltar);
        textViewResultado = findViewById(R.id.textResultado);

        // recuperar os dados enviados

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        //configurando valores recuperadoes

        if(numero == 0 ){
            imagemResultado.setImageResource(R.drawable.moeda_cara);
            textViewResultado.setText(" CARA ");
        }else if(numero == 1){
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
            textViewResultado.setText(" COROA ");
        }

        //botao voltar para activity main

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
