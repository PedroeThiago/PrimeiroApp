package pedro.thiago.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.btn_enviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etDigiteAqui = findViewById(R.id.et_digiteaqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                /* declara uma intenção de mudar a tela*/
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                /*registra na memória os dados do input de texto*/
                i.putExtra("texto", textoDigitado);

                /* executa a intenção de mudar a tela*/
                startActivity(i);
            }
        });
    }
}