package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.calculadorasimples.R;

public class MainActivity extends AppCompatActivity {

    private Button btnSoma, btnDiv, btnMulti, btnSub, btnLimpa;
    private EditText n1,n2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //Aqui instanciamos os Widgets, ou seja, criamos uma variável para um deles
        btnSoma = findViewById(R.id.btnSomar);
        btnDiv = findViewById(R.id.btnDividir);
        btnMulti = findViewById(R.id.btnMultiplicar);
        btnSub = findViewById(R.id.btnSubtrair);
        btnLimpa = findViewById(R.id.btnLimpar);

        n1 = findViewById(R.id.editTextN1);
        n2 = findViewById(R.id.editTextN2);
        resultado = findViewById(R.id.textViewResultado);
    }

    //Agora vamos criar os métodos ou ações que cada botão irá fazer ao ser clicado/acionado

    public void Somar(View view){

        //Aqui estamos pegando os valores dos campos onde o usuário terá inserido os números e assim eles eles estão em formato de CARACTERES (String)

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        //Vamos transformar os caracteres em números para assim conseguirmos fazer as operações desejadas
        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        //Aqui realizamos a operação já com ambos em formato de número (DOUBLE)
        Double E = C + D;

        //E por último vamos colocar o resultado da conta acima na caixa de texto, e para isso temos que transformar o número em carácter, ou seja, em String novamente.
        resultado.setText(E.toString());
    }

    public void Subtrair(View view){

        //Aqui estamos pegando os valores dos campos onde o usuário terá inserido os números e assim eles eles estão em formato de CARACTERES (String)

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        //Vamos transformar os caracteres em números para assim conseguirmos fazer as operações desejadas
        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        //Aqui realizamos a operação já com ambos em formato de número (DOUBLE)
        Double E = C - D;

        //E por último vamos colocar o resultado da conta acima na caixa de texto, e para isso temos que transformar o número em carácter, ou seja, em String novamente.
        resultado.setText(E.toString());
    }

    public void Multiplicar(View view){

        //Aqui estamos pegando os valores dos campos onde o usuário terá inserido os números e assim eles eles estão em formato de CARACTERES (String)

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        //Vamos transformar os caracteres em números para assim conseguirmos fazer as operações desejadas
        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        //Aqui realizamos a operação já com ambos em formato de número (DOUBLE)
        Double E = C * D;

        //E por último vamos colocar o resultado da conta acima na caixa de texto, e para isso temos que transformar o número em carácter, ou seja, em String novamente.
        resultado.setText(E.toString());
    }

    public void Dividir(View view){

        //Aqui estamos pegando os valores dos campos onde o usuário terá inserido os números e assim eles eles estão em formato de CARACTERES (String)

        String A = n1.getText().toString().trim();
        String B = n2.getText().toString().trim();

        //Vamos transformar os caracteres em números para assim conseguirmos fazer as operações desejadas
        Double C = Double.parseDouble(A);
        Double D = Double.parseDouble(B);

        //Aqui realizamos a operação já com ambos em formato de número (DOUBLE)
        Double E = C / D;

        //E por último vamos colocar o resultado da conta acima na caixa de texto, e para isso temos que transformar o número em carácter, ou seja, em String novamente.
        resultado.setText(E.toString());
    }

    public void Limpar (View view){

        //Aqui vamos "setar" o texto para vazio nos campos desejados
        n1.setText("");
        n2.setText("");
        resultado.setText("");
    }


}
